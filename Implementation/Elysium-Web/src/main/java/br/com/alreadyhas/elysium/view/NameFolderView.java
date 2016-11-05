package br.com.alreadyhas.elysium.view;

public enum NameFolderView {

	STYLESHEET("stylesheet"), HEADER("header"), NAVBAR("navbar"), FOOTER("footer");

	private String name;
	private String DIRECTORY = "META-INF/template/";

	private NameFolderView(String name) {
		this.name = name;
	}

	public String getUrlTemplate(int directoryNumber) {

		String directorys = "../";

		for (int i = 1; i < directoryNumber; i++) {
			directorys += "../";
		}

		return directorys + DIRECTORY + name;
	}

	public String getName() {
		return name;
	}
}
