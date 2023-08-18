package com.brijframework.production.service.cust.inv;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.dto.cust.UICustPreparation;
import com.brijframework.production.entities.cust.EOCustPreparation;
import com.brijframework.production.entities.cust.EOCustProductionApp;
import com.brijframework.production.mapper.cust.CustPreparationMapper;
import com.brijframework.production.repository.cust.CustPreparationRepository;
import com.brijframework.production.repository.cust.CustProductionAppRepository;

@Service
public class CustPreparationServiceImpl implements CustPreparationService {
	
	@Autowired
	CustProductionAppRepository inventoryApplicationRepository;
	
	@Autowired
	CustPreparationRepository inventoryPreparationRepository;
	
	@Autowired
	CustPreparationMapper inventoryPreparationMapper;
	
	@Override
	public UICustPreparation savePreparation(long inventoryAppId, UICustPreparation Preparation) {
		Optional<EOCustProductionApp> findById = inventoryApplicationRepository.findById(inventoryAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return savePreparation(findById.get(), Preparation);
	}
	
	@Override
	public UICustPreparation savePreparation(UICustPreparation Preparation) {
		Optional<EOCustProductionApp> findById = inventoryApplicationRepository.findById(Preparation.getCustProductionAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return savePreparation(findById.get(), Preparation);
	}
	
	@Override
	public UICustPreparation savePreparation(EOCustProductionApp eoInventoryApp,UICustPreparation Preparation) {
		EOCustPreparation eoPreparation=inventoryPreparationMapper.mapToDAO(Preparation);
		inventoryPreparationRepository.save(eoPreparation);
		return inventoryPreparationMapper.mapToDTO(eoPreparation);
	}

	@Override
	public UICustPreparation getPreparation(long id) {
		return inventoryPreparationMapper.mapToDTO(inventoryPreparationRepository.getOne(id));
	}

	@Override
	public List<UICustPreparation> getPreparationList(long inventoryAppId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UICustPreparation getPreparation(long inventoryAppId, String typeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
