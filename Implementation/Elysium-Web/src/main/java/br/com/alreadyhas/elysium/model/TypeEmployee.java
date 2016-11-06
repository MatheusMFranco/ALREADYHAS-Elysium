package br.com.alreadyhas.elysium.model;

import java.util.Date;

public class TypeEmployee extends ElysiumModelAbstract {

	public TypeEmployee() {
	}

	public TypeEmployee(String name, Date dateRegister) {
		this.name = name;
		this.dateRegister = dateRegister;
	}

}
