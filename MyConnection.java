package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pojo.InitialDatasetPojo;
import com.crud.ReadInv;

public class MyConnection {
	
	public Connection getConnection() {
		Connection con = null;
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/";
		String DBname = "grey_goose";
		String username = "root";
		String password = "root";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url + DBname, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}

}
