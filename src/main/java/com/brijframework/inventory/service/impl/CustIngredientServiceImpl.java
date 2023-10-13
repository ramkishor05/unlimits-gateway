package com.brijframework.inventory.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.inventory.dto.UICustIngredient;
import com.brijframework.inventory.entities.EOCustIngredient;
import com.brijframework.inventory.entities.EOCustInventoryApp;
import com.brijframework.inventory.mapper.CustIngredientMapper;
import com.brijframework.inventory.repository.CustIngredientRepository;
import com.brijframework.inventory.repository.CustInventoryAppRepository;

@Service
public class CustIngredientServiceImpl implements CustIngredientService {
	
	@Autowired
	CustInventoryAppRepository inventoryApplicationRepository;
	
	@Autowired
	CustIngredientRepository inventoryIngredientRepository;
	
	@Autowired
	CustIngredientMapper inventoryIngredientMapper;
	
	@Override
	public UICustIngredient saveIngredient(long inventoryAppId, UICustIngredient Ingredient) {
		Optional<EOCustInventoryApp> findById = inventoryApplicationRepository.findById(inventoryAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return saveIngredient(findById.get(), Ingredient);
	}
	
	@Override
	public UICustIngredient saveIngredient(UICustIngredient Ingredient) {
		Optional<EOCustInventoryApp> findById = inventoryApplicationRepository.findById(Ingredient.getCustInventoryAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return saveIngredient(findById.get(), Ingredient);
	}
	
	@Override
	public UICustIngredient saveIngredient(EOCustInventoryApp eoInventoryApp,UICustIngredient Ingredient) {
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
