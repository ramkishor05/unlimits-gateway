package com.brijframework.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.inventory.bean.UICountFreq;
import com.brijframework.inventory.service.InventoryCountFreqService;

@RestController
@RequestMapping("inventory/countfreq")
public class InventoryCountFreqController {

	@Autowired
	InventoryCountFreqService inventoryCountFreqService;
	
	@PostMapping("/{inventoryAppId}")
	public UICountFreq addCountFreq(@PathVariable("inventoryAppId") long inventoryAppId,@RequestBody UICountFreq countFreq) {
		return inventoryCountFreqService.saveCountFreq(inventoryAppId,countFreq);
	}
	
	@GetMapping("/{inventoryAppId}")
	public List<UICountFreq> getCountFreqList(@PathVariable("inventoryAppId") long inventoryAppId) {
		return inventoryCountFreqService.getCountFreqList(inventoryAppId);
	}
	
	@GetMapping("/{inventoryAppId}/{typeId}")
	public UICountFreq getCountFreqList(@PathVariable("inventoryAppId") long inventoryAppId,@PathVariable("typeId") String typeId) {
		return inventoryCountFreqService.getCountFreq(inventoryAppId, typeId);
	}
}
