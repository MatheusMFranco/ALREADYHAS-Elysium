package br.com.alreadyhas.elysium.model;

import java.util.Date;

public class Medicament extends ElysiumModelAbstract {
	private Consultation consultation;
	private Integer amount;
	private Integer intervalDays;
	private String leaflet;
	private String reason;
	private Date intervalHours;

	public Medicament() {
	}

	public Medicament(Consultation consultation, Integer amount, Integer intervalDays, String leaflet, String name, String reason, Date dateRegister,
			Date intervalHours) {
		this.consultation = consultation;
		this.amount = amount;
		this.intervalDays = intervalDays;
		this.leaflet = leaflet;
		this.name = name;
		this.reason = reason;
		this.dateRegister = dateRegister;
		this.intervalHours = intervalHours;
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

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getIntervalHours() {
		return intervalHours;
	}

	public void setIntervalHours(Date intervalHours) {
		this.intervalHours = intervalHours;
	}
}