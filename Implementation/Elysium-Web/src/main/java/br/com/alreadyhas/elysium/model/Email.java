package br.com.alreadyhas.elysium.model;

public class Email extends ElysiumModelAbstract {
	private Person person;
	private String emailAddress;
	private String type;

	public Email() {
	}

	public Email(Person person, String emailAddress, String name, String type) {
		this.person = person;
		this.emailAddress = emailAddress;
		this.name = name;
		this.type = type;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
