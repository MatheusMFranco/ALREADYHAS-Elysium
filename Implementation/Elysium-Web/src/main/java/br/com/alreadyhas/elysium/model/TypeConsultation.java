package br.com.alreadyhas.elysium.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.alreadyhas.elysium.abstraction.IElysiumModel;

public class TypeConsultation implements IElysiumModel {
	private Long id;
	private String name;
	private Date dateRegister;

	public TypeConsultation() {
	}

	public TypeConsultation(String name, Date dateRegister) {
		super();
		this.name = name;
		this.dateRegister = dateRegister;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
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
	public Date getDateRegister() {
		return dateRegister;
	}

	@Override
	public void setDateRegister(Date dateRegister) {
		this.dateRegister = dateRegister;
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
