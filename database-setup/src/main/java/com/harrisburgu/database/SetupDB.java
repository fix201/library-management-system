package com.harrisburgu.database;

import org.apache.ibatis.jdbc.ScriptRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SetupDB {
	
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    static final String DB_URL = "jdbc:mariadb://localhost:3306/lms";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "password";

	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {

        Logger logger = LoggerFactory.getLogger(SetupDB.class);

        //STEP 2: Register JDBC driver
		Class.forName(JDBC_DRIVER);
		
		//STEP 3: Open a connection
		System.out.println("Connecting to a selected database...");
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		System.out.println("Connected database successfully...");

        // Reading & Executing the sql files
        ScriptRunner sr = new ScriptRunner(conn);
        Reader reader = new BufferedReader(new FileReader("src/main/resources/lms_schema.sql"));
        sr.runScript(reader);

        reader = new BufferedReader(new FileReader("src/main/resources/data.sql"));
        sr.runScript(reader);
	}

}
