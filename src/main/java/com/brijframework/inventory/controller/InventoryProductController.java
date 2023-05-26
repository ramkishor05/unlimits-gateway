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

import com.brijframework.inventory.bean.UIProduct;
import com.brijframework.inventory.service.InventoryProductService;

@RestController
@RequestMapping("/api/inventory/product")
public class InventoryProductController {

	@Autowired
	private InventoryProductService inventoryProductService;
	
	@PostMapping("/{inventoryAppId}")
	public UIProduct addProduct(@PathVariable("inventoryAppId") long inventoryAppId,@RequestBody UIProduct product) {
		return inventoryProductService.saveProduct(inventoryAppId,product);
	}
	
	@PutMapping("/{inventoryAppId}")
	public UIProduct updateProduct(@PathVariable("inventoryAppId") long inventoryAppId,@RequestBody UIProduct product) {
		return inventoryProductService.updateProduct(inventoryAppId,product);
	}
	
	@GetMapping("/{inventoryAppId}")
	public List<UIProduct> getProductList(@PathVariable("inventoryAppId") long inventoryAppId) {
		return inventoryProductService.getProductList(inventoryAppId);
	}
	
	@GetMapping("/{inventoryAppId}/{typeId}")
	public UIProduct getProductList(@PathVariable("inventoryAppId") long inventoryAppId,@PathVariable("typeId") String typeId) {
		return inventoryProductService.getProduct(inventoryAppId, typeId);
	}
}
