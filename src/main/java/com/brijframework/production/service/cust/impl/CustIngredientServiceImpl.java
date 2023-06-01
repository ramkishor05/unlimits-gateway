package com.brijframework.production.service.cust.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.dto.cust.UICustIngredient;
import com.brijframework.production.entities.cust.EOCustIngredient;
import com.brijframework.production.entities.cust.EOCustProductionApp;
import com.brijframework.production.mapper.cust.CustIngredientMapper;
import com.brijframework.production.repository.cust.CustIngredientRepository;
import com.brijframework.production.repository.cust.CustProductionAppRepository;
import com.brijframework.production.service.cust.CustIngredientService;

@Service
public class CustIngredientServiceImpl implements CustIngredientService {
	
	@Autowired
	CustProductionAppRepository inventoryApplicationRepository;
	
	@Autowired
	CustIngredientRepository inventoryIngredientRepository;
	
	@Autowired
	CustIngredientMapper inventoryIngredientMapper;
	
	@Override
	public UICustIngredient saveIngredient(long inventoryAppId, UICustIngredient Ingredient) {
		Optional<EOCustProductionApp> findById = inventoryApplicationRepository.findById(inventoryAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return saveIngredient(findById.get(), Ingredient);
	}
	
	@Override
	public UICustIngredient saveIngredient(UICustIngredient Ingredient) {
		Optional<EOCustProductionApp> findById = inventoryApplicationRepository.findById(Ingredient.getCustProductionAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return saveIngredient(findById.get(), Ingredient);
	}
	
	@Override
	public UICustIngredient saveIngredient(EOCustProductionApp eoInventoryApp,UICustIngredient Ingredient) {
		EOCustIngredient eoIngredient=inventoryIngredientMapper.mapToDAO(Ingredient);
		inventoryIngredientRepository.save(eoIngredient);
		return inventoryIngredientMapper.mapToDTO(eoIngredient);
	}

	@Override
	public UICustIngredient getIngredient(long id) {
		return inventoryIngredientMapper.mapToDTO(inventoryIngredientRepository.getOne(id));
	}

	@Override
	public List<UICustIngredient> getIngredientList(long inventoryAppId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UICustIngredient getIngredient(long inventoryAppId, String typeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
