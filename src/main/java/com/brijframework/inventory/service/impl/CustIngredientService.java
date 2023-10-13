package com.brijframework.inventory.service.impl;

import java.util.List;

import com.brijframework.inventory.dto.UICustIngredient;
import com.brijframework.inventory.entities.EOCustInventoryApp;

public interface CustIngredientService {

	UICustIngredient saveIngredient(long inventoryAppId, UICustIngredient Ingredient);

	UICustIngredient saveIngredient(UICustIngredient Ingredient);

	UICustIngredient saveIngredient(EOCustInventoryApp eoInventoryApp, UICustIngredient Ingredient);

	UICustIngredient getIngredient(long id);

	List<UICustIngredient> getIngredientList(long inventoryAppId);

	UICustIngredient getIngredient(long inventoryAppId, String typeId);

}
