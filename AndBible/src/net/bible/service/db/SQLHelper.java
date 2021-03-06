package net.bible.service.db;

public class SQLHelper {

	/**
	 * Get a comma separated list of columns preceded by the table name for use in a query
	 * 
	 * @return column list
	 */
	public static String getColumnsForQuery(String table, String[] columns) {
		StringBuilder returnColumns = new StringBuilder();
		
		for (String column : columns) {
			returnColumns.append(table).append(".").append(column).append(",");
		}
		// remove the extra final comma
		returnColumns.deleteCharAt(returnColumns.lastIndexOf(","));
		
		return returnColumns.toString();
	}
}
