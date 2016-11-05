package br.com.alreadyhas.elysium.persistence;

import java.util.List;

import br.com.alreadyhas.elysium.abstraction.IGenericTable;
import br.com.alreadyhas.elysium.abstraction.IStringSQL;

public class ReadyQuery implements IStringSQL {

	private String table;
	private String order = " ";

	public ReadyQuery(String table) {
		this.table = table;
	}

	public ReadyQuery(Table table) {
		this.table = table.toString();
	}

	public ReadyQuery(String table, String order) {
		this.table = table;
		this.order = order;
	}

	@Override
	public String selectAll() {
		String orderBy = " ";

		if (order != " ") {
			orderBy = " ORDER BY " + order;
		}

		String query = "SELECT * FROM " + table + orderBy + ";";
		return query;
	}

	@Override
	public String selecSpecifc(List<String> columns, List<String> where) {
		String sql = "SELECT ";

		sql = buildList(sql, columns, ", ", " ", 'K');
		sql += buildList(sql, columns, "AND ", " ", 'K');

		return sql + "FROM " + table + ";";
	}

	@Override
	public String dateFormat(String column, String format) {
		return "to_char(" + column + ", " + "'" + format + "')";
	}

	@Override
	public String insert(List<String> columns) {
		String sql = "INSERT INTO " + table + "(";

		sql = buildList(sql, columns, ", ", ")", 'K');
		sql += buildList(" VALUES(", columns, ", ", ");", 'V');

		return sql;
	}

	@Override
	public String update(List<String> columns, String id) {
		String sql = "UPDATE " + table + "SET ";

		for (int i = 0; i < columns.size(); i++) {
			sql += columns.get(i) + "=? ";
		}

		sql += "WHERE " + id + "=?;";

		return sql;
	}

	@Override
	public String updateOneColumn(String column, String id) {
		String sql = "UPDATE " + table + " SET " + column + "=? ";
		sql += "WHERE " + id + "=?;";
		return sql;
	}

	@Override
	public String updateOneColumn(IGenericTable column, IGenericTable id) {
		return this.updateOneColumn(column, id);
	}

	@Override
	public String delete(String column) {
		String sql = "DELETE FROM " + table + " WHERE " + column + "=?;";
		return sql;
	}

	@Override
	public String delete(IGenericTable column) {
		return this.delete(column);
	}

	@Override
	public String buildList(String sql, List<String> columns, String separator, String end, char type) {
		for (int i = 0; i < columns.size(); i++) {

			if (type == 'K') {
				sql += columns.get(i);
			} else {
				sql += "?";
			}

			if (i < columns.size() - 1) {
				sql += separator;
			} else {
				sql += end;
			}
		}

		return sql;
	}
}
