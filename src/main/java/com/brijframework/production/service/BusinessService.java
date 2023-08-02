package com.brijframework.production.service;

import java.util.List;

import com.brijframework.production.dto.UIBusiness;
import com.brijframework.production.dto.UIBusinessDetail;

public interface BusinessService {

	UIBusiness saveBusiness(Long vendorId, UIBusiness uiBusiness);

	UIBusiness getBusiness(Long id);

	boolean deleteBusiness(Long id);

	List<UIBusiness> getBusinessList(Long vendorId);

	UIBusinessDetail getBusinessDetail(Long id);

	List<UIBusiness> getBusinessList();
}
