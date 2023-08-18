package com.brijframework.production.service.cust;

import java.util.List;

import com.brijframework.production.contants.DataStatus;
import com.brijframework.production.dto.cust.UICustCategoryGroup;

public interface CustCategoryGroupService {

	UICustCategoryGroup saveCategoryGroup(long custAppId, UICustCategoryGroup custCategoryGroup);

	List<UICustCategoryGroup> getCategoryGroupList(long custAppId);

	UICustCategoryGroup getCategoryGroup(long custAppId, Long id);

	boolean deleteCategoryGroup(long custAppId, Long id);

	List<UICustCategoryGroup> getCategoryGroupListByStatus(long custAppId, DataStatus dataStatus);

	List<UICustCategoryGroup> getCategoryGroupListByType(long custAppId, String typeId);

}
