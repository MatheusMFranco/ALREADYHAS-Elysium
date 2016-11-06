package br.com.alreadyhas.elysium.persistence;

import java.util.List;

import br.com.alreadyhas.elysium.abstraction.IGenericTable;
import br.com.alreadyhas.elysium.abstraction.IStringSQL;

public class ReadyQuery implements IStringSQL {

	private String table;
	private String order = SQLReservedWord.SPACE.getReservedWord();

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
		String orderBy = SQLReservedWord.SPACE.getReservedWord();

		if (!order.equalsIgnoreCase(SQLReservedWord.SPACE.getReservedWord())) {
			orderBy = SQLReservedWord.ORDER_BY.getReservedWord() + order;
		}

		String query = SQLReservedWord.SELECT_ALL_FROM.getReservedWord() + table + orderBy + SQLReservedWord.END_QUERY.getReservedWord();
		return query;
	}

	@Override
	public String selecSpecifc(List<String> columns, List<String> where) {
		String sql = SQLReservedWord.SELECT.getReservedWord();

		sql = buildList(sql, columns, SQLReservedWord.COMMA, SQLReservedWord.SPACE, SQLReservedWord.ID_KEY);
		sql += buildList(sql, columns, SQLReservedWord.AND, SQLReservedWord.SPACE, SQLReservedWord.ID_KEY);

		return sql + SQLReservedWord.FROM.getReservedWord() + table + SQLReservedWord.END_QUERY.getReservedWord();
	}

	@Override
	public String dateFormat(String column, String format) {
		return SQLReservedWord.TO_CHAR_BRACKET_BEFORE.getReservedWord() + column + SQLReservedWord.COMMA.getReservedWord()
				+ SQLReservedWord.INVERTED_COMA.getReservedWord() + format + SQLReservedWord.INVERTED_COMA_BRACKET_AFTER.getReservedWord();
	}

	@Override
	public String insert(List<String> columns) {
		String sql = SQLReservedWord.INSERT_INTO.getReservedWord() + table + SQLReservedWord.BRACKET_BEFORE.getReservedWord();

		sql = buildList(sql, columns, SQLReservedWord.COMMA.getReservedWord(), SQLReservedWord.BRACKET_AFTER.getReservedWord(),
				SQLReservedWord.ID_KEY.getReservedWord());
		sql += buildList(SQLReservedWord.VALUES_BRACKET_BEFORE.getReservedWord(), columns, SQLReservedWord.COMMA.getReservedWord(),
				SQLReservedWord.BRACKET_AFTER_END_QUERY.getReservedWord(), SQLReservedWord.ID_VALUE.getReservedWord());

		return sql;
	}

	@Override
	public String update(List<String> columns, String id) {
		String sql = SQLReservedWord.UPDATE.getReservedWord() + table + SQLReservedWord.SET.getReservedWord();

		for (int i = 0; i < columns.size(); i++) {
			sql += columns.get(i) + SQLReservedWord.EXPECTING_SET_VALUE.getReservedWord();
		}

		sql += genericWhereCondition(id);

		return sql;
	}

	@Override
	public String updateOneColumn(String column, String id) {
		String sql = SQLReservedWord.UPDATE.getReservedWord() + table + SQLReservedWord.SET.getReservedWord() + column
				+ SQLReservedWord.EXPECTING_SET_VALUE.getReservedWord();
		sql += genericWhereCondition(id);
		return sql;
	}

	@Override
	public String updateOneColumn(IGenericTable column, IGenericTable id) {
		return this.updateOneColumn(column, id);
	}

	@Override
	public String delete(String column) {
		String sql = SQLReservedWord.DELETE_FROM.getReservedWord() + table + SQLReservedWord.WHERE.getReservedWord() + column
				+ SQLReservedWord.EXPECTING_SET_VALUE.getReservedWord() + SQLReservedWord.END_QUERY.getReservedWord();
		return sql;
	}

	@Override
	public String delete(IGenericTable column) {
		return this.delete(column);
	}

	@Override
	public String buildList(String sql, List<String> columns, String separator, String end, char type) {
		final String TYPE = Character.toString(type);

		for (int i = 0; i < columns.size(); i++) {

			if (TYPE.equalsIgnoreCase(SQLReservedWord.ID_KEY.getReservedWord())) {
				sql += columns.get(i);
			} else {
				sql += SQLReservedWord.EXPECTING_VALUE.getReservedWord();
			}

			if (i < columns.size() - 1) {
				sql += separator;
			} else {
				sql += end;
			}
		}

		return sql;
	}

	@Override
	public String buildList(String sql, List<String> columns, String separator, String end, String type) {
		return buildList(sql, columns, separator, end, type.charAt(0));
	}

	@Override
	public String buildList(String sql, List<String> columns, SQLReservedWord separator, SQLReservedWord end, SQLReservedWord type) {
		return buildList(sql, columns, separator.getReservedWord(), end.getReservedWord(), type.getReservedWord());
	}

	private String genericWhereCondition(String id) {
		return SQLReservedWord.WHERE.getReservedWord() + id + SQLReservedWord.EXPECTING_SET_VALUE.getReservedWord()
				+ SQLReservedWord.END_QUERY.getReservedWord();
	}
}
