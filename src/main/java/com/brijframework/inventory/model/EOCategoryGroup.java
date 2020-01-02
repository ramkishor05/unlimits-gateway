package com.brijframework.inventory.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class EOCategoryGroup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@Column(name = "CATEGORY_ID")
	private String categoryId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "DESC")
	private String description;

	@Column(name = "TYPE")
	private String type;
	
	@ManyToOne
	@JoinColumn(name = "APP_ID", nullable = false)
	public EOInventoryApp inventoryApp;

	@OneToMany(mappedBy = "categoryGroup")
	public Set<EOCategory> categoryArray;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public EOInventoryApp getInventoryApp() {
		return inventoryApp;
	}

	public void setInventoryApp(EOInventoryApp inventoryApp) {
		this.inventoryApp = inventoryApp;
	}

	public Set<EOCategory> getCategoryArray() {
		return categoryArray;
	}

	public void setCategoryArray(Set<EOCategory> categoryArray) {
		this.categoryArray = categoryArray;
	}

}
