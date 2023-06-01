package com.brijframework.production.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.production.dto.cust.UICustIngredient;
import com.brijframework.production.service.cust.CustIngredientService;

@RestController
@RequestMapping("inventory/ingredient")
public class InventoryIngredientController {

	@Autowired
	CustIngredientService inventoryIngredientService;
	
	@PostMapping("/{inventoryAppId}")
	public UICustIngredient addIngredient(@PathVariable("inventoryAppId") long inventoryAppId,@RequestBody UICustIngredient countFreq) {
		return inventoryIngredientService.saveIngredient(inventoryAppId,countFreq);
	}
	
	@GetMapping("/{inventoryAppId}")
	public List<UICustIngredient> getIngredientList(@PathVariable("inventoryAppId") long inventoryAppId) {
		return inventoryIngredientService.getIngredientList(inventoryAppId);
	}
	
	@GetMapping("/{inventoryAppId}/{typeId}")
	public UICustIngredient getIngredientList(@PathVariable("inventoryAppId") long inventoryAppId,@PathVariable("typeId") String typeId) {
		return inventoryIngredientService.getIngredient(inventoryAppId, typeId);
	}
}
