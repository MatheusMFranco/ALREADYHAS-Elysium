package br.com.odontoelysium.util;

import java.sql.Date;

import br.com.odontoelysium.abstraction.IConsole;

public abstract class ElysiumObject {
	final public static IConsole CONSOLE = new ConsoleFoxStyle("System");
	final public static Date CURRENT_DAY = CONSOLE.currentDate();
	public static String classCompleteName;
	public static String className;

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
