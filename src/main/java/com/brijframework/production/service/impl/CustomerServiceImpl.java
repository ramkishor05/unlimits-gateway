package com.brijframework.production.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.dto.UICustomer;
import com.brijframework.production.dto.UICustomerDetail;
import com.brijframework.production.entities.EOCustomer;
import com.brijframework.production.entities.EOVendor;
import com.brijframework.production.mapper.CustomerDetailMapper;
import com.brijframework.production.mapper.CustomerMapper;
import com.brijframework.production.repository.CustomerRepository;
import com.brijframework.production.repository.VendorRepository;
import com.brijframework.production.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private VendorRepository vendorRepository; 
	
	@Autowired
	private CustomerMapper  customerMapper;
	
	@Autowired
	private CustomerDetailMapper customerDetailMapper;
	
	@Override
	public UICustomer saveCustomer(Long vendorId, UICustomer uiCustomer) {
		EOCustomer eoCustomer=customerMapper.mapToDAO(uiCustomer);
		EOVendor eoVendor = vendorRepository.findById(vendorId).orElseThrow(()-> new RuntimeException("Not fond vendor")) ;
		eoCustomer.setVendor(eoVendor);
		customerRepository.save(eoCustomer);
		return customerMapper.mapToDTO(eoCustomer);
	}

	@Override
	public UICustomer getCustomer(Long id) {
		return customerMapper.mapToDTO( customerRepository.findById(id).orElseThrow(()-> new RuntimeException("Not fond")) );
	}

	@Override
	public boolean deleteCustomer(Long id) {
		EOCustomer eoCustomer = customerRepository.findById(id).orElseThrow(()-> new RuntimeException("Not fond")) ;
		eoCustomer.setRecordState(false);
		customerRepository.save(eoCustomer);
		return true;
	}

	@Override
	public List<UICustomer> getCustomerList(Long vendorId) {
		return customerMapper.mapToDTO( customerRepository.findByVendorId(vendorId).orElseThrow(()-> new RuntimeException("Not fond")) );
	}
	
	@Override
	public List<UICustomer> getCustomerList() {
		return customerMapper.mapToDTO( customerRepository.findAll() );
	}

	@Override
	public UICustomerDetail getCustomerDetail(Long id) {
		return customerDetailMapper.mapToDTO( customerRepository.findById(id).orElseThrow(()-> new RuntimeException("Not fond")) );
	}

}
