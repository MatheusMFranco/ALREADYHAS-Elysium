package br.com.alreadyhas.elysium.model;

import java.util.Date;

public class Person extends ElysiumModelAbstract {
	private Employee employee;
	private Patient patient;
	private Integer cpf;
	private Integer identity;
	private String lastName;
	private String maritalStatus;
	private String naturalness;
	private String occupation;
	private String password;
	private String registration;
	private String organInssuerRG;
	private String spouse;
	private String userType;
	private Date dateBirth;
	private Date dateIssuerRG;
	private Byte photo;
	private char gender;

	public Person() {
	}

	public Person(Integer cpf, String name, String lastName, String maritalStatus, String naturalness, String occupation, String password,
			String registration, String organInssuerRG, String userType, Date dateBirth, Date dateRegister, Date dateIssuerRG, char gender) {
		this.cpf = cpf;
		this.name = name;
		this.lastName = lastName;
		this.maritalStatus = maritalStatus;
		this.naturalness = naturalness;
		this.occupation = occupation;
		this.password = password;
		this.registration = registration;
		this.organInssuerRG = organInssuerRG;
		this.userType = userType;
		this.dateBirth = dateBirth;
		this.dateIssuerRG = dateIssuerRG;
		this.gender = gender;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Integer getIdentity() {
		return identity;
	}

	public void setIdentity(Integer identity) {
		this.identity = identity;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getNaturalness() {
		return naturalness;
	}

	public void setNaturalness(String naturalness) {
		this.naturalness = naturalness;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getOrganInssuerRG() {
		return organInssuerRG;
	}

	public void setOrganInssuerRG(String organInssuerRG) {
		this.organInssuerRG = organInssuerRG;
	}

	public String getSpouse() {
		return spouse;
	}

	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public Date getDateIssuerRG() {
		return dateIssuerRG;
	}

	public void setDateIssuerRG(Date dateIssuerRG) {
		this.dateIssuerRG = dateIssuerRG;
	}

	public Byte getPhoto() {
		return photo;
	}

	public void setPhoto(Byte photo) {
		this.photo = photo;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}