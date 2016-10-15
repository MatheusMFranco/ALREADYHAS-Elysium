package br.com.odontoelysium.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.odontoelysium.abstraction.IElysiumModel;

public class Holiday implements IElysiumModel {
	private Long id;
	private String country;
	private String name;
	private String state;
	private Date dateHoliday;
	private Date dateRegister;

	public Holiday() {
	}

	public Holiday(Long id, String country, String name, String state, Date dateHoliday, Date dateRegister) {
		super();
		this.id = id;
		this.country = country;
		this.name = name;
		this.state = state;
		this.dateHoliday = dateHoliday;
		this.dateRegister = dateRegister;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getDateHoliday() {
		return dateHoliday;
	}

	public void setDateHoliday(Date dateHoliday) {
		this.dateHoliday = dateHoliday;
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
