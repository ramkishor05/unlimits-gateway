package com.brijframework.production.service.cust.impl;

import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.entities.cust.EOCustProduct;
import com.brijframework.production.entities.cust.EOCustProductionApp;
import com.brijframework.production.mapper.cust.CustProductRequestMapper;
import com.brijframework.production.mapper.cust.CustProductResponseMapper;
import com.brijframework.production.repository.cust.CustProductRepository;
import com.brijframework.production.repository.cust.CustProductionAppRepository;
import com.brijframework.production.rest.cust.CustProductRequest;
import com.brijframework.production.rest.cust.CustProductResponse;
import com.brijframework.production.service.cust.CustProductService;
import com.brijframework.production.util.CommanUtil;

@Service
public class CustProductServiceImpl implements CustProductService {
	
	private static final String PO = "PO";

	@Autowired
	CustProductionAppRepository custProductionAppRepository;
	
	@Autowired
	CustProductRepository custProductRepository;
	
	@Autowired
	CustProductRequestMapper custProductRequestMapper;
	
	@Autowired
	CustProductResponseMapper custProductResponseMapper;
	
	@Override
	public CustProductResponse saveProduct(long custAppId, CustProductRequest custProductRequest) {
		Optional<EOCustProductionApp> findById = custProductionAppRepository.findById(custAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return saveProduct(findById.get(), custProductRequest);
	}
	
	@Override
	public CustProductResponse saveProduct(CustProductRequest custProductRequest) {
		Optional<EOCustProductionApp> findById = custProductionAppRepository.findById(custProductRequest.getCustProductionAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return saveProduct(findById.get(), custProductRequest);
	}
	
	@Override
	public CustProductResponse saveProduct(EOCustProductionApp custProductionApp,CustProductRequest custProductRequest) {
		EOCustProduct eoProduct=custProductRequestMapper.mapToDAO(custProductRequest);
		eoProduct.setCustProductionApp(custProductionApp);
		eoProduct.setIdenNo(CommanUtil. getIdenNo(PO));
		custProductRepository.save(eoProduct);
		return custProductResponseMapper.mapToDTO(eoProduct);
	}
	
	@Override
	public CustProductResponse updateProduct(long custAppId, CustProductRequest custProductRequest) {
		Optional<EOCustProductionApp> findById = custProductionAppRepository.findById(custAppId);
		if(!findById.isPresent()) {
			return null;
		}
		EOCustProductionApp eoInventoryApp = findById.get();
		Optional<EOCustProduct> findProduct = custProductRepository.findById(custProductRequest.getId());
		if(!findProduct.isPresent()) {
			return null;
		}
		EOCustProduct eoGlobalProduct = findProduct.get();
		BeanUtils.copyProperties(custProductRequest, eoGlobalProduct);
		eoGlobalProduct.setCustProductionApp(eoInventoryApp);
        eoGlobalProduct.setIdenNo(StringUtils.isEmpty(eoGlobalProduct.getIdenNo()) ? CommanUtil. getIdenNo(PO) : eoGlobalProduct.getIdenNo());
        //eoGlobalProduct.setIdenNo(getIdenNo());
		custProductRepository.save(eoGlobalProduct);
		return custProductResponseMapper.mapToDTO(eoGlobalProduct);
	}
	
	@Override
	public CustProductResponse getProduct(long id) {
		return custProductResponseMapper.mapToDTO(custProductRepository.getOne(id));
	}

	@Override
	public List<CustProductResponse> getProductList(long inventoryAppId) {
		return custProductResponseMapper.mapToDTO(custProductRepository.findAllByCustProductionAppId(inventoryAppId));
	}

	@Override
	public CustProductResponse getProduct(long inventoryAppId, String typeId) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
