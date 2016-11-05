package br.com.alreadyhas.elysium.abstraction;

import java.util.Date;

public interface IElysiumModel {
	Long getId();

	void setId(Long id);

	String getName();

	void setName(String name);

	Date getDateRegister();

	void setDateRegister(Date dateRegister);

	String brDateRegister();

	@Override
	String toString();

}
