package br.com.alreadyhas.elysium.model;

import java.util.Date;

public class Consultation extends ElysiumModelAbstract {
	private Employee employee;
	private Patient patient;
	private TypeConsultation typeConsultation;
	private Invoice invoice;
	private Boolean attendance;
	private String anotation;
	private String typePayment;
	private Date dateScheduling;
	private Date dateReturn;

	public Consultation() {
	}

	public Consultation(Employee employee, Patient patient, TypeConsultation typeConsultation, Invoice invoice, Boolean attendance, String anotation,
			String typePayment, Date dateRegister, Date dateScheduling, Date dateReturn) {
		this.employee = employee;
		this.patient = patient;
		this.typeConsultation = typeConsultation;
		this.invoice = invoice;
		this.attendance = attendance;
		this.anotation = anotation;
		this.typePayment = typePayment;
		this.dateScheduling = dateScheduling;
		this.dateReturn = dateReturn;
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

	public TypeConsultation getTypeConsultation() {
		return typeConsultation;
	}

	public void setTypeConsultation(TypeConsultation typeConsultation) {
		this.typeConsultation = typeConsultation;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Boolean getAttendance() {
		return attendance;
	}

	public void setAttendance(Boolean attendance) {
		this.attendance = attendance;
	}

	public String getAnotation() {
		return anotation;
	}

	public void setAnotation(String anotation) {
		this.anotation = anotation;
	}

	public String getTypePayment() {
		return typePayment;
	}

	public void setTypePayment(String typePayment) {
		this.typePayment = typePayment;
	}

	public Date getDateScheduling() {
		return dateScheduling;
	}

	public void setDateScheduling(Date dateScheduling) {
		this.dateScheduling = dateScheduling;
	}

	public Date getDateReturn() {
		return dateReturn;
	}

	public void setDateReturn(Date dateReturn) {
		this.dateReturn = dateReturn;
	}
}
