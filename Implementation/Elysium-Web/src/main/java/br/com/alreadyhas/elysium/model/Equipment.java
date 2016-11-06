package br.com.alreadyhas.elysium.model;

import java.util.Date;

public class Equipment extends ElysiumModelAbstract {
	private Consultation consultation;
	private String description;

	public Equipment() {
	}

	public Equipment(Consultation consultation, Date dateRegister, String description, String name) {
		this.consultation = consultation;
		this.dateRegister = dateRegister;
		this.description = description;
		this.name = name;
	}

	public Consultation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
