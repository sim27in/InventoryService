package com.seveneleven.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_INVENTORY")
public class InventoryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "product_desc", length = 250)
	private String productDesc;

	@Column(name = "units")
	private Long units;

	@Column(name = "quantity")
	private Long quantity;

	@Column(name = "rate")
	private Long rate;

	@Column(name = "created_date")
	private LocalDate createdDate;

	@Column(name = "updated_date")
	private LocalDate updatedDate;

	@Column(name = "record_state")
	private String recordState;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public Long getUnits() {
		return units;
	}

	public void setUnits(Long units) {
		this.units = units;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getRate() {
		return rate;
	}

	public void setRate(Long rate) {
		this.rate = rate;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getRecordState() {
		return recordState;
	}

	public void setRecordState(String recordState) {
		this.recordState = recordState;
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", productName=" + productName + ", productDesc=" + productDesc + ", units="
				+ units + ", quantity=" + quantity + ", rate=" + rate + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + ", recordState=" + recordState + "]";
	}
}