package com.brijframework.production.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.production.dto.UIGlobalCountFreq;
import com.brijframework.production.service.GlobalCountFreqService;

@RestController
@RequestMapping("/api/global/countfreq")
public class GlobalCountFreqController {

	@Autowired
	GlobalCountFreqService inventoryCountFreqService;
	
	@PostMapping
	public UIGlobalCountFreq addCountFreq(@RequestBody UIGlobalCountFreq countFreq) {
		return inventoryCountFreqService.saveCountFreq(countFreq);
	}
	
	@GetMapping
	public List<UIGlobalCountFreq> getCountFreqList() {
		return inventoryCountFreqService.getCountFreqList();
	}
	
	@GetMapping("/{typeId}")
	public UIGlobalCountFreq getCountFreqList(@PathVariable("typeId") String typeId) {
		return inventoryCountFreqService.getCountFreq(typeId);
	}
}
