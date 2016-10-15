package br.com.odontoelysium.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.odontoelysium.abstraction.IElysiumModel;

public class Medicament implements IElysiumModel {
	private Long id;
	private Consultation consultation;
	private Integer amount;
	private Integer intervalDays;
	private String leaflet;
	private String name;
	private String reason;
	private Date dateRegister;
	private Date intervalHours;

	public Medicament() {
	}

	public Medicament(Consultation consultation, Integer amount, Integer intervalDays, String leaflet, String name, String reason, Date dateRegister,
			Date intervalHours) {
		super();
		this.consultation = consultation;
		this.amount = amount;
		this.intervalDays = intervalDays;
		this.leaflet = leaflet;
		this.name = name;
		this.reason = reason;
		this.dateRegister = dateRegister;
		this.intervalHours = intervalHours;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public Consultation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getIntervalDays() {
		return intervalDays;
	}

	public void setIntervalDays(Integer intervalDays) {
		this.intervalDays = intervalDays;
	}

	public String getLeaflet() {
		return leaflet;
	}

	public void setLeaflet(String leaflet) {
		this.leaflet = leaflet;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public Date getDateRegister() {
		return dateRegister;
	}

	@Override
	public void setDateRegister(Date dateRegister) {
		this.dateRegister = dateRegister;
	}

	public Date getIntervalHours() {
		return intervalHours;
	}

	public void setIntervalHours(Date intervalHours) {
		this.intervalHours = intervalHours;
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
