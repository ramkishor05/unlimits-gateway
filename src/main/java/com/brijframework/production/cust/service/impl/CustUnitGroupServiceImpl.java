package com.brijframework.production.cust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.cust.dto.UICustUnitGroup;
import com.brijframework.production.cust.mapper.CustUnitGroupMapper;
import com.brijframework.production.cust.repository.CustUnitGroupRepository;
import com.brijframework.production.cust.service.CustUnitGroupService;

@Service
public class CustUnitGroupServiceImpl implements CustUnitGroupService {
	
	@Autowired
	CustUnitGroupRepository custUnitGroupRepository;
	
	@Autowired
	CustUnitGroupMapper custUnitGroupMapper;


	@Override
	public UICustUnitGroup saveUnitGroup(long custAppId, UICustUnitGroup uiCustUnitGroup) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UICustUnitGroup updateUnitGroup(long custAppId, UICustUnitGroup uiCustUnitGroup) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UICustUnitGroup> getUnitGroupList(long custAppId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UICustUnitGroup> getUnitGroupList(long custAppId, String typeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
