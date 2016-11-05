package br.com.alreadyhas.elysium.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.alreadyhas.elysium.abstraction.IElysiumModel;

public class Employee implements IElysiumModel {

	private Long id;
	private TypeEmployee typeEmployee;
	private Integer workingPapers;
	private Float salary;
	private String name;
	private String situation;
	private String supervisor;
	private Date dateContract;
	private Date dateClosing;
	private Date dateRegister;

	public Employee() {
	}

	public Employee(TypeEmployee typeEmployee, Integer workingPapers, Float salary, Date dateContract) {
		super();
		this.typeEmployee = typeEmployee;
		this.workingPapers = workingPapers;
		this.salary = salary;
		this.dateContract = dateContract;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public TypeEmployee getTypeEmployee() {
		return typeEmployee;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public void setTypeEmployee(TypeEmployee typeEmployee) {
		this.typeEmployee = typeEmployee;
	}

	public Integer getWorkingPapers() {
		return workingPapers;
	}

	public void setWorkingPapers(Integer workingPapers) {
		this.workingPapers = workingPapers;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	public Date getDateContract() {
		return dateContract;
	}

	public void setDateContract(Date dateContract) {
		this.dateContract = dateContract;
	}

	public Date getDateClosing() {
		return dateClosing;
	}

	public void setDateClosing(Date dateClosing) {
		this.dateClosing = dateClosing;
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
