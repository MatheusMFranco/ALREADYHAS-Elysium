package br.com.alreadyhas.elysium.model;

public class Address extends ElysiumModelAbstract {
	private Person person;
	private Integer cep;
	private String city;
	private String fullAddress;
	private String state;

	public Address() {
	}

	public Address(Person person, String city, String fullAddress, String state) {
		this.person = person;
		this.city = city;
		this.fullAddress = fullAddress;
		this.state = state;
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
}
