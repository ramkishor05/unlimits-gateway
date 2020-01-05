package com.brijframework.inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.brijframework.inventory.repository.InventoryCountFreqRepository;

@Component
public class InventoryMainListener implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	InventoryCountFreqRepository countFreqRepository;
	
    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {
    	
    	
    }
}