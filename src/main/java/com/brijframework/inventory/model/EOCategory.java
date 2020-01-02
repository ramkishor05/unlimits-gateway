package com.brijframework.inventory.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class EOCategory implements Serializable {

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

	@Column(name = "CATEGORY_NAME")
	private String name;

	@Column(name = "CATEGORY_DESC")
	private String description;

	@Column(name = "CATEGORY_TYPE_ID")
	private String type;

	@JoinColumn(name = "APP_ID", nullable = false)
	@ManyToOne
	private EOInventoryApp inventoryApp;

	@ManyToOne
	@JoinColumn(name = "CATEGORY_GROUP_ID", nullable = false)
	private EOCategoryGroup categoryGroup;

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

	public EOCategoryGroup getCategoryGroup() {
		return categoryGroup;
	}

	public void setCategoryGroup(EOCategoryGroup categoryGroup) {
		this.categoryGroup = categoryGroup;
	}

}
