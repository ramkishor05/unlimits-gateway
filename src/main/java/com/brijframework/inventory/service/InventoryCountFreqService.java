package com.brijframework.inventory.service;

import java.util.List;

import com.brijframework.inventory.bean.UICountFreq;
import com.brijframework.inventory.model.EOInventoryApp;

public interface InventoryCountFreqService {

	UICountFreq saveCountFreq(UICountFreq countFreq);

	UICountFreq getCountFreq(long id);

	UICountFreq saveCountFreq(EOInventoryApp eoInventoryApp, UICountFreq countFreq);

	List<UICountFreq> getCountFreqList(long inventoryAppId);

	UICountFreq getCountFreq(long inventoryAppId, String typeId);

	UICountFreq saveCountFreq(long inventoryAppId, UICountFreq countFreq);

}
