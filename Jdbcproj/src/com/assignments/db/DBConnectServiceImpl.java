package com.assignments.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectServiceImpl implements DBConnectService {

	public void createDBAlert(DBObject dbobject) throws SQLException {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(DBConnectService.DB_URL, dbobject.getUserName(), dbobject.getPassword());
			con.createStatement().execute(DBConnectService.SQL_INSERT);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			con.close();
		}
	}
}
