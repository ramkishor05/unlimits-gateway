package com.brijframework.production.entities;

import static com.brijframework.production.contants.Constants.EOGLOBAL_CATEGORY_GROUP;
import static com.brijframework.production.contants.Constants.*;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOGLOBAL_CATEGORY_GROUP, uniqueConstraints = { @UniqueConstraint(columnNames = { NAME }) })
public class EOGlobalCategoryGroup extends EOEntityObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = NAME)
	private String name;

	@Column(name = DESC)
	private String desc;

	@Column(name = TYPE_ID)
	private String typeId;

	@OneToMany(mappedBy = GLB_CATEGORY_GROUP)
	public Set<EOGlobalCategory> categoryArray;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public Set<EOGlobalCategory> getCategoryArray() {
		return categoryArray;
	}

	public void setCategoryArray(Set<EOGlobalCategory> categoryArray) {
		this.categoryArray = categoryArray;
	}

}
