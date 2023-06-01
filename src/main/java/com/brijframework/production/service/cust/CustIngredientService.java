package com.brijframework.production.service.cust;

import java.util.List;

import com.brijframework.production.dto.cust.UICustIngredient;
import com.brijframework.production.entities.cust.EOCustProductionApp;

public interface CustIngredientService {

	UICustIngredient saveIngredient(long inventoryAppId, UICustIngredient Ingredient);

	UICustIngredient saveIngredient(UICustIngredient Ingredient);

	UICustIngredient saveIngredient(EOCustProductionApp eoInventoryApp, UICustIngredient Ingredient);

	UICustIngredient getIngredient(long id);

	List<UICustIngredient> getIngredientList(long inventoryAppId);

	UICustIngredient getIngredient(long inventoryAppId, String typeId);

}
