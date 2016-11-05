package br.com.alreadyhas.elysium.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.alreadyhas.elysium.abstraction.IElysiumModel;

public class Equipment implements IElysiumModel {
	private Long id;
	private Consultation consultation;
	private Date dateRegister;
	private String description;
	private String name;

	public Equipment() {
	}

	public Equipment(Consultation consultation, Date dateRegister, String description, String name) {
		super();
		this.consultation = consultation;
		this.dateRegister = dateRegister;
		this.description = description;
		this.name = name;
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

	@Override
	public Date getDateRegister() {
		return dateRegister;
	}

	@Override
	public void setDateRegister(Date dateRegister) {
		this.dateRegister = dateRegister;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
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
