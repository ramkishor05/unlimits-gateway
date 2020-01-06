package com.brijframework.inventory.model.global;

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

import com.brijframework.inventory.model.EOInventoryApp;

@Entity
public class EOGlobalCategoryGroup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@Column(name = "CATEGORY_GRP_ID")
	private String categoryId;

	@Column(name = "CATEGORY_GRP_NAME")
	private String name;

	@Column(name = "CATEGORY_GRP_DESC")
	private String description;

	@Column(name = "CATEGORY_GRP_TYPE_ID")
	private String typeId;
	
	@ManyToOne
	@JoinColumn(name = "APP_ID", nullable = false)
	public EOInventoryApp inventoryApp;

	@OneToMany(mappedBy = "categoryGroup")
	public Set<EOGlobalCategory> categoryArray;

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

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public EOInventoryApp getInventoryApp() {
		return inventoryApp;
	}

	public void setInventoryApp(EOInventoryApp inventoryApp) {
		this.inventoryApp = inventoryApp;
	}

	public Set<EOGlobalCategory> getCategoryArray() {
		return categoryArray;
	}

	public void setCategoryArray(Set<EOGlobalCategory> categoryArray) {
		this.categoryArray = categoryArray;
	}

}
