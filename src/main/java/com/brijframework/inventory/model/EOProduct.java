package com.brijframework.inventory.model;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "idenNo" }) })
public class EOProduct extends EOItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public long id;

	public double price;

	@OneToOne
	@JoinColumn(name = "imgID")
	public EOImgDetail eoImgDetail;

	@ManyToOne
	@JoinColumn(name = "InvAppID")
	public EOInvApp eoInvApp;

	@OneToOne
	@JoinColumn(name = "CategoryID")
	public EOCategory eoCategory;

	@OneToMany(mappedBy = "eoProduct")
	public Set<EORecipe> eoRecipeArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoProduct")
	public Set<EOProductDetail> eoProductDetailArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoProduct")
	public Set<EOProdLocation> eoProdLocationArray = new LinkedHashSet<>();

	

	public String logURL() {
		return this.eoImgDetail != null ? this.eoImgDetail.url : "";
	}
}
