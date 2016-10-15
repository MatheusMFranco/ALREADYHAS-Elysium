package br.com.odontoelysium.persistence;

public enum Table {

	ADDRESS("Address"),
	CONSULTATION("Consultation"),
	CONTACT("Contact"),
	EMAIL("E-Mail"),
	EMPLOYEE("Employee"),
	EQUIPMENT("Equipment"),
	EXAM("Exam"),
	INVOICE("Invoice"),
	MEDICAMENT("Medicament"),
	PATIENT("Patient"),
	PERSON("Person"),
	PHOTO("Photo"),
	TYPE_CONSULTATION("Type Consultation"),
	TYPE_EMPLOYEE("Type Employee");

	public String title;

	Table(String title) {
		this.title = title; 
	}
}
