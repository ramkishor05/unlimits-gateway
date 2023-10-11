package com.brijframework.production.cust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.cust.dto.UICustUnit;
import com.brijframework.production.cust.entities.EOCustUnit;
import com.brijframework.production.cust.mapper.CustUnitMapper;
import com.brijframework.production.cust.repository.CustUnitRepository;
import com.brijframework.production.cust.service.CustUnitService;

@Service
public class CustUnitServiceImpl implements CustUnitService {
	
	@Autowired
	CustUnitRepository custUnitRepository;
	
	@Autowired
	CustUnitMapper custUnitMapper;

	@Override
	public UICustUnit saveUnit(long custAppId, UICustUnit uiCustUnit) {
		EOCustUnit eoCustUnit = custUnitMapper.mapToDAO(uiCustUnit);
		eoCustUnit = custUnitRepository.save(eoCustUnit);
		return custUnitMapper.mapToDTO(eoCustUnit);
	}

	@Override
	public UICustUnit updateUnit(long custAppId, Long id, UICustUnit uiCustUnit) {
		EOCustUnit eoCustUnit = custUnitMapper.mapToDAO(uiCustUnit);
		eoCustUnit = custUnitRepository.save(eoCustUnit);
		return custUnitMapper.mapToDTO(eoCustUnit);
	}

	@Override
	public List<UICustUnit> getUnitList(long custAppId) {
		return custUnitMapper.mapToDTO(custUnitRepository.findByCustAppId(custAppId));
	}

}
