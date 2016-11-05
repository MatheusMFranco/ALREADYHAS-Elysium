package br.com.alreadyhas.elysium.message;

import br.com.alreadyhas.elysium.util.ConsoleMessage;
import br.com.alreadyhas.elysium.util.ElysiumObject;

public abstract class DataMessage extends ElysiumObject {
	public static void informationFetchingData() {
		CONSOLE.info(ConsoleMessage.INFORMATION, "Fetching data...");
	}

	public static void informationRidingList() {
		CONSOLE.info(ConsoleMessage.INFORMATION, "Riding the list...");
	}

	public static void informationExecutedInDate() {
		CONSOLE.breakLine();
		CONSOLE.info(ConsoleMessage.INFORMATION, "Executed in: " + CURRENT_DAY);
	}

	public static void informationConnecting() {
		CONSOLE.info(ConsoleMessage.INFORMATION, "Connecting...");
	}

	public static void successInserting() {
		CONSOLE.info(ConsoleMessage.SUCCESS, messageGivenInformed("Inserting"));
	}

	public static void successDeleting() {
		CONSOLE.info(ConsoleMessage.SUCCESS, messageGivenInformed("Deleting"));
	}

	public static void successUpdating() {
		CONSOLE.info(ConsoleMessage.SUCCESS, messageGivenInformed("Updating"));
	}

	public static void successPerformedConnection() {
		CONSOLE.info(ConsoleMessage.SUCCESS, "Performed connection.");
	}

	public static void successExecution(String table) {
		String END_PHRASE = "!";
		CONSOLE.info(ConsoleMessage.SUCCESS, "Successfully execution in " + table + END_PHRASE);
	}

	private static String messageGivenInformed(String action) {
		return action + " given informed...";
	}
}
