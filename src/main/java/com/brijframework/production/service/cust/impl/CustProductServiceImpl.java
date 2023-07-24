package com.brijframework.production.service.cust.impl;

import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.CommanUtil;
import com.brijframework.production.dto.cust.UICustProduct;
import com.brijframework.production.entities.cust.EOCustProduct;
import com.brijframework.production.entities.cust.EOCustProductionApp;
import com.brijframework.production.mapper.cust.CustProductMapper;
import com.brijframework.production.repository.cust.CustProductRepository;
import com.brijframework.production.repository.cust.CustProductionAppRepository;
import com.brijframework.production.service.cust.CustProductService;

@Service
public class CustProductServiceImpl implements CustProductService {
	
	private static final String PO = "PO";

	@Autowired
	CustProductionAppRepository inventoryApplicationRepository;
	
	@Autowired
	CustProductRepository inventoryProductRepository;
	
	@Autowired
	CustProductMapper inventoryProductMapper;
	
	@Override
	public UICustProduct saveProduct(long inventoryAppId, UICustProduct Product) {
		Optional<EOCustProductionApp> findById = inventoryApplicationRepository.findById(inventoryAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return saveProduct(findById.get(), Product);
	}
	
	@Override
	public UICustProduct saveProduct(UICustProduct Product) {
		Optional<EOCustProductionApp> findById = inventoryApplicationRepository.findById(Product.getCustProductionAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return saveProduct(findById.get(), Product);
	}
	
	@Override
	public UICustProduct saveProduct(EOCustProductionApp eoInventoryApp,UICustProduct Product) {
		EOCustProduct eoProduct=inventoryProductMapper.mapToDAO(Product);
		eoProduct.setCustProductionApp(eoInventoryApp);
		eoProduct.setIdenNo(CommanUtil. getIdenNo(PO));
		inventoryProductRepository.save(eoProduct);
		return inventoryProductMapper.mapToDTO(eoProduct);
	}
	
	@Override
	public UICustProduct updateProduct(long inventoryAppId, UICustProduct product) {
		Optional<EOCustProductionApp> findById = inventoryApplicationRepository.findById(inventoryAppId);
		if(!findById.isPresent()) {
			return null;
		}
		EOCustProductionApp eoInventoryApp = findById.get();
		Optional<EOCustProduct> findProduct = inventoryProductRepository.findById(product.getId());
		if(!findProduct.isPresent()) {
			return null;
		}
		EOCustProduct eoGlobalProduct = findProduct.get();
		BeanUtils.copyProperties(product, eoGlobalProduct);
		eoGlobalProduct.setCustProductionApp(eoInventoryApp);
        eoGlobalProduct.setIdenNo(StringUtils.isEmpty(eoGlobalProduct.getIdenNo()) ? CommanUtil. getIdenNo(PO) : eoGlobalProduct.getIdenNo());
        //eoGlobalProduct.setIdenNo(getIdenNo());
		inventoryProductRepository.save(eoGlobalProduct);
		return inventoryProductMapper.mapToDTO(eoGlobalProduct);
	}
	
	@Override
	public UICustProduct getProduct(long id) {
		return inventoryProductMapper.mapToDTO(inventoryProductRepository.getOne(id));
	}

	@Override
	public List<UICustProduct> getProductList(long inventoryAppId) {
		return inventoryProductMapper.mapToDTO(inventoryProductRepository.findAllByCustProductionAppId(inventoryAppId));
	}

	@Override
	public UICustProduct getProduct(long inventoryAppId, String typeId) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
