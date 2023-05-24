package com.brijframework.inventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.inventory.bean.product.UIProductStock;
import com.brijframework.inventory.mapper.InventoryProductStockMapper;
import com.brijframework.inventory.model.global.EOCustProduct;
import com.brijframework.inventory.model.global.EOGlobalProductStock;
import com.brijframework.inventory.repository.InventoryProductRepository;
import com.brijframework.inventory.repository.InventoryProductStockRepository;
import com.brijframework.inventory.service.InventoryProductStockService;

@Service
public class InventoryProductStockServiceImpl implements InventoryProductStockService {
	
	@Autowired
	private InventoryProductRepository inventoryProductRepository;
	
	@Autowired
	private InventoryProductStockRepository inventoryProductStockRepository;
	
	@Autowired
	private InventoryProductStockMapper inventoryProductStockMapper;
	
	@Override
	public UIProductStock saveProductStock(long inventoryAppId, UIProductStock productStock) {
		EOCustProduct eoGlobalProduct = inventoryProductRepository.findByInventoryAppIdAndProductId(inventoryAppId,productStock.getId());
		EOGlobalProductStock eoGlobalProductStock=new EOGlobalProductStock();
		eoGlobalProductStock.setProduct(eoGlobalProduct);
		eoGlobalProductStock.setQuantity_added(productStock.getQuantity_added());
		eoGlobalProductStock.setQuantity_remaining(productStock.getQuantity_remaining());
		eoGlobalProductStock=inventoryProductStockRepository.save(eoGlobalProductStock);
		inventoryProductRepository.save(eoGlobalProduct);
		return inventoryProductStockMapper.mapToDTO(eoGlobalProductStock);
	}

	@Override
	public List<UIProductStock> getProductStockListForProduct(long inventoryAppId, long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UIProductStock> getProductStockListForType(long inventoryAppId, String typeId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
