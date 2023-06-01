package com.brijframework.production.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.dto.UIGlobalCountFreq;
import com.brijframework.production.entities.EOGlobalCountFreq;
import com.brijframework.production.mapper.GlobalCountFreqMapper;
import com.brijframework.production.repository.GlobalCountFreqRepository;
import com.brijframework.production.repository.cust.CustProductionAppRepository;
import com.brijframework.production.service.GlobalCountFreqService;

@Service
public class GlobalCountFreqServiceImpl implements GlobalCountFreqService {
	
	@Autowired
	CustProductionAppRepository inventoryApplicationRepository;
	
	@Autowired
	GlobalCountFreqRepository countFreqRepository;
	
	@Autowired
	GlobalCountFreqMapper inventoryCountFreqMapper;
	
	@Override
	public UIGlobalCountFreq saveCountFreq(UIGlobalCountFreq countFreq) {
		EOGlobalCountFreq eoCountFreq=inventoryCountFreqMapper.mapToDAO(countFreq);
		countFreqRepository.save(eoCountFreq);
		return inventoryCountFreqMapper.mapToDTO(eoCountFreq);
	}

	@Override
	public UIGlobalCountFreq getCountFreq(long id) {
		return inventoryCountFreqMapper.mapToDTO(countFreqRepository.getOne(id));
	}

	@Override
	public List<UIGlobalCountFreq> getCountFreqList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UIGlobalCountFreq getCountFreq(String typeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
