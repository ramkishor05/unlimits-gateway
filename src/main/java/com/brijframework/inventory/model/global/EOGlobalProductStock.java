package com.brijframework.inventory.model.global;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table
public class EOGlobalProductStock implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDt;

	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDt;

	private String createUid;

	private String updateUid;

	private Long quantity_added;
	private Long quantity_remaining;

	@ManyToOne
	@JoinColumn(name = "ProductID")
	private EOCustProduct product;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public Date getUpdateDt() {
		return updateDt;
	}

	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}

	public String getCreateUid() {
		return createUid;
	}

	public void setCreateUid(String createUid) {
		this.createUid = createUid;
	}

	public String getUpdateUid() {
		return updateUid;
	}

	public void setUpdateUid(String updateUid) {
		this.updateUid = updateUid;
	}

	public Long getQuantity_added() {
		return quantity_added;
	}

	public void setQuantity_added(Long quantity_added) {
		this.quantity_added = quantity_added;
	}

	public Long getQuantity_remaining() {
		return quantity_remaining;
	}

	public void setQuantity_remaining(Long quantity_remaining) {
		this.quantity_remaining = quantity_remaining;
	}

	public EOCustProduct getProduct() {
		return product;
	}

	public void setProduct(EOCustProduct product) {
		this.product = product;
	}

}
