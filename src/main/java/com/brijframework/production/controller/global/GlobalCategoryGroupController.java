package com.brijframework.production.controller.global;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.production.contants.DataStatus;
import com.brijframework.production.dto.global.UIGlobalCategoryGroup;
import com.brijframework.production.service.global.GlobalCategoryGroupService;

@RestController
@RequestMapping("api/global/categorygroup")
public class GlobalCategoryGroupController {

	@Autowired
	GlobalCategoryGroupService globalCategoryGroupService;
	
	@PostMapping
	public UIGlobalCategoryGroup addCategoryGroup(@RequestBody UIGlobalCategoryGroup globalCategoryGroup) {
		return globalCategoryGroupService.saveCategoryGroup(globalCategoryGroup);
	}
	
	@GetMapping
	public List<UIGlobalCategoryGroup> getCategoryGroupList() {
		return globalCategoryGroupService.getCategoryGroupList();
	}
	
	@GetMapping("/{status}")
	public List<UIGlobalCategoryGroup> getCategoryGroupList(DataStatus  dataStatus) {
		return globalCategoryGroupService.getCategoryGroupList(dataStatus);
	}
	
	@GetMapping("/{typeId}")
	public UIGlobalCategoryGroup getCategoryGroupList(@PathVariable("typeId") String typeId) {
		return globalCategoryGroupService.getCategoryGroup(typeId);
	}
}
