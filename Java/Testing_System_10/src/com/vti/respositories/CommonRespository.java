package com.vti.respositories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class CommonRespository {

	
	
	
	private Connection getConnect() {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("src/main/resource/database.properties"));
			String url = properties.getProperty("url");
			String DepartmentName = properties.getProperty("Departmentname");
			String password = properties.getProperty("password");
			Class.forName("com.mysql.cj.jdbc.Driver");

			return DriverManager.getConnection(url, DepartmentName, password);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

//		String url = "jdbc:mysql://localhost:3306/vti_database?autoReconect=true&useSSL=false&characterEncoding=latin1";
//		String Department = "root";
//		String pasasword = "root";

		return null;
	}
}
