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
import br.com.alreadyhas.elysium.model.TypeConsultation;
import br.com.alreadyhas.elysium.persistence.ReadyQuery;
import br.com.alreadyhas.elysium.persistence.Table;
import br.com.alreadyhas.elysium.table.TypeConsultationTable;

public class TypeConsultationDAO extends TypeModelDAO {

	@Override
	public IStringSQL getQuery() {
		return new ReadyQuery(Table.TYPE_CONSULTATION);
	}

	@Override
	public String getTable() {
		return Table.TYPE_CONSULTATION.getTitle();
	}

	@Override
	public List<String> modelValues() {
		List<String> listModelValues = new ArrayList<String>();

		listModelValues.add(TypeConsultationTable.DATE_REGISTER.toString());
		listModelValues.add(TypeConsultationTable.NAME_TYPE.toString());

		return listModelValues;
	}

	@Override
	public List<IElysiumModel> createList(Statement statement, ResultSet resultSet) {
		List<IElysiumModel> listTypeModel = new ArrayList<IElysiumModel>();

		try {

			while (resultSet.next()) {
				TypeConsultation typeModelDAO = new TypeConsultation();

				Long id = resultSet.getLong(TypeConsultationTable.ID.toString());
				Date dateRegister = resultSet.getDate(TypeConsultationTable.DATE_REGISTER.toString());
				String name = resultSet.getString(TypeConsultationTable.NAME_TYPE.toString());

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
		return getQuery().delete(TypeConsultationTable.NAME_TYPE);
	}

	@Override
	public String updateQuery() {
		return getQuery().updateOneColumn(TypeConsultationTable.NAME_TYPE, TypeConsultationTable.ID);
	}
}
