package com.brijframework.production.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.dto.UIBusiness;
import com.brijframework.production.dto.UIBusinessDetail;
import com.brijframework.production.entities.EOBusiness;
import com.brijframework.production.mapper.BusinessDetailMapper;
import com.brijframework.production.mapper.BusinessMapper;
import com.brijframework.production.repository.BusinessRepository;
import com.brijframework.production.service.BusinessService;

@Service
public class BusinessServiceImpl implements BusinessService {
	
	@Autowired
	private BusinessRepository businessRepository; 
	
	@Autowired
	private BusinessMapper  businessMapper;
	
	@Autowired
	private BusinessDetailMapper businessDetailMapper;
	
	@Override
	public UIBusiness saveBusiness(Long vendorId, UIBusiness uiBusiness) {
		EOBusiness eoBusiness=businessMapper.mapToDAO(uiBusiness);
		businessRepository.save(eoBusiness);
		return businessMapper.mapToDTO(eoBusiness);
	}

	@Override
	public UIBusiness getBusiness(Long id) {
		return businessMapper.mapToDTO( businessRepository.findById(id).orElseThrow(()-> new RuntimeException("Not fond")) );
	}

	@Override
	public boolean deleteBusiness(Long id) {
		EOBusiness eoBusiness = businessRepository.findById(id).orElseThrow(()-> new RuntimeException("Not fond")) ;
		eoBusiness.setRecordState(false);
		businessRepository.save(eoBusiness);
		return true;
	}

	@Override
	public List<UIBusiness> getBusinessList(Long vendorId) {
		return businessMapper.mapToDTO( businessRepository.findByVendorId(vendorId).orElseThrow(()-> new RuntimeException("Not fond")) );
	}

	@Override
	public UIBusinessDetail getBusinessDetail(Long id) {
		return businessDetailMapper.mapToDTO( businessRepository.findById(id).orElseThrow(()-> new RuntimeException("Not fond")) );
	}

}
