package br.com.odontoelysium.message;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.odontoelysium.abstraction.IDataPresentation;
import br.com.odontoelysium.persistence.ActionForDAO;
import br.com.odontoelysium.util.ElysiumObject;

public class DataPresentationImpl extends ElysiumObject implements IDataPresentation {

	private String table;

	public DataPresentationImpl(String table) {
		super();
		this.table = table;
	}

	@Override
	public void finishQuery(PreparedStatement preparedStatement, String action, String name) {
		final String SEPARATOR = " | ";
		final String SPACE = " ";

		try {
			preparedStatement.execute();
			preparedStatement.close();

			DataMessage.successExecution(table);
			CONSOLE.write(CURRENT_DAY + SEPARATOR + action + SPACE + name);
		} catch (SQLException e) {
			ErrorMessage.errorQueryNotOut(e, this, " finishQuery(PreparedStatement, String, String) : void");
		} finally {
			CONSOLE.line();
		}
	}

	@Override
	public void finishQuery(PreparedStatement preparedStatement, ActionForDAO action, String name) {
		finishQuery(preparedStatement, action.toString(), name);
	}

	@Override
	public void closeQuery(Statement statement, ResultSet resultSet) {
		try {
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			ErrorMessage.errorQueryNotComplete(e, this, "closeQuery(Statement, ResultSet) : void");
		} finally {
			CONSOLE.line();
		}
	}

	@Override
	public String defaultTitleList() {
		final String END_PHRASE = ":";
		return "All results for " + table + END_PHRASE;
	}

}
