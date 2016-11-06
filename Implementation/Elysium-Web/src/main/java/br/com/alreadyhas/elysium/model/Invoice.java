package br.com.alreadyhas.elysium.model;

import java.util.Date;

public class Invoice extends ElysiumModelAbstract {
	private Float price;
	private String enterprise;
	private String situation;
	private Date dateDue;
	private Date datePay;

	public Invoice() {
	}

	public Invoice(Float price, String enterprise, String name, String situation, Date dateDue, Date dateRegister, Date datePay) {
		this.price = price;
		this.enterprise = enterprise;
		this.name = name;
		this.situation = situation;
		this.dateDue = dateDue;
		this.dateRegister = dateRegister;
		this.datePay = datePay;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public Date getDateDue() {
		return dateDue;
	}

	public void setDateDue(Date dateDue) {
		this.dateDue = dateDue;
	}

	public Date getDatePay() {
		return datePay;
	}

	public void setDatePay(Date datePay) {
		this.datePay = datePay;
	}
}
