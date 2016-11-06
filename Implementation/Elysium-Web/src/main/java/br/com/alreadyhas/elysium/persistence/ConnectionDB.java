package br.com.alreadyhas.elysium.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.alreadyhas.elysium.message.DataMessage;
import br.com.alreadyhas.elysium.message.ErrorMessage;
import br.com.alreadyhas.elysium.start.DataAccess;
import br.com.alreadyhas.elysium.util.ElysiumObject;

public class ConnectionDB extends ElysiumObject {

	private static final String DATABASE = "jdbc:postgresql://localhost:5432/elysiumBD";
	private static final String DRIVER = "org.postgresql.Driver";

	public static Connection getConnection() {

		DataAccess access = DataAccess.getInstance();

		String user = access.getUser();
		String password = access.getPassword();

		try {
			DataMessage.informationConnecting();

			Class.forName(DRIVER);
			Connection connection = DriverManager.getConnection(DATABASE, user, password);

			DataMessage.successPerformedConnection();
			DataMessage.informationExecutedInDate();

			return connection;

		} catch (SQLException e) {
			ErrorMessage.errorConnecting(e, new ConnectionDB(), "getConnection() : Connection");
			return null;
		} catch (ClassNotFoundException e) {
			ErrorMessage.errorDriverNotFound(e, new ConnectionDB(), "getConnection() : Connection");
			return null;
		}
	}
}
