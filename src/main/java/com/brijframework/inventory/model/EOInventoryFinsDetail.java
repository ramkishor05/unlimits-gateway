package com.brijframework.inventory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EOInventoryFinsDetail {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	
	@ManyToOne
	@JoinColumn(name="INVENTORY_ID")
	EOInventoryManager inventory;
}
