package com.brijframework.production.service.global;

import java.util.List;

import com.brijframework.production.rest.global.GlobalCountFreqRequest;
import com.brijframework.production.rest.global.GlobalCountFreqResponse;

public interface GlobalCountFreqService {

	GlobalCountFreqResponse saveCountFreq(GlobalCountFreqRequest globalCountFreqRequest);

	GlobalCountFreqResponse getCountFreq(long id);

	List<GlobalCountFreqResponse> getCountFreqList();

	GlobalCountFreqResponse getCountFreq(String typeId);


}
