package com.brijframework.inventory.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.inventory.bean.UIInventoryManager;
import com.brijframework.inventory.contants.CountFreq;
import com.brijframework.inventory.service.InventoryManagerService;

@RestController
@RequestMapping("inventory/manager")
public class InventoryManagerController {
	
	@Autowired
	InventoryManagerService inventoryManagerService;
	
	@PostMapping("/{countFreq}")
	public UIInventoryManager addInventory(@PathVariable("countFreq") CountFreq countFreq) {
		return inventoryManagerService.saveInventory(countFreq);
	}
	
	@PutMapping("/{countFreq}")
	public UIInventoryManager updateInventory(@PathVariable("countFreq") CountFreq countFreq) {
		return inventoryManagerService.saveInventory(countFreq);
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteInventory(@PathVariable("id") long id) {
		return inventoryManagerService.deleteInventory(id);
	}
	
	@PostMapping
	public UIInventoryManager addInventory(@RequestBody UIInventoryManager inventory) {
		return inventoryManagerService.saveInventory(inventory);
	}
	
	@PutMapping
	public UIInventoryManager updateInventory(@RequestBody UIInventoryManager inventory) {
		return inventoryManagerService.saveInventory(inventory);
	}
		
	@GetMapping("/{id}")
	public UIInventoryManager getInventory(@PathVariable("id") long id) {
		return inventoryManagerService.getInventory(id);
	}
	
	@GetMapping("/frequency/{countFreq}")
	public List<UIInventoryManager> getInventory(@PathVariable("countFreq") CountFreq countFreq) {
		return inventoryManagerService.getInventoryList(countFreq);
	}
	
	@GetMapping("/frequency/{countFreq}/search")
	public List<UIInventoryManager> getInventory(@RequestParam(name = "start") LocalDateTime start,@RequestParam(name = "end") LocalDateTime end,@PathVariable("countFreq") CountFreq countFreq) {
		return inventoryManagerService.getInventoryList(countFreq);
	}
	
}
