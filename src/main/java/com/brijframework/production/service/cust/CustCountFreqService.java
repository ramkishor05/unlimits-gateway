package com.brijframework.production.service.cust;

import java.util.List;

import com.brijframework.production.rest.cust.CustCountFreqRequest;
import com.brijframework.production.rest.cust.CustCountFreqResponse;

public interface CustCountFreqService {

	CustCountFreqResponse saveCountFreq(long custAppId, CustCountFreqRequest custCountFreqRequest);

	List<CustCountFreqResponse> getCountFreqList(long custAppId);

	List<CustCountFreqResponse> getCountFreq(long custAppId, String typeId);

}
