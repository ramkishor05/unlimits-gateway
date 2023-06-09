package com.brijframework.production.controller;
import static com.brijframework.production.contants.Constants.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.production.dto.UIGlobalCategory;
import com.brijframework.production.service.GlobalCategoryService;

@RestController
@RequestMapping("/api/global/category")
public class GlobalCategoryController {

	@Autowired
	private GlobalCategoryService globalCategoryService;
	
	@PostMapping
	public UIGlobalCategory addCategory(@RequestBody UIGlobalCategory countFreq) {
		return globalCategoryService.saveCategory(countFreq);
	}
	
	@PutMapping
	public UIGlobalCategory updateCategory(@RequestBody UIGlobalCategory countFreq) {
		return globalCategoryService.saveCategory(countFreq);
	}
	
	@GetMapping
	public List<UIGlobalCategory> getCategoryList() {
		return globalCategoryService.getCategoryList();
	}
	
	@GetMapping("/{id}")
	public UIGlobalCategory getCategoryList(@PathVariable("id") Long id) {
		return globalCategoryService.getCategory(id);
	}
	
	@GetMapping("/type/{typeId}")
	public List<UIGlobalCategory> getCategoryList(@PathVariable(TYPE_ID) String typeId) {
		return globalCategoryService.findAllByType(typeId);
	}
}
