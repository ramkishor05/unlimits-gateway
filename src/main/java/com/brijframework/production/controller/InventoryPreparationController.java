package com.brijframework.production.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.production.dto.cust.UICustPreparation;
import com.brijframework.production.service.cust.CustPreparationService;

@RestController
@RequestMapping("inventory/preparation")
public class InventoryPreparationController {

	@Autowired
	CustPreparationService inventoryPreparationService;
	
	@PostMapping("/{inventoryAppId}")
	public UICustPreparation addPreparation(@PathVariable("inventoryAppId") long inventoryAppId,@RequestBody UICustPreparation countFreq) {
		return inventoryPreparationService.savePreparation(inventoryAppId,countFreq);
	}
	
	@GetMapping("/{inventoryAppId}")
	public List<UICustPreparation> getPreparationList(@PathVariable("inventoryAppId") long inventoryAppId) {
		return inventoryPreparationService.getPreparationList(inventoryAppId);
	}
	
	@GetMapping("/{inventoryAppId}/{typeId}")
	public UICustPreparation getPreparationList(@PathVariable("inventoryAppId") long inventoryAppId,@PathVariable("typeId") String typeId) {
		return inventoryPreparationService.getPreparation(inventoryAppId, typeId);
	}
}
