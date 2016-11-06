package br.com.alreadyhas.elysium.persistence;

public enum Format {
	FORMAT_BR_HYPHEN("dd-MM-yyyy"), FORMAT_EN_HYPHEN("MM-dd-yyyy"), FORMAT_BR_BAR("dd/MM/yyyy"), FORMAT_EN_BAR("MM/dd/yyyy");

	private String dateFormat;

	Format(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	public String getDateFormat() {
		return dateFormat;
	}
}
