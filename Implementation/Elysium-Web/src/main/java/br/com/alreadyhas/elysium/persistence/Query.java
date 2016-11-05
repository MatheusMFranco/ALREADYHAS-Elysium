package br.com.alreadyhas.elysium.persistence;

public enum Query {
	FORMAT_BR("dd-mm-yyyy"), FORMAT_EN("mm-dd-yyyy");

	public String dateFormat;

	Query(String dateFormat) {
		this.dateFormat = dateFormat;
	}
}
