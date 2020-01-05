package com.brijframework.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.inventory.bean.UIUnit;
import com.brijframework.inventory.bean.UIUnitGroup;
import com.brijframework.inventory.service.InventoryUnitGroupService;

@RestController
@RequestMapping("inventory/unitgroup")
public class InventoryUnitGroupController {

	@Autowired
	InventoryUnitGroupService inventoryUnitGroupService;
	
	@PostMapping("/{inventoryAppId}")
	public UIUnitGroup addUnitGroup(@PathVariable("inventoryAppId") long inventoryAppId,@RequestBody UIUnitGroup countFreq) {
		return inventoryUnitGroupService.saveUnitGroup(inventoryAppId,countFreq);
	}
	
	@GetMapping("/{inventoryAppId}")
	public List<UIUnitGroup> getUnitGroupList(@PathVariable("inventoryAppId") long inventoryAppId) {
		return inventoryUnitGroupService.getUnitGroupList(inventoryAppId);
	}
	
	@GetMapping("/{inventoryAppId}/{typeId}")
	public UIUnitGroup getUnitGroupList(@PathVariable("inventoryAppId") long inventoryAppId,@PathVariable("typeId") String typeId) {
		return inventoryUnitGroupService.getUnitGroup(inventoryAppId, typeId);
	}
	
	@PostMapping("/unit/{unitgroupId}")
	public UIUnit addUnit(@PathVariable("unitgroupId") long unitgroupId,@RequestBody UIUnit uiUnit) {
		return inventoryUnitGroupService.saveUnit(unitgroupId,uiUnit);
	}
	
	@GetMapping("/unit/{unitgroupId}")
	public List<UIUnit> getUnitList(@PathVariable("unitgroupId") long unitgroupId) {
		return inventoryUnitGroupService.getUnitList(unitgroupId);
	}
	
	@GetMapping("/unit/{unitgroupId}/{typeId}")
	public UIUnit getUnitList(@PathVariable("unitgroupId") long unitgroupId, @PathVariable("typeId") String typeId) {
		return inventoryUnitGroupService.getUnit(unitgroupId, typeId);
	}
}
