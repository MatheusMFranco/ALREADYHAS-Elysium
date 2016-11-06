package br.com.alreadyhas.elysium.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import br.com.alreadyhas.elysium.abstraction.IDAO;
import br.com.alreadyhas.elysium.abstraction.IDataPresentation;
import br.com.alreadyhas.elysium.abstraction.IElysiumModel;
import br.com.alreadyhas.elysium.message.DataMessage;
import br.com.alreadyhas.elysium.message.DataPresentationImpl;
import br.com.alreadyhas.elysium.persistence.ActionForDAO;
import br.com.alreadyhas.elysium.persistence.ConnectionDB;
import br.com.alreadyhas.elysium.util.ElysiumObject;

public abstract class TypeModelDAO extends ElysiumObject implements IDAO {

	protected Connection CONNECTION = ConnectionDB.getConnection();

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
