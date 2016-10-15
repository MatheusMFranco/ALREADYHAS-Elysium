package br.com.odontoelysium.abstraction;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import br.com.odontoelysium.persistence.ActionForDAO;

public interface IDataPresentation {
	void finishQuery(PreparedStatement preparedStatement, ActionForDAO action, String name);

	void finishQuery(PreparedStatement preparedStatement, String action, String name);

	void closeQuery(Statement statement, ResultSet resultSet);

	String defaultTitleList();

}
