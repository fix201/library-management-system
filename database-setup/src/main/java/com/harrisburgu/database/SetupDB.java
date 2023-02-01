package com.harrisburgu.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SetupDB {
	
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    static final String DB_URL = "jdbc:mariadb://localhost:3306/lms";
    
    //  Database credentials
    static final String USER = "root";
    static final String PASS = "password";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//STEP 2: Register JDBC driver
		
		System.out.println("Hello World");
		Class.forName(JDBC_DRIVER);
		
		//STEP 3: Open a connection
		System.out.println("Connecting to a selected database...");
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		System.out.println("Connected database successfully...");
		
        Statement stmt =  conn.createStatement();
        
        String sqlStatement = "select * from genre";
        
        System.out.println("Selecting all the books");
        ResultSet rs = stmt.executeQuery(sqlStatement);
        
        while(rs.next()) {
        	System.out.println(rs.getString(1)+" "+rs.getString(2)); 
        }
	}

}
