package com.brijframework.inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.brijframework.inventory.contants.CountFreq;
import com.brijframework.inventory.model.EOCountFreq;
import com.brijframework.inventory.repository.CountFreqRepository;

@Component
public class InventoryMainListener implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	CountFreqRepository countFreqRepository;
	
    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {
    	
    	
    }
}