package com.brijframework.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.inventory.bean.UIIngredient;
import com.brijframework.inventory.service.InventoryIngredientService;

@RestController
@RequestMapping("inventory/ingredient")
public class InventoryIngredientController {

	@Autowired
	InventoryIngredientService inventoryIngredientService;
	
	@PostMapping("/{inventoryAppId}")
	public UIIngredient addIngredient(@PathVariable("inventoryAppId") long inventoryAppId,@RequestBody UIIngredient countFreq) {
		return inventoryIngredientService.saveIngredient(inventoryAppId,countFreq);
	}
	
	@GetMapping("/{inventoryAppId}")
	public List<UIIngredient> getIngredientList(@PathVariable("inventoryAppId") long inventoryAppId) {
		return inventoryIngredientService.getIngredientList(inventoryAppId);
	}
	
	@GetMapping("/{inventoryAppId}/{typeId}")
	public UIIngredient getIngredientList(@PathVariable("inventoryAppId") long inventoryAppId,@PathVariable("typeId") String typeId) {
		return inventoryIngredientService.getIngredient(inventoryAppId, typeId);
	}
}
