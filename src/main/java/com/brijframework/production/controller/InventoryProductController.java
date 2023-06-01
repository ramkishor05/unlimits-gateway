package com.brijframework.production.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.production.dto.cust.UICustProduct;
import com.brijframework.production.service.cust.CustProductService;

@RestController
@RequestMapping("/api/cust/product")
public class InventoryProductController {

	@Autowired
	private CustProductService inventoryProductService;
	
	@PostMapping("/{inventoryAppId}")
	public UICustProduct addProduct(@PathVariable("inventoryAppId") long inventoryAppId,@RequestBody UICustProduct product) {
		return inventoryProductService.saveProduct(inventoryAppId,product);
	}
	
	@PutMapping("/{inventoryAppId}")
	public UICustProduct updateProduct(@PathVariable("inventoryAppId") long inventoryAppId,@RequestBody UICustProduct product) {
		return inventoryProductService.updateProduct(inventoryAppId,product);
	}
	
	@GetMapping("/{inventoryAppId}")
	public List<UICustProduct> getProductList(@PathVariable("inventoryAppId") long inventoryAppId) {
		return inventoryProductService.getProductList(inventoryAppId);
	}
	
	@GetMapping("/{inventoryAppId}/{typeId}")
	public UICustProduct getProductList(@PathVariable("inventoryAppId") long inventoryAppId,@PathVariable("typeId") String typeId) {
		return inventoryProductService.getProduct(inventoryAppId, typeId);
	}
}
