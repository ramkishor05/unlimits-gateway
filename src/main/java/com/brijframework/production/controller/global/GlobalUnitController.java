package com.brijframework.production.controller.global;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.production.dto.global.UIGlobalUnit;
import com.brijframework.production.service.global.GlobalUnitService;

@RestController
@RequestMapping("/api/global/unit")
public class GlobalUnitController {

	@Autowired
	GlobalUnitService globalUnitService;
	
	@PostMapping
	public UIGlobalUnit addUnit(@RequestBody UIGlobalUnit uiUnit) {
		return globalUnitService.saveUnit(uiUnit);
	}
	
	@PutMapping("/{id}")
	public UIGlobalUnit updateUnit(@PathVariable Long id, @RequestBody UIGlobalUnit uiUnit) {
		return globalUnitService.updateUnit(id, uiUnit);
	}
	
	@GetMapping
	public List<UIGlobalUnit> getUnitList() {
		return globalUnitService.getUnitList();
	}
	
}
