package br.com.odontoelysium.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.odontoelysium.abstraction.IElysiumModel;

public class Contact implements IElysiumModel {
	private Long id;
	private Date dateRegister;
	private Person person;
	private Integer numberDDD;
	private Integer numberPhone;
	private String name;
	private String type;

	public Contact() {
	}

	public Contact(Person person, Integer numberDDD, Integer numberPhone, String name, String type) {
		super();
		this.person = person;
		this.numberDDD = numberDDD;
		this.numberPhone = numberPhone;
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

	public Integer getNumberDDD() {
		return numberDDD;
	}

	public void setNumberDDD(Integer numberDDD) {
		this.numberDDD = numberDDD;
	}

	public Integer getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(Integer numberPhone) {
		this.numberPhone = numberPhone;
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