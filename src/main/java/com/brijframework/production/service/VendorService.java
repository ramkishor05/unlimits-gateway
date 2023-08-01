package com.brijframework.production.service;

import java.util.List;

import com.brijframework.production.dto.UIVendor;
import com.brijframework.production.dto.UIVendorDetail;

public interface VendorService {

	UIVendor saveVendor(UIVendor uiVendor);

	UIVendor getVendor(Long id);

	boolean deleteVendor(Long id);

	List<UIVendor> getVendorList();

	UIVendorDetail getVendorDetail(Long id);
}
