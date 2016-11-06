package br.com.alreadyhas.elysium.model;

public class Contact extends ElysiumModelAbstract {
	private Person person;
	private Integer numberDDD;
	private Integer numberPhone;
	private String type;

	public Contact() {
	}

	public Contact(Person person, Integer numberDDD, Integer numberPhone, String name, String type) {
		this.person = person;
		this.numberDDD = numberDDD;
		this.numberPhone = numberPhone;
		this.name = name;
		this.type = type;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}