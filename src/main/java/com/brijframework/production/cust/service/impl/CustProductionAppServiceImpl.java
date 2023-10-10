package com.brijframework.production.cust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.cust.dto.UICustProductionApp;
import com.brijframework.production.cust.dto.UICustProductionAppDetail;
import com.brijframework.production.cust.entities.EOCustProductionApp;
import com.brijframework.production.cust.mapper.CustProductionAppDetailMapper;
import com.brijframework.production.cust.mapper.CustProductionAppMapper;
import com.brijframework.production.cust.repository.CustProductionAppRepository;
import com.brijframework.production.cust.service.CustProductionAppService;

@Service
public class CustProductionAppServiceImpl implements CustProductionAppService {
	
	@Autowired
	private CustProductionAppRepository custProductionAppRepository;
	
	@Autowired
	private CustProductionAppMapper  custProductionAppMapper;
	
	@Autowired
	private CustProductionAppDetailMapper custProductionAppDetailMapper;
	
	@Override
	public UICustProductionApp saveInventoryApp(UICustProductionApp inventory) {
		EOCustProductionApp eoInventoryApp=new EOCustProductionApp();
		eoInventoryApp.setId(inventory.getId());
		eoInventoryApp.setAppid(inventory.getAppid());
		eoInventoryApp.setCustId(inventory.getCustId());
		custProductionAppRepository.save(eoInventoryApp);
		return custProductionAppMapper.mapToDTO(eoInventoryApp);
	}

	@Override
	public UICustProductionApp getInventoryApp(long id) {
		return custProductionAppMapper.mapToDTO( custProductionAppRepository.findById(id).orElseThrow(()-> new RuntimeException("Not fond")) );
	}

	@Override
	public boolean deleteInventoryApp(long id) {
		return false;
	}

	@Override
	public List<UICustProductionApp> getInventoryAppList() {
		return null;
	}

	@Override
	public UICustProductionAppDetail getInventoryAppDetail(long id) {
		return custProductionAppDetailMapper.mapToDTO( custProductionAppRepository.findById(id).orElseThrow(()-> new RuntimeException("Not fond")) );

	}
}
