package br.com.alreadyhas.elysium.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.alreadyhas.elysium.abstraction.IElysiumModel;

public class Address implements IElysiumModel {

	private Long id;
	private String name;
	private Date dateRegister;
	private Person person;
	private Integer cep;
	private String city;
	private String fullAddress;
	private String state;

	public Address() {
	}

	public Address(Person person, String city, String fullAddress, String state) {
		super();
		this.person = person;
		this.city = city;
		this.fullAddress = fullAddress;
		this.state = state;
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

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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
