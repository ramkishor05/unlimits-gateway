package com.brijframework.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.inventory.bean.UICategoryGroup;
import com.brijframework.inventory.service.InventoryCategoryGroupService;

@RestController
@RequestMapping("inventory/categorygroup")
public class InventoryCategoryGroupController {

	@Autowired
	InventoryCategoryGroupService inventoryCategoryGroupService;
	
	@PostMapping("/{inventoryAppId}")
	public UICategoryGroup addCategoryGroup(@PathVariable("inventoryAppId") long inventoryAppId,@RequestBody UICategoryGroup countFreq) {
		return inventoryCategoryGroupService.saveCategoryGroup(inventoryAppId,countFreq);
	}
	
	@GetMapping("/{inventoryAppId}")
	public List<UICategoryGroup> getCategoryGroupList(@PathVariable("inventoryAppId") long inventoryAppId) {
		return inventoryCategoryGroupService.getCategoryGroupList(inventoryAppId);
	}
	
	@GetMapping("/{inventoryAppId}/{typeId}")
	public UICategoryGroup getCategoryGroupList(@PathVariable("inventoryAppId") long inventoryAppId,@PathVariable("typeId") String typeId) {
		return inventoryCategoryGroupService.getCategoryGroup(inventoryAppId, typeId);
	}
}
