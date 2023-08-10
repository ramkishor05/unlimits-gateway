package com.brijframework.production.service.cust.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.entities.EOCustomer;
import com.brijframework.production.entities.cust.EOCustProduct;
import com.brijframework.production.entities.cust.EOCustProductRetailSale;
import com.brijframework.production.entities.cust.EOCustProductSale;
import com.brijframework.production.entities.cust.EOCustProductWholeSale;
import com.brijframework.production.entities.cust.EOCustProductionApp;
import com.brijframework.production.entities.cust.EOCustUnit;
import com.brijframework.production.mapper.cust.CustProductSaleRequestMapper;
import com.brijframework.production.mapper.cust.CustProductSaleResponseMapper;
import com.brijframework.production.repository.CustomerRepository;
import com.brijframework.production.repository.cust.CustProductRepository;
import com.brijframework.production.repository.cust.CustProductRetailSaleRepository;
import com.brijframework.production.repository.cust.CustProductSaleRepository;
import com.brijframework.production.repository.cust.CustProductWholeSaleRepository;
import com.brijframework.production.repository.cust.CustProductionAppRepository;
import com.brijframework.production.repository.cust.CustUnitRepository;
import com.brijframework.production.rest.cust.CustProductRetailSaleRequest;
import com.brijframework.production.rest.cust.CustProductSaleRequest;
import com.brijframework.production.rest.cust.CustProductSaleResponse;
import com.brijframework.production.rest.cust.CustProductWholeSaleRequest;
import com.brijframework.production.service.cust.CustProductSaleService;
import com.brijframework.production.util.CommanUtil;

@Service
public class CustProductSaleServiceImpl implements CustProductSaleService {
	
	
	private static final String CSL = "CSL";

	@Autowired
	private CustProductSaleRepository custProductSaleRepository;
	
	@Autowired
	private CustProductRetailSaleRepository custProductRetailSaleRepository;
	
	@Autowired
	private CustProductWholeSaleRepository custProductWholeSaleRepository;
	
	@Autowired
	private  CustProductionAppRepository custProductionAppRepository;
	
	@Autowired
	private CustUnitRepository custUnitRepository;
	
	@Autowired
	private CustProductRepository custProductRepository;
	
	@Autowired
	private CustProductSaleRequestMapper custProductSaleRequestMapper;
	
	@Autowired
	private CustProductSaleResponseMapper custProductSaleResponseMapper; 
	
	@Autowired
	private CustomerRepository customerRepository;

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
		
		EOCustomer eoCustomer = customerRepository.findById(custProductSaleRequest.getCustomerId()).orElseThrow(()-> new RuntimeException("Customer not fond"));
		
		EOCustProductSale eoCustProductSale = custProductSaleRequestMapper.mapToDAO(custProductSaleRequest);
		eoCustProductSale.setCustomer(eoCustomer);
		eoCustProductSale.setIdenNo(CommanUtil. getIdenNo(CSL));
		eoCustProductSale.setCustProductionApp(eoCustProductionApp);
		eoCustProductSale = custProductSaleRepository.saveAndFlush(eoCustProductSale);
		
		for(CustProductRetailSaleRequest custProductRetailSaleUi : custProductRetailSaleList){
			EOCustProductRetailSale eoCustProductRetailSale = custProductSaleRequestMapper.mapToDAO(custProductRetailSaleUi);
			EOCustUnit purchaseUnit = custUnitRepository.getOne(custProductRetailSaleUi.getPurchaseUnitId());
			eoCustProductRetailSale.setPurchaseUnit(purchaseUnit);
			EOCustUnit retialUnit = custUnitRepository.getOne(custProductRetailSaleUi.getRetailUnitId());
			eoCustProductRetailSale.setRetailUnit(retialUnit);
			eoCustProductRetailSale.setCustProductSale(eoCustProductSale);
			EOCustProduct eoCustProduct = custProductRepository.findById(custProductRetailSaleUi.getCustProductId()).orElse(null);
			eoCustProductRetailSale.setCustProduct(eoCustProduct);
			
			custProductRetailSaleRepository.saveAndFlush(eoCustProductRetailSale);
		}
		
		for (CustProductWholeSaleRequest custProductWholeSaleRequest : custProductWholeSaleList) {
			EOCustProductWholeSale custProductWholeSale = custProductSaleRequestMapper.mapToDAO(custProductWholeSaleRequest);
			EOCustUnit purchaseUnit = custUnitRepository.getOne(custProductWholeSaleRequest.getPurchaseUnitId());
			custProductWholeSale.setPurchaseUnit(purchaseUnit);
			EOCustUnit wholeUnit = custUnitRepository.getOne(custProductWholeSaleRequest.getWholeUnitId());
			custProductWholeSale.setWholeUnit(wholeUnit);
			custProductWholeSale.setCustProductSale(eoCustProductSale);
			EOCustProduct eoCustProduct = custProductRepository.findById(custProductWholeSaleRequest.getCustProductId()).orElse(null);
			custProductWholeSale.setCustProduct(eoCustProduct);
			
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
