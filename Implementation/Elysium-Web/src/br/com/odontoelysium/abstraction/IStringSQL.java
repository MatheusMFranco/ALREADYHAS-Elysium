package br.com.odontoelysium.abstraction;

import java.util.List;

public interface IStringSQL {

	String selectAll();

	String selecSpecifc(List<String> columns, List<String> where);

	String dateFormat(String column, String format);

	String insert(List<String> columns);

	String update(List<String> columns, String id);

	String updateOneColumn(String column, String id);

	String updateOneColumn(IGenericTable column, IGenericTable id);

	String delete(String column);

	String delete(IGenericTable column);

	/**
	 * Method for to build queries of insert, update and delete.
	 * @param SQL initial (INSERT INTO, UPDATE, DELETE FROM...)
	 * @param Column list
	 * @param String for to separate the columns sequence (comma(,), "and"...)
	 * @param String for to finalize the query
	 * @param Type of SQL build ('K' = key | 'V' = value)
	 * @return Column list
	 */
	String buildList(String sql, List<String> columns, String separator, String end, char type);

}
