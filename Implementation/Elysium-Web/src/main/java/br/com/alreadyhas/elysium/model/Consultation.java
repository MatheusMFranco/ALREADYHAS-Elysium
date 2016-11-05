package br.com.alreadyhas.elysium.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.alreadyhas.elysium.abstraction.IElysiumModel;

public class Consultation implements IElysiumModel {
	private Long id;
	private String name;
	private Employee employee;
	private Patient patient;
	private TypeConsultation typeConsultation;
	private Invoice invoice;
	private Boolean attendance;
	private String anotation;
	private String typePayment;
	private Date dateRegister;
	private Date dateScheduling;
	private Date dateReturn;

	public Consultation() {
	}

	public Consultation(Employee employee, Patient patient, TypeConsultation typeConsultation, Invoice invoice, Boolean attendance, String anotation,
			String typePayment, Date dateRegister, Date dateScheduling, Date dateReturn) {
		super();
		this.employee = employee;
		this.patient = patient;
		this.typeConsultation = typeConsultation;
		this.invoice = invoice;
		this.attendance = attendance;
		this.anotation = anotation;
		this.typePayment = typePayment;
		this.dateRegister = dateRegister;
		this.dateScheduling = dateScheduling;
		this.dateReturn = dateReturn;
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

	@Override
	public Date getDateRegister() {
		return dateRegister;
	}

	@Override
	public void setDateRegister(Date dateRegister) {
		this.dateRegister = dateRegister;
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
