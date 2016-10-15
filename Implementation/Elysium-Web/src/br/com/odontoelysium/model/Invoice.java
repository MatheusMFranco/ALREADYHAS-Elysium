package br.com.odontoelysium.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.odontoelysium.abstraction.IElysiumModel;

public class Invoice implements IElysiumModel {
	private Long id;
	private Float price;
	private String enterprise;
	private String name;
	private String situation;
	private Date dateDue;
	private Date dateRegister;
	private Date datePay;

	public Invoice() {
	}

	public Invoice(Float price, String enterprise, String name, String situation, Date dateDue, Date dateRegister, Date datePay) {
		super();
		this.price = price;
		this.enterprise = enterprise;
		this.name = name;
		this.situation = situation;
		this.dateDue = dateDue;
		this.dateRegister = dateRegister;
		this.datePay = datePay;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
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

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
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

	@Override
	public Date getDateRegister() {
		return dateRegister;
	}

	@Override
	public void setDateRegister(Date dateRegister) {
		this.dateRegister = dateRegister;
	}

	public Date getDatePay() {
		return datePay;
	}

	public void setDatePay(Date datePay) {
		this.datePay = datePay;
	}

	@Override
	public String brDateRegister() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.format(dateRegister);
	}

	@Override
	public String toString() {
		return "| " + id + " | " + brDateRegister() + " | " + name;
	}
}
