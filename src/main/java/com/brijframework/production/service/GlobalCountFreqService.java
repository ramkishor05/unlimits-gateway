package com.brijframework.production.service;

import java.util.List;

import com.brijframework.production.dto.UIGlobalCountFreq;

public interface GlobalCountFreqService {

	UIGlobalCountFreq saveCountFreq(UIGlobalCountFreq countFreq);

	UIGlobalCountFreq getCountFreq(long id);

	List<UIGlobalCountFreq> getCountFreqList();

	UIGlobalCountFreq getCountFreq(String typeId);


}
