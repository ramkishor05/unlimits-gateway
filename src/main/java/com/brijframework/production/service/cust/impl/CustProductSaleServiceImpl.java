package com.brijframework.production.service.cust.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.entities.cust.EOCustProductRetailSale;
import com.brijframework.production.entities.cust.EOCustProductSale;
import com.brijframework.production.entities.cust.EOCustProductWholeSale;
import com.brijframework.production.entities.cust.EOCustProductionApp;
import com.brijframework.production.mapper.cust.CustProductSaleRequestMapper;
import com.brijframework.production.mapper.cust.CustProductSaleResponseMapper;
import com.brijframework.production.repository.cust.CustProductRetailSaleRepository;
import com.brijframework.production.repository.cust.CustProductSaleRepository;
import com.brijframework.production.repository.cust.CustProductWholeSaleRepository;
import com.brijframework.production.repository.cust.CustProductionAppRepository;
import com.brijframework.production.rest.cust.CustProductRetailSaleRequest;
import com.brijframework.production.rest.cust.CustProductSaleRequest;
import com.brijframework.production.rest.cust.CustProductSaleResponse;
import com.brijframework.production.rest.cust.CustProductWholeSaleRequest;
import com.brijframework.production.service.cust.CustProductSaleService;

@Service
public class CustProductSaleServiceImpl implements CustProductSaleService {
	
	
	@Autowired
	private CustProductSaleRepository custProductSaleRepository;
	
	@Autowired
	private CustProductRetailSaleRepository custProductRetailSaleRepository;
	
	@Autowired
	private CustProductWholeSaleRepository custProductWholeSaleRepository;
	
	@Autowired
	CustProductionAppRepository custProductionAppRepository;
	
	@Autowired
	private CustProductSaleRequestMapper custProductSaleRequestMapper;
	
	@Autowired
	private CustProductSaleResponseMapper custProductSaleResponseMapper; 

	@Override
	public CustProductSaleResponse saveProductSale(long custAppId, CustProductSaleRequest custProductSaleRequest) {
		Optional<EOCustProductionApp> findById = custProductionAppRepository.findById(custAppId);
		if(!findById.isPresent()) {
			return null;
		}
		EOCustProductionApp eoCustProductionApp = findById.get();
		List<CustProductRetailSaleRequest> custProductRetailSaleList = custProductSaleRequest.getCustProductRetailSaleList();
		List<CustProductWholeSaleRequest> custProductWholeSaleList = custProductSaleRequest.getCustProductWholeSaleList();
		
		custProductSaleRequest.setCustProductRetailSaleList(null);
		custProductSaleRequest.setCustProductWholeSaleList(null);
		
		EOCustProductSale eoCustProductSale = custProductSaleRequestMapper.mapToDAO(custProductSaleRequest);
		eoCustProductSale.setCustProductionApp(eoCustProductionApp);
		eoCustProductSale = custProductSaleRepository.saveAndFlush(eoCustProductSale);
		
		for(CustProductRetailSaleRequest custProductRetailSaleUi : custProductRetailSaleList){
			EOCustProductRetailSale eoCustProductRetailSale = custProductSaleRequestMapper.mapToDAO(custProductRetailSaleUi);
			eoCustProductRetailSale.setCustProductSale(eoCustProductSale);
			custProductRetailSaleRepository.saveAndFlush(eoCustProductRetailSale);
		}
		
		for (CustProductWholeSaleRequest custProductWholeSaleRequest : custProductWholeSaleList) {
			EOCustProductWholeSale custProductWholeSale = custProductSaleRequestMapper.mapToDAO(custProductWholeSaleRequest);
			custProductWholeSale.setCustProductSale(eoCustProductSale);
			custProductWholeSaleRepository.saveAndFlush(custProductWholeSale);
		}
		
		return custProductSaleResponseMapper.mapToDTO(eoCustProductSale);
	}

	@Override
	public CustProductSaleResponse updateProductSale(long custAppId, CustProductSaleRequest custProductSaleRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustProductSaleResponse> getProductSaleList(long custAppId) {
		return custProductSaleResponseMapper.mapToDTO(custProductSaleRepository.findAllByCustProductionAppId(custAppId));
	}

	@Override
	public CustProductSaleResponse getProductSale(long custAppId, String typeId) {
		return custProductSaleResponseMapper.mapToDTO(custProductSaleRepository.findByCustProductionAppIdAndTypeId(custAppId, typeId));
	}

	@Override
	public List<CustProductSaleResponse> filterProductSaleList(long custAppId, LocalDateTime fromDate,
			LocalDateTime toDate) {
		LocalDateTime toDateOf = LocalDateTime.of(toDate.getYear(), toDate.getMonth(), toDate.getDayOfMonth(), 23, 59,59);
		return custProductSaleResponseMapper.mapToDTO(custProductSaleRepository.filterProductSaleList(custAppId, fromDate, toDateOf));
	}

}
