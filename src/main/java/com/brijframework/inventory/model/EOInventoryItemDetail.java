package com.brijframework.inventory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EOInventoryItemDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	
	@ManyToOne
	EOInventoryManager inventory;
}
