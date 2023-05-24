package com.brijframework.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.inventory.bean.product.UIProductStock;
import com.brijframework.inventory.service.InventoryProductStockService;

@RestController
@RequestMapping("inventory/productstock")
public class InventoryProductStockController {

	@Autowired
	private InventoryProductStockService inventoryProductService;
	
	@PostMapping("/{inventoryAppId}")
	public UIProductStock addProduct(@PathVariable("inventoryAppId") long inventoryAppId,@RequestBody UIProductStock productStock) {
		return inventoryProductService.saveProductStock(inventoryAppId,productStock);
	}
	
	@PutMapping("/{inventoryAppId}")
	public UIProductStock updateProduct(@PathVariable("inventoryAppId") long inventoryAppId,@RequestBody UIProductStock productStock) {
		return inventoryProductService.saveProductStock(inventoryAppId,productStock);
	}
	
	@GetMapping("/{inventoryAppId}/forProduct/{productId}")
	public List<UIProductStock> getProductList(@PathVariable("inventoryAppId") long inventoryAppId, @PathVariable("productId") long productId) {
		return inventoryProductService.getProductStockListForProduct(inventoryAppId, productId);
	}
	
	@GetMapping("/{inventoryAppId}/{typeId}")
	public List<UIProductStock> getProductList(@PathVariable("inventoryAppId") long inventoryAppId,@PathVariable("typeId") String typeId) {
		return inventoryProductService.getProductStockListForType(inventoryAppId, typeId);
	}
}
