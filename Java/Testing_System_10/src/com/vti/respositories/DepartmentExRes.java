package com.vti.respositories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.vti.entity.Department;

//Select, insert, update, delete table department
public class DepartmentExRes {

	public Department getById(long id) throws SQLException {
		Connection connection = getConnect();
		Statement statement = connection.createStatement();
		String query = "select department_id, department_name from department where department_id = " + id;
		System.out.println(query);
		ResultSet resultSet = statement.executeQuery(query);
		List<Department> departments = new ArrayList<Department>();
		Department department = new Department();
		while (resultSet.next()) {

			long departmentId = resultSet.getLong("department_id");
			String deparment_name = resultSet.getString("department_name");
			department.setDepartmentName(deparment_name);
			department.setId(departmentId);
			departments.add(department);
		}
		return department;

	}

//	public int insert(Department deparment) throws SQLException {
//		Connection connection = getConnect();
//		Statement statement = connection.createStatement();
//		String sql = "insert into department(department_id, department_name) values (" + deparment.getId() + ", "
//				+ deparment.getDepartmentName() + ")";
//		
//	}

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
