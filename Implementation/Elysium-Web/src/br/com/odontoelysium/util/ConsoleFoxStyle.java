package br.com.odontoelysium.util;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import br.com.odontoelysium.abstraction.IConsole;

public class ConsoleFoxStyle implements IConsole {

	private static final String USER_SEPARATOR = ">";
	private String CONTAINER_CHARACTER = "=";
	private String SPACE_CHARACTER = " ";
	private int CONTAINER_AMOUNT = 70;
	private int SPACE_AMOUNT = 10;

	private String username;

	public ConsoleFoxStyle(String username) {
		this.username = username + USER_SEPARATOR + getSpace(1);
	}

	private String removeCharacterOfArray(String array) {
		return array.replace(", ", "").replace("[", "").replace("]", "");
	}

	/**
	 * Method for list of container character.
	 * 
	 * @return String
	 */
	private String getContainer() {
		List<String> container = new ArrayList<String>();

		for (int i = 0; i <= CONTAINER_AMOUNT; i++) {
			container.add(CONTAINER_CHARACTER);
		}

		return removeCharacterOfArray(container.toString());
	}

	/**
	 * Method for list of spaces.
	 * 
	 * @param int times
	 * @return String
	 */
	private String getSpace(int times) {
		List<String> spaces = new ArrayList<String>();

		for (int i = 0; i <= SPACE_AMOUNT * times; i++) {
			spaces.add(SPACE_CHARACTER);
		}

		return removeCharacterOfArray(spaces.toString());
	}

	@Override
	public void write(String message) {
		System.out.println(username + message);
	}

	@Override
	public void info(ConsoleMessage type, String message) {
		System.out.println("[" + type + "] " + getSpace(1) + message);
	}

	@Override
	public void featured(String message) {
		breakLine();
		line();
		System.out.println(getSpace(2) + message.toUpperCase());
		line();
	}

	@Override
	public void line() {
		System.out.println(getContainer());
	}

	@Override
	public void breakLine() {
		System.out.println("");
	}

	@Override
	public void credits() {
		breakLine();
		line();

		String wordKey, wordValue;
		for (int i = 0; i < Info.values().length; i++) {
			wordKey = "* " + Info.values()[i] + ":";

			if (i < 2)
				wordKey += " ";

			wordValue = getSpace(1) + Info.values()[i].value;

			System.out.println(wordKey + wordValue);
		}

		line();
		breakLine();
	}

	@Override
	public Date currentDate() {
		return new Date(new java.util.Date().getTime());
	}
}
