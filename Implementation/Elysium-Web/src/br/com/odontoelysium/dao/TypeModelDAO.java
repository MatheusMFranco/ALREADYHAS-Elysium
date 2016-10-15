package br.com.odontoelysium.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import br.com.odontoelysium.abstraction.IDAO;
import br.com.odontoelysium.abstraction.IDataPresentation;
import br.com.odontoelysium.abstraction.IElysiumModel;
import br.com.odontoelysium.abstraction.IStringSQL;
import br.com.odontoelysium.message.DataMessage;
import br.com.odontoelysium.message.DataPresentationImpl;
import br.com.odontoelysium.persistence.ActionForDAO;
import br.com.odontoelysium.persistence.ConnectionDB;
import br.com.odontoelysium.util.ElysiumObject;

public abstract class TypeModelDAO extends ElysiumObject implements IDAO {

	public Connection CONNECTION = ConnectionDB.getConnection();

	@Override
	public abstract IStringSQL getQuery();

	@Override
	public abstract String getTable();

	@Override
	public abstract List<String> modelValues();

	@Override
	public abstract List<IElysiumModel> createList(Statement statement, ResultSet resultSet);

	@Override
	public abstract String deleteQuery();

	@Override
	public abstract String updateQuery();

	@Override
	public IDataPresentation getPresentation() {
		return new DataPresentationImpl(getTable());
	}

	@Override
	public List<IElysiumModel> selectAll() throws SQLException {

		DataMessage.informationFetchingData();
		Statement statement = CONNECTION.createStatement();
		statement.execute(getQuery().selectAll());
		ResultSet resultSet = statement.getResultSet();

		CONSOLE.featured(getPresentation().defaultTitleList());

		DataMessage.informationRidingList();
		return createList(statement, resultSet);
	}

	@Override
	public void insert(IElysiumModel typeModelDAO) throws SQLException {

		DataMessage.informationFetchingData();
		String sql = getQuery().insert(modelValues());
		PreparedStatement preparedStatement = CONNECTION.prepareStatement(sql);

		DataMessage.successInserting();
		preparedStatement.setDate(1, CURRENT_DAY);
		preparedStatement.setString(2, typeModelDAO.getName());

		getPresentation().finishQuery(preparedStatement, ActionForDAO.REGISTERED, typeModelDAO.getName());
		DataMessage.informationExecutedInDate();
	}

	@Override
	public void update(IElysiumModel typeModelDAO) throws SQLException {

		DataMessage.informationFetchingData();
		PreparedStatement preparedStatement = CONNECTION.prepareStatement(updateQuery());

		DataMessage.successUpdating();
		preparedStatement.setString(1, typeModelDAO.getName());
		preparedStatement.setLong(2, typeModelDAO.getId());

		getPresentation().finishQuery(preparedStatement, ActionForDAO.UPDATED, typeModelDAO.getName());
		DataMessage.informationExecutedInDate();
	}

	@Override
	public void delete(IElysiumModel typeModelDAO) throws SQLException {

		DataMessage.informationFetchingData();
		PreparedStatement preparedStatement = CONNECTION.prepareStatement(deleteQuery());

		DataMessage.successDeleting();
		preparedStatement.setString(1, typeModelDAO.getName());

		getPresentation().finishQuery(preparedStatement, ActionForDAO.DELETED, typeModelDAO.getName());
		DataMessage.informationExecutedInDate();
	}

}
