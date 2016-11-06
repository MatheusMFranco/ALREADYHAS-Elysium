package br.com.alreadyhas.elysium.model;

public class Photo extends ElysiumModelAbstract {
	private Consultation consultation;
	private String description;
	private Byte file;

	public Photo() {
	}

	public Photo(Consultation consultation, String description, String name, Byte file) {
		this.consultation = consultation;
		this.description = description;
		this.name = name;
		this.file = file;
	}

	public Consultation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Byte getFile() {
		return file;
	}

	public void setFile(Byte file) {
		this.file = file;
	}
}
