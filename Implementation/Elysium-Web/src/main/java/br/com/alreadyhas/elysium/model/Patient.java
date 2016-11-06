package br.com.alreadyhas.elysium.model;

public class Patient extends ElysiumModelAbstract {
	private String enterprise;
	private String agreement;
	private String characteristics;
	private String responsible;

	public Patient() {
	}

	public Patient(String enterprise, String agreement, String characteristics, String responsible) {
		this.enterprise = enterprise;
		this.agreement = agreement;
		this.characteristics = characteristics;
		this.responsible = responsible;
	}

	public String getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}

	public String getAgreement() {
		return agreement;
	}

	public void setAgreement(String agreement) {
		this.agreement = agreement;
	}

	public String getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}

	public String getResponsible() {
		return responsible;
	}

	public void setResponsible(String responsible) {
		this.responsible = responsible;
	}
}
