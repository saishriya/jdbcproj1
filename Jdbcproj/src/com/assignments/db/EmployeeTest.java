package com.assignments.db;

import java.sql.SQLException;

public class EmployeeTest {

	public static void main(String[] args) throws SQLException {
		
		DBObject dbObject = new DBObject();
		dbObject.setUserName("root");
		dbObject.setPassword("Shriya!123");
		
		new DBConnectServiceImpl().createDBAlert(dbObject);
	}
}
