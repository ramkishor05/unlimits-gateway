package com.brijframework.production.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.production.dto.UIGlobalCategoryGroup;
import com.brijframework.production.service.GlobalCategoryGroupService;

@RestController
@RequestMapping("api/global/categorygroup")
public class GlobalCategoryGroupController {

	@Autowired
	GlobalCategoryGroupService inventoryCategoryGroupService;
	
	@PostMapping("/{inventoryAppId}")
	public UIGlobalCategoryGroup addCategoryGroup(@PathVariable("inventoryAppId") long inventoryAppId,@RequestBody UIGlobalCategoryGroup countFreq) {
		return inventoryCategoryGroupService.saveCategoryGroup(inventoryAppId,countFreq);
	}
	
	@GetMapping("/{inventoryAppId}")
	public List<UIGlobalCategoryGroup> getCategoryGroupList(@PathVariable("inventoryAppId") long inventoryAppId) {
		return inventoryCategoryGroupService.getCategoryGroupList(inventoryAppId);
	}
	
	@GetMapping("/{inventoryAppId}/{typeId}")
	public UIGlobalCategoryGroup getCategoryGroupList(@PathVariable("inventoryAppId") long inventoryAppId,@PathVariable("typeId") String typeId) {
		return inventoryCategoryGroupService.getCategoryGroup(inventoryAppId, typeId);
	}
}
