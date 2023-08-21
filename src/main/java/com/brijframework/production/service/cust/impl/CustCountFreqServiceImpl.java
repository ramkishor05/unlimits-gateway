package com.brijframework.production.service.cust.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.entities.cust.EOCustCountFreq;
import com.brijframework.production.entities.cust.EOCustProductionApp;
import com.brijframework.production.mapper.cust.CustCountFreqRequestMapper;
import com.brijframework.production.mapper.cust.CustCountFreqResponseMapper;
import com.brijframework.production.repository.cust.CustCountFreqRepository;
import com.brijframework.production.repository.cust.CustProductionAppRepository;
import com.brijframework.production.rest.cust.CustCountFreqRequest;
import com.brijframework.production.rest.cust.CustCountFreqResponse;
import com.brijframework.production.service.cust.CustCountFreqService;

@Service
public class CustCountFreqServiceImpl implements CustCountFreqService {
	
	@Autowired
	private CustProductionAppRepository custProductionAppRepository;
	
	@Autowired
	private CustCountFreqRepository custCountFreqRepository;
	
	@Autowired
	private CustCountFreqRequestMapper custCountFreqRequestMapper;
	
	@Autowired
	private CustCountFreqResponseMapper custCountFreqResponseMapper;

	@Override
	public CustCountFreqResponse saveCountFreq(long custAppId, CustCountFreqRequest custCountFreqRequest) {
		Optional<EOCustProductionApp> findById = custProductionAppRepository.findById(custAppId);
		if(!findById.isPresent()) {
			return null;
		}
		EOCustProductionApp eoCustProductionApp = findById.get();
		EOCustCountFreq saveCountFreq = saveCountFreq(custCountFreqRequest, eoCustProductionApp);
		return custCountFreqResponseMapper.mapToDTO(saveCountFreq);
	}

	private EOCustCountFreq saveCountFreq(CustCountFreqRequest custCountFreqRequest,
			EOCustProductionApp eoCustProductionApp) {
		EOCustCountFreq eoCustCountFreq = custCountFreqRequestMapper.mapToDAO(custCountFreqRequest);
		eoCustCountFreq.setCustProductionApp(eoCustProductionApp);
		eoCustCountFreq = custCountFreqRepository.save(eoCustCountFreq);
		return eoCustCountFreq;
	}

	@Override
	public List<CustCountFreqResponse> getCountFreqList(long custAppId) {
		return custCountFreqResponseMapper.mapToDTO(custCountFreqRepository.findAllByCustAppId(custAppId));
	}

	@Override
	public List<CustCountFreqResponse> getCountFreq(long custAppId, String typeId) {
		return custCountFreqResponseMapper.mapToDTO(custCountFreqRepository.findAllByCustAppIdAndTypeId(custAppId, typeId));
	}

}
