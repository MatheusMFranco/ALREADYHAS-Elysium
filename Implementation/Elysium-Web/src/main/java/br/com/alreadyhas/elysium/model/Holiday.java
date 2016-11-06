package br.com.alreadyhas.elysium.model;

import java.util.Date;

public class Holiday extends ElysiumModelAbstract {
	private String country;
	private String state;
	private Date dateHoliday;

	public Holiday() {
	}

	public Holiday(Long id, String country, String name, String state, Date dateHoliday, Date dateRegister) {
		this.country = country;
		this.name = name;
		this.state = state;
		this.dateHoliday = dateHoliday;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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
}
