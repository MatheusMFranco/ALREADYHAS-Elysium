package br.com.alreadyhas.elysium.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.alreadyhas.elysium.abstraction.IElysiumModel;
import br.com.alreadyhas.elysium.abstraction.IStringSQL;
import br.com.alreadyhas.elysium.message.DataMessage;
import br.com.alreadyhas.elysium.message.ErrorMessage;
import br.com.alreadyhas.elysium.model.TypeEmployee;
import br.com.alreadyhas.elysium.persistence.ReadyQuery;
import br.com.alreadyhas.elysium.persistence.Table;
import br.com.alreadyhas.elysium.table.TypeEmployeeTable;

public class TypeEmployeeDAO extends TypeModelDAO {

	@Override
	public IStringSQL getQuery() {
		return new ReadyQuery(Table.TYPE_EMPLOYEE);
	}

	@Override
	public String getTable() {
		return Table.TYPE_EMPLOYEE.getTitle();
	}

	@Override
	public List<String> modelValues() {
		List<String> listModelValues = new ArrayList<>();

		listModelValues.add(TypeEmployeeTable.DATE_REGISTER.toString());
		listModelValues.add(TypeEmployeeTable.NAME_TYPE.toString());

		return listModelValues;
	}

	@Override
	public List<IElysiumModel> createList(Statement statement, ResultSet resultSet) {
		List<IElysiumModel> listTypeModel = new ArrayList<>();

		try {

			while (resultSet.next()) {
				TypeEmployee typeModelDAO = new TypeEmployee();

				Long id = resultSet.getLong(TypeEmployeeTable.ID.toString());
				Date dateRegister = resultSet.getDate(TypeEmployeeTable.DATE_REGISTER.toString());
				String name = resultSet.getString(TypeEmployeeTable.NAME_TYPE.toString());

				typeModelDAO.setId(id);
				typeModelDAO.setDateRegister(dateRegister);
				typeModelDAO.setName(name);

				listTypeModel.add(typeModelDAO);
				CONSOLE.write(typeModelDAO.toString());
			}
			getPresentation().closeQuery(statement, resultSet);
			return listTypeModel;

		} catch (SQLException e) {
			ErrorMessage.errorNotData(e, this, "createList(Statement, ResultSet) : List<IElysiumModel>");
			return null;
		} finally {
			DataMessage.informationExecutedInDate();
		}
	}

	@Override
	public String deleteQuery() {
		return getQuery().delete(TypeEmployeeTable.NAME_TYPE);
	}

	@Override
	public String updateQuery() {
		return getQuery().updateOneColumn(TypeEmployeeTable.NAME_TYPE, TypeEmployeeTable.ID);
	}
}
