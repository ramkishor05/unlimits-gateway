package com.brijframework.inventory.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.inventory.bean.UIIngredient;
import com.brijframework.inventory.mapper.InventoryIngredientMapper;
import com.brijframework.inventory.model.EOInventoryApp;
import com.brijframework.inventory.model.global.EOGlobalIngredient;
import com.brijframework.inventory.repository.InventoryApplicationRepository;
import com.brijframework.inventory.repository.InventoryIngredientRepository;
import com.brijframework.inventory.service.InventoryIngredientService;

@Service
public class InventoryIngredientServiceImpl implements InventoryIngredientService {
	
	@Autowired
	InventoryApplicationRepository inventoryApplicationRepository;
	
	@Autowired
	InventoryIngredientRepository inventoryIngredientRepository;
	
	@Autowired
	InventoryIngredientMapper inventoryIngredientMapper;
	
	@Override
	public UIIngredient saveIngredient(long inventoryAppId, UIIngredient Ingredient) {
		Optional<EOInventoryApp> findById = inventoryApplicationRepository.findById(inventoryAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return saveIngredient(findById.get(), Ingredient);
	}
	
	@Override
	public UIIngredient saveIngredient(UIIngredient Ingredient) {
		Optional<EOInventoryApp> findById = inventoryApplicationRepository.findById(Ingredient.getInventoryAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return saveIngredient(findById.get(), Ingredient);
	}
	
	@Override
	public UIIngredient saveIngredient(EOInventoryApp eoInventoryApp,UIIngredient Ingredient) {
		EOGlobalIngredient eoIngredient=inventoryIngredientMapper.mapToDAO(Ingredient);
		inventoryIngredientRepository.save(eoIngredient);
		return inventoryIngredientMapper.mapToDTO(eoIngredient);
	}

	@Override
	public UIIngredient getIngredient(long id) {
		return inventoryIngredientMapper.mapToDTO(inventoryIngredientRepository.getOne(id));
	}

	@Override
	public List<UIIngredient> getIngredientList(long inventoryAppId) {
		return inventoryIngredientMapper.mapToDTO(inventoryIngredientRepository.findAllByInventoryAppId(inventoryAppId));
	}
	
	@Override
	public UIIngredient getIngredient(long inventoryAppId,String typeId) {
		return inventoryIngredientMapper.mapToDTO(inventoryIngredientRepository.findByInventoryAppIdAndTypeId(inventoryAppId, typeId));
	}

}
