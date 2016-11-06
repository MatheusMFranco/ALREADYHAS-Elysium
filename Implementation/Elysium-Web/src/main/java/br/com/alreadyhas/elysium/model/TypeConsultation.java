package br.com.alreadyhas.elysium.model;

import java.util.Date;

public class TypeConsultation extends ElysiumModelAbstract {

	public TypeConsultation() {
	}

	public TypeConsultation(String name, Date dateRegister) {
		this.name = name;
		this.dateRegister = dateRegister;
	}
}
