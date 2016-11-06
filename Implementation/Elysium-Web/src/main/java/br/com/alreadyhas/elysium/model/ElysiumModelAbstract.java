package br.com.alreadyhas.elysium.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.alreadyhas.elysium.abstraction.IElysiumModel;
import br.com.alreadyhas.elysium.persistence.Format;
import br.com.alreadyhas.elysium.util.ElysiumObject;

public abstract class ElysiumModelAbstract extends ElysiumObject implements IElysiumModel {
	protected Long id;
	protected Date dateRegister;
	protected String name;

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
		SimpleDateFormat dateFormat = new SimpleDateFormat(Format.FORMAT_BR_BAR.getDateFormat());
		return dateFormat.format(dateRegister);
	}

	@Override
	public String toString() {
		return BAR_SEPARATOR + id + BAR_SEPARATOR + brDateRegister() + BAR_SEPARATOR + name;
	}
}
