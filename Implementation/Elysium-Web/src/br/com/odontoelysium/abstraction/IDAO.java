package br.com.odontoelysium.abstraction;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public interface IDAO {

	IStringSQL getQuery();

	String getTable();

	/**
	 * Method for print log.
	 */
	IDataPresentation getPresentation();

	String deleteQuery();

	String updateQuery();

	List<IElysiumModel> selectAll() throws SQLException;

	void insert(IElysiumModel model) throws SQLException;

	void update(IElysiumModel model) throws SQLException;

	void delete(IElysiumModel model) throws SQLException;

	/**
	 * Method for insert, update and delete of ReadyQuery. 
	 * @return Column list
	 */
	List<String> modelValues();

	/**
	 * Method for finisher the statement with console prints.
	 * @param preparedStatement
	 * @param table
	 * @param action (enum ActionForDAO)
	 * @param name
	 */
	List<IElysiumModel> createList(Statement statement, ResultSet resultSet);

}
