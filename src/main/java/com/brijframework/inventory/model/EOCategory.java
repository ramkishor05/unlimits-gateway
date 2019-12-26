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
@Table(name="CATEGORY")
public  class EOCategory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="CATEGORY_ID")
	private String categoryId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DESC")
	private String description;
	
	@Column(name="TYPE")
	private String type;

	@ManyToOne
	@JoinColumn(name="InvAppID",nullable=false)
	private EOInvApp eoInvApp;
	
	@ManyToOne
	@JoinColumn(name = "CategoryGroupID",nullable=false)
	private EOCategoryGroup categoryGroup;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoryID() {
		return categoryId;
	}

	public void setCategoryID(String categoryID) {
		this.categoryId = categoryID;
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
		this.type= type;
	}

	public EOInvApp getEoInvApp() {
		return eoInvApp;
	}

	public void setEoInvApp(EOInvApp eoInvApp) {
		this.eoInvApp = eoInvApp;
	}

	public EOCategoryGroup getCategoryGroup() {
		return categoryGroup;
	}

	public void setCategoryGroup(EOCategoryGroup categoryGroup) {
		this.categoryGroup = categoryGroup;
	}

	
	
}
