package com.brijframework.inventory.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.inventory.bean.UIProduct;
import com.brijframework.inventory.mapper.InventoryProductMapper;
import com.brijframework.inventory.model.EOInventoryApp;
import com.brijframework.inventory.model.global.EOGlobalProduct;
import com.brijframework.inventory.repository.InventoryApplicationRepository;
import com.brijframework.inventory.repository.InventoryProductRepository;
import com.brijframework.inventory.service.InventoryProductService;

@Service
public class InventoryProductServiceImpl implements InventoryProductService {
	
	@Autowired
	InventoryApplicationRepository inventoryApplicationRepository;
	
	@Autowired
	InventoryProductRepository inventoryProductRepository;
	
	@Autowired
	InventoryProductMapper inventoryProductMapper;
	
	@Override
	public UIProduct saveProduct(long inventoryAppId, UIProduct Product) {
		Optional<EOInventoryApp> findById = inventoryApplicationRepository.findById(inventoryAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return saveProduct(findById.get(), Product);
	}
	
	@Override
	public UIProduct saveProduct(UIProduct Product) {
		Optional<EOInventoryApp> findById = inventoryApplicationRepository.findById(Product.getInventoryAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return saveProduct(findById.get(), Product);
	}
	
	@Override
	public UIProduct saveProduct(EOInventoryApp eoInventoryApp,UIProduct Product) {
		EOGlobalProduct eoProduct=inventoryProductMapper.mapToDAO(Product);
		inventoryProductRepository.save(eoProduct);
		return inventoryProductMapper.mapToDTO(eoProduct);
	}

	@Override
	public UIProduct getProduct(long id) {
		return inventoryProductMapper.mapToDTO(inventoryProductRepository.getOne(id));
	}

	@Override
	public List<UIProduct> getProductList(long inventoryAppId) {
		return inventoryProductMapper.mapToDTO(inventoryProductRepository.findAllByInventoryAppId(inventoryAppId));
	}
	
	@Override
	public UIProduct getProduct(long inventoryAppId,String typeId) {
		return inventoryProductMapper.mapToDTO(inventoryProductRepository.findByInventoryAppIdAndTypeId(inventoryAppId, typeId));
	}

}
