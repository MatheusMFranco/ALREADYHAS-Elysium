package br.com.odontoelysium.dao;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import br.com.alreadyhas.elysium.dao.TypeConsultationDAO;
import br.com.alreadyhas.elysium.model.TypeConsultation;
import br.com.alreadyhas.elysium.persistence.ConnectionDB;
import br.com.alreadyhas.elysium.persistence.ReadyQuery;
import br.com.alreadyhas.elysium.persistence.Table;
import br.com.alreadyhas.elysium.table.TypeConsultationTable;
import br.com.alreadyhas.elysium.util.ConsoleFoxStyle;
import br.com.alreadyhas.elysium.util.ConsoleMessage;

public class TypeConsultationDAOTest {

	private Connection connection = ConnectionDB.getConnection();

	public static void main(String[] args) {
		ConsoleFoxStyle console = new ConsoleFoxStyle("System");
		console.credits();
		try {

			// insertTest();
			// showAllTest();
			// updateTest();
			// deleteTest();
			showAllTest();
		} catch (SQLException e) {
			console.info(ConsoleMessage.ERROR, "Make sure the query statement is spelled correctly.");
			e.printStackTrace();
		}
	}

	public static void showAllTest() throws SQLException {
		TypeConsultationDAO typeConsultationDAO = new TypeConsultationDAO();
		typeConsultationDAO.selectAll();
	}

	public static void insertTest() throws SQLException {
		TypeConsultationDAO typeConsultationDAO = new TypeConsultationDAO();
		TypeConsultation typeConsultation = new TypeConsultation();

		typeConsultation.setName("Agora Vai");

		typeConsultationDAO.insert(typeConsultation);
	}

	public static void updateTest() throws SQLException {
		TypeConsultationDAO typeConsultationDAO = new TypeConsultationDAO();
		TypeConsultation typeConsultation = new TypeConsultation();

		typeConsultation.setId(21L);
		typeConsultation.setName("Okay");

		typeConsultationDAO.update(typeConsultation);
	}

	public static void deleteTest() throws SQLException {
		TypeConsultationDAO typeConsultationDAO = new TypeConsultationDAO();
		TypeConsultation typeConsultation = new TypeConsultation();

		typeConsultation.setName("Coisa");

		typeConsultationDAO.delete(typeConsultation);
	}

	@Test
	public void selectAllNotNull() throws SQLException {

		ReadyQuery query = new ReadyQuery(Table.TYPE_CONSULTATION.toString(), TypeConsultationTable.NAME_TYPE.toString());

		Statement statement = connection.createStatement();
		statement.execute(query.selectAll());
		ResultSet resultSet = statement.getResultSet();

		assertNotNull("[CONNECTION: SUCESS]", statement);
		assertNotNull("[QUERY: SUCCESS]", statement.execute(query.selectAll()));
		assertNotNull("RESULT: SUCCESS]", resultSet);
	}

}
