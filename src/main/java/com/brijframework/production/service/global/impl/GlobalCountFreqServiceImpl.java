package com.brijframework.production.service.global.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.entities.global.EOGlobalCountFreq;
import com.brijframework.production.mapper.global.GlobalCountFreqMapper;
import com.brijframework.production.mapper.global.GlobalCountFreqRequestMapper;
import com.brijframework.production.mapper.global.GlobalCountFreqResponseMapper;
import com.brijframework.production.repository.cust.CustProductionAppRepository;
import com.brijframework.production.repository.global.GlobalCountFreqRepository;
import com.brijframework.production.rest.global.GlobalCountFreqRequest;
import com.brijframework.production.rest.global.GlobalCountFreqResponse;
import com.brijframework.production.service.global.GlobalCountFreqService;

@Service
public class GlobalCountFreqServiceImpl implements GlobalCountFreqService {
	
	@Autowired
	CustProductionAppRepository custProductionAppRepository;
	
	@Autowired
	GlobalCountFreqRepository countFreqRepository;
	
	@Autowired
	GlobalCountFreqMapper globalCountFreqMapper;
	
	@Autowired
	GlobalCountFreqRequestMapper globalCountFreqRequestMapper;
	
	@Autowired
	GlobalCountFreqResponseMapper globalCountFreqResponseMapper;
	
	@Override
	public GlobalCountFreqResponse saveCountFreq(GlobalCountFreqRequest globalCountFreqRequest) {
		EOGlobalCountFreq eoCountFreq=globalCountFreqRequestMapper.mapToDAO(globalCountFreqRequest);
		countFreqRepository.save(eoCountFreq);
		return globalCountFreqResponseMapper.mapToDTO(eoCountFreq);
	}

	@Override
	public GlobalCountFreqResponse getCountFreq(long id) {
		return globalCountFreqResponseMapper.mapToDTO(countFreqRepository.getOne(id));
	}

	@Override
	public List<GlobalCountFreqResponse> getCountFreqList() {
		return globalCountFreqResponseMapper.mapToDTO(countFreqRepository.findAll());
	}

	@Override
	public GlobalCountFreqResponse getCountFreq(String typeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
