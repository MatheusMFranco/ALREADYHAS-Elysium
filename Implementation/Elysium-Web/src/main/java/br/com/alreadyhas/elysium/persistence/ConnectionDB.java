package br.com.alreadyhas.elysium.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.alreadyhas.elysium.message.DataMessage;
import br.com.alreadyhas.elysium.message.ErrorMessage;
import br.com.alreadyhas.elysium.util.ElysiumObject;

public class ConnectionDB extends ElysiumObject {

	private static final String USER = "postgres";
	private static final String PASSWORD = "valhala";
	private static final String DATABASE = "jdbc:postgresql://localhost:5432/elysiumBD";
	private static final String DRIVER = "org.postgresql.Driver";

	public static Connection getConnection() {

		try {
			DataMessage.informationConnecting();
			Class.forName(DRIVER);
			Connection con = DriverManager.getConnection(DATABASE, USER, PASSWORD);
			DataMessage.successPerformedConnection();
			DataMessage.informationExecutedInDate();

			return con;
		} catch (SQLException e) {
			ErrorMessage.errorConnecting(e, new ConnectionDB(), "getConnection() : Connection");
			return null;
		} catch (ClassNotFoundException e) {
			ErrorMessage.errorDriverNotFound(e, new ConnectionDB(), "getConnection() : Connection");
			return null;
		}
	}
}
