package br.com.alreadyhas.elysium.util;

import java.sql.Date;

import br.com.alreadyhas.elysium.abstraction.IConsole;

public abstract class ElysiumObject {
	public static final IConsole CONSOLE = new ConsoleFoxStyle("System");
	public static final Date CURRENT_DAY = CONSOLE.currentDate();
	public static final String BAR_SEPARATOR = " | ";

	private static String classCompleteName;
	private static String className;

	public ElysiumObject() {
		classCompleteName = this.getClass().getName();
		className = this.getClass().getSimpleName();
	}

	public String getClassCompleteName() {
		return classCompleteName;
	}

	public String getClassName() {
		return className;
	}

}
