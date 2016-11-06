package br.com.alreadyhas.elysium.util;

public enum Info {
	AUTHOR("Matheus Franco"), SYSTEM("Elysium"), VERSION("1.0"), CONTACT("francommatheus@gmail.com");

	private String value;

	Info(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
