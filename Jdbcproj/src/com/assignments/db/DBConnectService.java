package com.assignments.db;

import java.sql.SQLException;

public interface DBConnectService {

	public final static String DB_URL = "jdbc:mysql://localhost:3306/sakila";
	public final static String SQL_INSERT="insert into author (id,name,country,last_update) values (2,'Priya','UK',now())";

	public 	void createDBAlert(DBObject dbobject) throws SQLException;
	

}
