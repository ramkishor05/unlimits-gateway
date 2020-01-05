package com.brijframework.inventory.service;

import java.util.List;

import com.brijframework.inventory.bean.UIIngredient;
import com.brijframework.inventory.model.EOInventoryApp;

public interface InventoryIngredientService {

	UIIngredient saveIngredient(long inventoryAppId, UIIngredient Ingredient);

	UIIngredient saveIngredient(UIIngredient Ingredient);

	UIIngredient saveIngredient(EOInventoryApp eoInventoryApp, UIIngredient Ingredient);

	UIIngredient getIngredient(long id);

	List<UIIngredient> getIngredientList(long inventoryAppId);

	UIIngredient getIngredient(long inventoryAppId, String typeId);

}
