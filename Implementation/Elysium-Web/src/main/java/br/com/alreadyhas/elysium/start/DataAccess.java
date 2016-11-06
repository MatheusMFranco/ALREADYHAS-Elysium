package br.com.alreadyhas.elysium.start;

import java.util.Scanner;

import br.com.alreadyhas.elysium.message.DataMessage;
import br.com.alreadyhas.elysium.util.ElysiumObject;

public class DataAccess extends ElysiumObject {

	private static String user;
	private static String password;
	private static Scanner INPUT = new Scanner(System.in);
	private static DataAccess instance;

	private DataAccess() {
		CONSOLE.credits();
	}

	public static synchronized DataAccess getInstance() {
		if (instance == null) {
			instance = new DataAccess();
			insertUser();
			insertPassword();
		}
		return instance;
	}

	private static void insertPassword() {
		DataMessage.inputMessage("password");
		password = INPUT.next();
	}

	private static void insertUser() {
		DataMessage.inputMessage("user");
		user = INPUT.next();
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}
}
