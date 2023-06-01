package com.brijframework.production.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.production.dto.UIGlobalUnit;
import com.brijframework.production.dto.UIGlobalUnitGroup;
import com.brijframework.production.service.GlobalUnitGroupService;

@RestController
@RequestMapping("inventory/unitgroup")
public class InventoryUnitGroupController {

	@Autowired
	GlobalUnitGroupService inventoryUnitGroupService;
	
	@PostMapping("/{inventoryAppId}")
	public UIGlobalUnitGroup addUnitGroup(@PathVariable("inventoryAppId") long inventoryAppId,@RequestBody UIGlobalUnitGroup countFreq) {
		return inventoryUnitGroupService.saveUnitGroup(inventoryAppId,countFreq);
	}
	
	@GetMapping("/{inventoryAppId}")
	public List<UIGlobalUnitGroup> getUnitGroupList(@PathVariable("inventoryAppId") long inventoryAppId) {
		return inventoryUnitGroupService.getUnitGroupList(inventoryAppId);
	}
	
	@GetMapping("/{inventoryAppId}/{typeId}")
	public UIGlobalUnitGroup getUnitGroupList(@PathVariable("inventoryAppId") long inventoryAppId,@PathVariable("typeId") String typeId) {
		return inventoryUnitGroupService.getUnitGroup(inventoryAppId, typeId);
	}
	
	@PostMapping("/unit/{unitgroupId}")
	public UIGlobalUnit addUnit(@PathVariable("unitgroupId") long unitgroupId,@RequestBody UIGlobalUnit uiUnit) {
		return inventoryUnitGroupService.saveUnit(unitgroupId,uiUnit);
	}
	
	@GetMapping("/unit/{unitgroupId}")
	public List<UIGlobalUnit> getUnitList(@PathVariable("unitgroupId") long unitgroupId) {
		return inventoryUnitGroupService.getUnitList(unitgroupId);
	}
	
	@GetMapping("/unit/{unitgroupId}/{typeId}")
	public UIGlobalUnit getUnitList(@PathVariable("unitgroupId") long unitgroupId, @PathVariable("typeId") String typeId) {
		return inventoryUnitGroupService.getUnit(unitgroupId, typeId);
	}
}
