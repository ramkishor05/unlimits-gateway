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

import com.brijframework.production.cust.dto.UICustUnitGroup;
import com.brijframework.production.cust.service.CustUnitGroupService;

@RestController
@RequestMapping("/api/cust/unitgroup")
public class CustUnitGroupController {

	@Autowired
	private CustUnitGroupService custUnitGroupService;
	
	@PostMapping
	public UICustUnitGroup addUnitGroup(@RequestHeader(CUST_APP_ID) long custAppId,@RequestBody UICustUnitGroup uiCustUnitGroup) {
		return custUnitGroupService.saveUnitGroup(custAppId,uiCustUnitGroup);
	}
	
	@PutMapping
	public UICustUnitGroup updateUnitGroup(@RequestHeader(CUST_APP_ID) long custAppId,@RequestBody UICustUnitGroup uiCustUnitGroup) {
		return custUnitGroupService.updateUnitGroup(custAppId,uiCustUnitGroup);
	}
	
	@GetMapping
	public List<UICustUnitGroup> getUnitGroupList(@RequestHeader(CUST_APP_ID) long custAppId) {
		return custUnitGroupService.getUnitGroupList(custAppId);
	}
	
	@GetMapping("/{typeId}")
	public List<UICustUnitGroup> getUnitGroupList(@RequestHeader(CUST_APP_ID) long custAppId,@PathVariable("typeId") String typeId) {
		return custUnitGroupService.getUnitGroupList(custAppId,typeId);
	}
	
}
