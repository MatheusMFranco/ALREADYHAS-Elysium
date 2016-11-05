package br.com.alreadyhas.elysium.abstraction;

import java.sql.Date;

import br.com.alreadyhas.elysium.util.ConsoleMessage;

public interface IConsole {

	void write(String message);

	void info(ConsoleMessage type, String message);

	void featured(String message);

	void line();

	void breakLine();

	void credits();

	Date currentDate();
}
