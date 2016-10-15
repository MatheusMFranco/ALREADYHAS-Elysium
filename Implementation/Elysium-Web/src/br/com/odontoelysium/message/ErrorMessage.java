
/*
 * PATTERN METHOD ERROR:
 * method(param, param, ...) : type")
*/

package br.com.odontoelysium.message;

import br.com.odontoelysium.util.ConsoleMessage;
import br.com.odontoelysium.util.ElysiumObject;

public abstract class ErrorMessage extends ElysiumObject {

	/**
	 * 
	 * @param Exception e
	 * @param ElysiumObject className
	 * @param method(param, param, ...) : type")
	 */
	public static void errorConnecting(Exception e, ElysiumObject className, String method) {
		CONSOLE.info(ConsoleMessage.ERROR, "Connecting: " + e.getMessage());
		genericError(e, className, method);
	}

	/**
	 * 
	 * @param Exception e
	 * @param ElysiumObject className
	 * @param method(param, param, ...) : type")
	 */
	public static void errorNotData(Exception e, ElysiumObject className, String method) {
		CONSOLE.info(ConsoleMessage.ERROR, "Could not fetch the data.");
		genericError(e, className, method);
	}

	/**
	 * 
	 * @param Exception e
	 * @param ElysiumObject className
	 * @param method(param, param, ...) : type")
	 */
	public static void errorDriverNotFound(Exception e, ElysiumObject className, String method) {
		CONSOLE.info(ConsoleMessage.ERROR, "Driver not found.");
		genericError(e, className, method);
	}

	/**
	 * 
	 * @param Exception e
	 * @param ElysiumObject className
	 * @param method(param, param, ...) : type")
	 */
	public static void errorQueryNotOut(Exception e, ElysiumObject className, String method) {
		CONSOLE.info(ConsoleMessage.ERROR, "The query was not carried out.");
		genericError(e, className, method);
	}

	/**
	 * 
	 * @param Exception e
	 * @param ElysiumObject className
	 * @param method(param, param, ...) : type")
	 */
	public static void errorQueryNotComplete(Exception e, ElysiumObject className, String method) {
		CONSOLE.info(ConsoleMessage.ERROR, "Could not complete the query successfully.");
		genericError(e, className, method);
	}

	private static void genericError(Exception e, ElysiumObject className, String method) {
		String SEPARATOR = ".";
		e.printStackTrace();
		CONSOLE.info(ConsoleMessage.ERROR, "Method: " + className.getClassName() + SEPARATOR + method);
		CONSOLE.info(ConsoleMessage.ERROR, "Class: " + className.getClassCompleteName());
		CONSOLE.line();
	}
}
