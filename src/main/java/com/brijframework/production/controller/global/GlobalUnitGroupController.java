package com.brijframework.production.controller.global;

import static com.brijframework.production.contants.Constants.CUST_APP_ID;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.production.dto.global.UIGlobalUnitGroup;
import com.brijframework.production.service.global.GlobalUnitGroupService;

@RestController
@RequestMapping("/api/global/unitgroup")
public class GlobalUnitGroupController {

	@Autowired
	private GlobalUnitGroupService globalUnitGroupService;
	
	@PostMapping
	public UIGlobalUnitGroup addUnitGroup(@RequestHeader(CUST_APP_ID) long custAppId,	@RequestBody UIGlobalUnitGroup globalUnitGroup) {
		return globalUnitGroupService.saveUnitGroup(custAppId,globalUnitGroup);
	}
	
	@GetMapping
	public List<UIGlobalUnitGroup> getUnitGroupList(@RequestHeader(CUST_APP_ID) long custAppId) {
		return globalUnitGroupService.getUnitGroupList(custAppId);
	}
	
	@GetMapping("/{typeId}")
	public UIGlobalUnitGroup getUnitGroupList(@RequestHeader(CUST_APP_ID) long custAppId,@PathVariable("typeId") String typeId) {
		return globalUnitGroupService.getUnitGroup(custAppId, typeId);
	}
	
}
