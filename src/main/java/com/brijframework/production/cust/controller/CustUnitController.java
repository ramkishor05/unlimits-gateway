package com.brijframework.production.cust.controller;

import static com.brijframework.production.contants.Constants.CUST_APP_ID;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.production.cust.dto.UICustUnit;
import com.brijframework.production.cust.service.CustUnitService;

@RestController
@RequestMapping("/api/cust/unit")
public class CustUnitController {

	@Autowired
	CustUnitService custUnitService;
	
	@PostMapping
	public UICustUnit addUnit(@RequestHeader(CUST_APP_ID) long custAppId,@RequestBody UICustUnit uiCustUnit) {
		return custUnitService.saveUnit(custAppId,uiCustUnit);
	}
	
	@PutMapping("/{id}")
	public UICustUnit updateUnit(@RequestHeader(CUST_APP_ID) long custAppId,@PathVariable Long id, @RequestBody UICustUnit uiCustUnit) {
		return custUnitService.updateUnit(custAppId,id, uiCustUnit);
	}
	
	@GetMapping
	public List<UICustUnit> getUnitList(@RequestHeader(CUST_APP_ID) long custAppId) {
		return custUnitService.getUnitList(custAppId);
	}
	
}
