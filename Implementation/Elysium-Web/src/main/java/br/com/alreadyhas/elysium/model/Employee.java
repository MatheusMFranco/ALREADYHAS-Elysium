package br.com.alreadyhas.elysium.model;

import java.util.Date;

public class Employee extends ElysiumModelAbstract {
	private TypeEmployee typeEmployee;
	private Integer workingPapers;
	private Float salary;
	private String situation;
	private String supervisor;
	private Date dateContract;
	private Date dateClosing;

	public Employee() {
	}

	public Employee(TypeEmployee typeEmployee, Integer workingPapers, Float salary, Date dateContract) {
		this.typeEmployee = typeEmployee;
		this.workingPapers = workingPapers;
		this.salary = salary;
		this.dateContract = dateContract;
	}

	public TypeEmployee getTypeEmployee() {
		return typeEmployee;
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
}
