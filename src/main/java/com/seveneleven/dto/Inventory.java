package com.seveneleven.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Inventory {
	
	 private String productName;
     private String productDesc;
     private Long units;
     private Long quantity;
     private Long rate;
     private LocalDate createdDate;
     private LocalDate updatedDate;
     private String recordState;
	
     
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
		return "Inventory [productName=" + productName + ", productDesc=" + productDesc + ", units=" + units
				+ ", quantity=" + quantity + ", rate=" + rate + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + ", recordState=" + recordState + "]";
	}
}
