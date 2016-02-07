package com.mobile.store.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class BillingForm implements Serializable {

	static final long serialVersionUID = 1L;
	
	@Size(min = 3, max = 30)
	private String firstName;

	@Size(min = 3, max = 30)
	private String lastName;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotNull
	private Date billingDate;

	private List<String> items = new ArrayList<String>();

	@NotNull
	private String brandName;

	@NotNull
	private String modelName;

	@NotNull
	private String imei;

	private String Comments;

	private String amountInWords;

	private String amount;

	private String vatAmount;

	public String quantity;

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}

	public String getAmountInWords() {
		return amountInWords;
	}

	public void setAmountInWords(String amountInWords) {
		this.amountInWords = amountInWords;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getVatAmount() {
		return vatAmount;
	}

	public void setVatAmount(String vatAmount) {
		this.vatAmount = vatAmount;
	}

}
