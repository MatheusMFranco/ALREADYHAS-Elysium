package br.com.odontoelysium.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.odontoelysium.abstraction.IElysiumModel;

public class Email implements IElysiumModel {
	private Long id;
	private Person person;
	private String emailAddress;
	private String name;
	private String type;
	private Date dateRegister;

	public Email() {
	}

	public Email(Person person, String emailAddress, String name, String type) {
		super();
		this.person = person;
		this.emailAddress = emailAddress;
		this.name = name;
		this.type = type;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
