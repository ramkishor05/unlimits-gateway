package com.brijframework.production.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.dto.UIVendor;
import com.brijframework.production.dto.UIVendorDetail;
import com.brijframework.production.entities.EOVendor;
import com.brijframework.production.mapper.VendorDetailMapper;
import com.brijframework.production.mapper.VendorMapper;
import com.brijframework.production.repository.VendorRepository;
import com.brijframework.production.service.VendorService;

@Service
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	private VendorRepository vendorRepository; 
	
	@Autowired
	private VendorMapper  vendorMapper;
	
	@Autowired
	private VendorDetailMapper vendorDetailMapper;
	
	@Override
	public UIVendor saveVendor(UIVendor uiVendor) {
		EOVendor eoVendor=vendorMapper.mapToDAO(uiVendor);
		vendorRepository.save(eoVendor);
		return vendorMapper.mapToDTO(eoVendor);
	}

	@Override
	public UIVendor getVendor(Long id) {
		return vendorMapper.mapToDTO( vendorRepository.findById(id).orElseThrow(()-> new RuntimeException("Not fond")) );
	}

	@Override
	public boolean deleteVendor(Long id) {
		EOVendor eoVendor = vendorRepository.findById(id).orElseThrow(()-> new RuntimeException("Not fond")) ;
		eoVendor.setRecordState(false);
		vendorRepository.save(eoVendor);
		return true;
	}

	@Override
	public List<UIVendor> getVendorList() {
		return vendorMapper.mapToDTO( vendorRepository.findAll() );
	}

	@Override
	public UIVendorDetail getVendorDetail(Long id) {
		return vendorDetailMapper.mapToDTO( vendorRepository.findById(id).orElseThrow(()-> new RuntimeException("Not fond")) );
	}

}
