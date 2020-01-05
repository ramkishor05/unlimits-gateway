package com.brijframework.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.inventory.bean.UICategory;
import com.brijframework.inventory.service.InventoryCategoryService;

@RestController
@RequestMapping("inventory/category")
public class InventoryCategoryController {

	@Autowired
	InventoryCategoryService inventoryCategoryService;
	
	@PostMapping("/{inventoryAppId}")
	public UICategory addCategory(@PathVariable("inventoryAppId") long inventoryAppId,@RequestBody UICategory countFreq) {
		return inventoryCategoryService.saveCategory(inventoryAppId,countFreq);
	}
	
	@GetMapping("/{inventoryAppId}")
	public List<UICategory> getCategoryList(@PathVariable("inventoryAppId") long inventoryAppId) {
		return inventoryCategoryService.getCategoryList(inventoryAppId);
	}
	
	@GetMapping("/{inventoryAppId}/{typeId}")
	public UICategory getCategoryList(@PathVariable("inventoryAppId") long inventoryAppId,@PathVariable("typeId") String typeId) {
		return inventoryCategoryService.getCategory(inventoryAppId, typeId);
	}
}
