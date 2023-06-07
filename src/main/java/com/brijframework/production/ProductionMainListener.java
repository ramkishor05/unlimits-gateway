package com.brijframework.production;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.brijframework.production.entities.cust.EOCustProductionApp;
import com.brijframework.production.repository.GlobalCountFreqRepository;
import com.brijframework.production.repository.cust.CustProductionAppRepository;

@Component
public class ProductionMainListener implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	GlobalCountFreqRepository countFreqRepository;
	
	@Autowired
	CustProductionAppRepository custProductionAppRepository;
	
    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {
    	
    	Optional<EOCustProductionApp> findCustProductionApp = custProductionAppRepository.findById(1L);
    	if(!findCustProductionApp.isPresent()) {
    		EOCustProductionApp custProductionApp =new EOCustProductionApp();
    		custProductionApp.setCustId(1l);
    		custProductionApp.setAppid(1l);
    		custProductionAppRepository.saveAndFlush(custProductionApp);
    	}
    }
}