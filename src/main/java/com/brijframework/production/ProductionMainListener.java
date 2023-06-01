package com.brijframework.production;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.brijframework.production.repository.GlobalCountFreqRepository;

@Component
public class ProductionMainListener implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	GlobalCountFreqRepository countFreqRepository;
	
    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {
    	
    	
    }
}