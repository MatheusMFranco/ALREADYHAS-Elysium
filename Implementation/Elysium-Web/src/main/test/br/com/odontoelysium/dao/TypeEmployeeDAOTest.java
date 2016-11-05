package br.com.odontoelysium.dao;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import br.com.alreadyhas.elysium.dao.TypeEmployeeDAO;
import br.com.alreadyhas.elysium.model.TypeEmployee;
import br.com.alreadyhas.elysium.persistence.ConnectionDB;
import br.com.alreadyhas.elysium.persistence.ReadyQuery;
import br.com.alreadyhas.elysium.persistence.Table;
import br.com.alreadyhas.elysium.table.TypeEmployeeTable;
import br.com.alreadyhas.elysium.util.ConsoleFoxStyle;
import br.com.alreadyhas.elysium.util.ConsoleMessage;

public class TypeEmployeeDAOTest {

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
		TypeEmployeeDAO typeEmployeeDAO = new TypeEmployeeDAO();
		typeEmployeeDAO.selectAll();
	}

	public static void insertTest() throws SQLException {
		TypeEmployeeDAO typeEmployeeDAO = new TypeEmployeeDAO();
		TypeEmployee typeEmployee = new TypeEmployee();

		typeEmployee.setName("Agora Vai");

		typeEmployeeDAO.insert(typeEmployee);
	}

	public static void updateTest() throws SQLException {
		TypeEmployeeDAO typeEmployeeDAO = new TypeEmployeeDAO();
		TypeEmployee typeEmployee = new TypeEmployee();

		typeEmployee.setId(21L);
		typeEmployee.setName("Okay");

		typeEmployeeDAO.update(typeEmployee);
	}

	public static void deleteTest() throws SQLException {
		TypeEmployeeDAO typeEmployeeDAO = new TypeEmployeeDAO();
		TypeEmployee typeEmployee = new TypeEmployee();

		typeEmployee.setName("Coisa");

		typeEmployeeDAO.delete(typeEmployee);
	}

	@Test
	public void selectAllNotNull() throws SQLException {

		ReadyQuery query = new ReadyQuery(Table.TYPE_EMPLOYEE.toString(), TypeEmployeeTable.NAME_TYPE.toString());

		Statement statement = connection.createStatement();
		statement.execute(query.selectAll());
		ResultSet resultSet = statement.getResultSet();

		assertNotNull("[CONNECTION: SUCESS]", statement);
		assertNotNull("[QUERY: SUCCESS]", statement.execute(query.selectAll()));
		assertNotNull("RESULT: SUCCESS]", resultSet);
	}

}
