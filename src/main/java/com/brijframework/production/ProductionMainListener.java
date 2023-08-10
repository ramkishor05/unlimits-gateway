package com.brijframework.production;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.brijframework.production.entities.cust.EOCustCategory;
import com.brijframework.production.entities.cust.EOCustCategoryGroup;
import com.brijframework.production.entities.cust.EOCustCountFreq;
import com.brijframework.production.entities.cust.EOCustProductionApp;
import com.brijframework.production.entities.cust.EOCustUnit;
import com.brijframework.production.entities.cust.EOCustUnitGroup;
import com.brijframework.production.entities.global.EOGlobalCategory;
import com.brijframework.production.entities.global.EOGlobalCategoryGroup;
import com.brijframework.production.entities.global.EOGlobalCountFreq;
import com.brijframework.production.entities.global.EOGlobalUnit;
import com.brijframework.production.entities.global.EOGlobalUnitGroup;
import com.brijframework.production.mapper.e2e.CustCategoryGlobalCategoryMapper;
import com.brijframework.production.mapper.e2e.CustCategoryGroupGlobalCategoryGroupMapper;
import com.brijframework.production.mapper.e2e.CustCountFreqGlobalCountFreqMapper;
import com.brijframework.production.mapper.e2e.CustUnitGlobalUnitMapper;
import com.brijframework.production.mapper.e2e.CustUnitGroupGlobalUnitGroupMapper;
import com.brijframework.production.repository.cust.CustCategoryGroupRepository;
import com.brijframework.production.repository.cust.CustCategoryRepository;
import com.brijframework.production.repository.cust.CustCountFreqRepository;
import com.brijframework.production.repository.cust.CustProductionAppRepository;
import com.brijframework.production.repository.cust.CustUnitGroupRepository;
import com.brijframework.production.repository.cust.CustUnitRepository;
import com.brijframework.production.repository.global.GlobalCategoryGroupRepository;
import com.brijframework.production.repository.global.GlobalCategoryRepository;
import com.brijframework.production.repository.global.GlobalCountFreqRepository;
import com.brijframework.production.repository.global.GlobalUnitGroupRepository;
import com.brijframework.production.repository.global.GlobalUnitRepository;

@Component
public class ProductionMainListener implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	private GlobalCountFreqRepository globalCountFreqRepository;
	
	@Autowired
	private CustCountFreqRepository custCountFreqRepository;
	
	@Autowired
	private CustProductionAppRepository custProductionAppRepository;
	
	@Autowired
	private CustUnitGroupRepository custUnitGroupRepository;
	
	@Autowired
	private GlobalUnitGroupRepository glbUnitGroupRepository;
	
	@Autowired
	private CustUnitRepository custUnitRepository;
	
	@Autowired
	private GlobalUnitRepository glbUnitRepository;
	
	@Autowired
	private CustCategoryGroupRepository custCategoryGroupRepository;
	
	@Autowired
	private GlobalCategoryGroupRepository glbCategoryGroupRepository;
	
	@Autowired
	private CustCategoryRepository custCategoryRepository;
	
	@Autowired
	private GlobalCategoryRepository glbCategoryRepository;
	

	@Autowired
	private CustCountFreqGlobalCountFreqMapper countFreqGlobalCountFreqMapper;
	
	@Autowired
	private CustUnitGlobalUnitMapper custUnitGlobalUnitMapper;
	
	@Autowired
	private CustUnitGroupGlobalUnitGroupMapper custUnitGroupGlobalUnitGroupMapper;
	
	@Autowired
	private CustCategoryGlobalCategoryMapper custCategoryGlobalCategoryMapper;
	
	@Autowired
	private CustCategoryGroupGlobalCategoryGroupMapper custCategoryGroupGlobalCategoryGroupMapper;
	
    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {
    	
    	Optional<EOCustProductionApp> findCustProductionApp = custProductionAppRepository.findById(1L);
    	if(!findCustProductionApp.isPresent()) {
    		EOCustProductionApp custProductionApp =new EOCustProductionApp();
    		custProductionApp.setCustId(1l);
    		custProductionApp.setAppid(1l);
    		custProductionAppRepository.saveAndFlush(custProductionApp);
    	}
    	
    	List<EOCustProductionApp> custProductionApps = custProductionAppRepository.findAll();
    	
    	/// 
    	List<EOGlobalCountFreq> eoGlobalCountFreqs = globalCountFreqRepository.findAll();
    	for(EOCustProductionApp eoCustProductionApp :  custProductionApps) {
	    	for(EOGlobalCountFreq eoGlobalCountFreq :  eoGlobalCountFreqs) {
	    		Optional<EOCustCountFreq> findCustCountFreq = custCountFreqRepository.findByCustAppAndName(eoCustProductionApp.getId(), eoGlobalCountFreq.getName());
	    		if(!findCustCountFreq.isPresent()) {
	    			EOCustCountFreq eoCustCountFreq = countFreqGlobalCountFreqMapper.mapToDAO(eoGlobalCountFreq);
	    			eoCustCountFreq.setCustProductionApp(eoCustProductionApp);
	    			custCountFreqRepository.saveAndFlush(eoCustCountFreq);
	    		}
	    	}
    	}
    	
    	///
    	List<EOGlobalUnitGroup> eoGlobalUnitGroups = glbUnitGroupRepository.findAll();
    	for(EOCustProductionApp eoCustProductionApp :  custProductionApps) {
	    	for(EOGlobalUnitGroup eoGlobalUnitGroup :  eoGlobalUnitGroups) {
	    		Optional<EOCustUnitGroup> findCustUnitGroup = custUnitGroupRepository.findByCustAppAndName(eoCustProductionApp.getId(), eoGlobalUnitGroup.getName());
	    		if(!findCustUnitGroup.isPresent()) {
	    			EOCustUnitGroup eoCustUnitGroup = custUnitGroupGlobalUnitGroupMapper.mapToDAO(eoGlobalUnitGroup);
	    			eoCustUnitGroup.setCustProductionApp(eoCustProductionApp);
	    			custUnitGroupRepository.saveAndFlush(eoCustUnitGroup);
	    		}
	    	}
    	}
    	
    	///
    	List<EOGlobalUnit> eoGlobalUnits = glbUnitRepository.findAll();
    	for(EOCustProductionApp eoCustProductionApp :  custProductionApps) {
	    	for(EOGlobalUnit eoGlobalUnit :  eoGlobalUnits) {
	    		Optional<EOCustUnit> findCustUnit = custUnitRepository.findByCustAppAndName(eoCustProductionApp.getId(), eoGlobalUnit.getName());
	    		if(!findCustUnit.isPresent()) {
	    			EOCustUnit eoCustUnit = custUnitGlobalUnitMapper.mapToDAO(eoGlobalUnit);
	    			eoCustUnit.setCustProductionApp(eoCustProductionApp);
	    			custUnitRepository.saveAndFlush(eoCustUnit);
	    		}
	    	}
    	}
    	
    	///custCategoryGroupRepository
    	List<EOGlobalCategoryGroup> eoGlobalCategoryGroups = glbCategoryGroupRepository.findAll();
    	for(EOCustProductionApp eoCustProductionApp :  custProductionApps) {
	    	for(EOGlobalCategoryGroup eoGlobalCategoryGroup :  eoGlobalCategoryGroups) {
	    		Optional<EOCustCategoryGroup> findCustCategoryGroup = custCategoryGroupRepository.findByCustAppAndName(eoCustProductionApp.getId(), eoGlobalCategoryGroup.getName());
	    		if(!findCustCategoryGroup.isPresent()) {
	    			EOCustCategoryGroup eoCustCategoryGroup = custCategoryGroupGlobalCategoryGroupMapper.mapToDAO(eoGlobalCategoryGroup);
	    			eoCustCategoryGroup.setCustProductionApp(eoCustProductionApp);
	    			custCategoryGroupRepository.saveAndFlush(eoCustCategoryGroup);
	    		}
	    	}
    	}
    	
    	///
    	List<EOGlobalCategory> eoGlobalCategorys = glbCategoryRepository.findAll();
    	for(EOCustProductionApp eoCustProductionApp :  custProductionApps) {
	    	for(EOGlobalCategory eoGlobalCategory :  eoGlobalCategorys) {
	    		Optional<EOCustCategory> findCustCategory = custCategoryRepository.findByCustAppAndName(eoCustProductionApp.getId(), eoGlobalCategory.getName());
	    		if(!findCustCategory.isPresent()) {
	    			EOCustCategory eoCustCategory = custCategoryGlobalCategoryMapper.mapToDAO(eoGlobalCategory);
	    			eoCustCategory.setCustProductionApp(eoCustProductionApp);
	    			custCategoryRepository.saveAndFlush(eoCustCategory);
	    		}
	    	}
    	}
    }
}