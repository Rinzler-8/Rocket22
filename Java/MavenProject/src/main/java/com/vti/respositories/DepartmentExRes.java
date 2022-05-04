package com.vti.respositories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.sql.CallableStatement;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.vti.entity.Department;

//Select, insert, update, delete table department
public class DepartmentExRes {
	List<Department> departments = new ArrayList<Department>();
	Department department = new Department();

	public Department getById(long id) throws SQLException {
		Connection connection = getConnect();
		Statement statement = connection.createStatement();
		String query = "select department_id, department_name from department where department_id = " + id;
		System.out.println(query);
		ResultSet resultSet = statement.executeQuery(query);

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

	public Department getById2(long id) throws SQLException {
		Connection connection = getConnect();

		String query = "select department_id, department_name from department where department_id = " + id;
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setLong(1, id);
		System.out.println(query);
		ResultSet resultSet = statement.executeQuery();

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

	public int insert(Department deparment) throws SQLException {
		Connection connection = getConnect();
		Statement statement = connection.createStatement();
		String sql = "insert into department(department_id, department_name) values (" + deparment.getId() + ", "
				+ deparment.getDepartmentName() + ")";
		System.out.println(sql);
		int count = statement.executeUpdate(sql);
		return count;
	}

	public int insert2(Department deparment) throws SQLException {
		Connection connection = getConnect();

		String sql = "insert into department(department_id, department_name) values (?,?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setLong(1, department.getId());
		System.out.println(sql);
		int count = statement.executeUpdate(sql);
		return count;
	}

	public int insert(List<Department> deparments) throws SQLException {
		Connection connection = getConnect();
		Statement statement = connection.createStatement();

		String sql = "insert into department(department_id, department_name) values (" + department.getId() + ", "
				+ department.getDepartmentName() + ")";
		List<String> values = new ArrayList<String>();
		for (Department department1 : departments) {
			StringBuilder value = new StringBuilder();
			value.append("(").append(department1.getId()).append(", ").append(department1.getDepartmentName())
					.append("')");
			values.add(value.toString());
		}
		String valueFinal = String.join(",", values);
		sql += valueFinal;
		System.out.println(sql);
		int count = statement.executeUpdate(sql);
		return count;
	}

	public int insert2(List<Department> deparments) throws SQLException {
		Connection connection = getConnect();

		String sql = "insert into department(department_id, department_name) values (" + department.getId() + ", "
				+ department.getDepartmentName() + ")";
		List<String> values = new ArrayList<String>();
		for (int i = 0; i < departments.size(); i++) {
			values.add("(?, ?)");
		}

		sql += String.join(",", values);
		System.out.println(sql);
		PreparedStatement statement = connection.prepareStatement(sql);
		for (int i = 0; i < departments.size(); i++) {
			statement.setLong(i * 2 + 1, departments.get(i).getId());
			statement.setString(i * 2 + 2, departments.get(i).getDepartmentName());
		}

		int count = statement.executeUpdate(sql);
		return count;
	}

	public int insertAll(List<Department> deparments) throws SQLException {
		Connection connection = getConnect();
		connection.setAutoCommit(false);
		int count = 0;
		try {
			for (Department department : departments) {
				String sql = "insert into department(department_id, department_name) values (?,?)";
				PreparedStatement statement = connection.prepareStatement(sql);
				statement.setLong(1, department.getId());
				statement.setString(1, department.getDepartmentName());
				count += statement.executeUpdate();
				connection.commit();
			}
		} catch (Exception e) {
			connection.rollback();
			count = 0;
			System.out.println(e.getMessage());
		}

		connection.setAutoCommit(true);
		connection.close();
		return count;
		;
		String sql = "insert into department(department_id, department_name) values (" + department.getId() + ", "
				+ department.getDepartmentName() + ")";
		List<String> values = new ArrayList<String>();
		for (int i = 0; i < departments.size(); i++) {
			values.add("(?, ?)");
		}

		sql += String.join(",", values);
		System.out.println(sql);
		PreparedStatement statement = connection.prepareStatement(sql);
		for (int i = 0; i < departments.size(); i++) {
			statement.setLong(i * 2 + 1, departments.get(i).getId());
			statement.setString(i * 2 + 2, departments.get(i).getDepartmentName());
		}

		int count = statement.executeUpdate(sql);
		return count;
	}

	public int update(Department deparment) throws SQLException {
		Connection connection = getConnect();
		Statement statement = connection.createStatement();
		Department departmentOld = getById(department.getId());
		if (departmentOld == null) {
			System.out.println("Datano found");
			return 0;
		}

		String sql = "update department set department_name = " + deparment.getDepartmentName()
				+ " where department_id = " + department.getId();
		System.out.println(sql);
		int count = statement.executeUpdate(sql);
		return count;
	}

	public int updateByProcedure(Department deparment) throws SQLException {
		Connection connection = getConnect();

		String sql = "call update_department(?,?)";
		System.out.println(sql);

		CallableStatement callableStatement = connection.prepareCall(sql);
		callableStatement.setLong(1, department.getId());
		callableStatement.setString(1, department.getDepartmentName());
		int count = callableStatement.executeUpdate(sql);
		return count;
	}

	public int deleteById(long id) throws SQLException {
		Connection connection = getConnect();
		Statement statement = connection.createStatement();
		String query = "delete from department where department_id = " + id;
		int count = statement.executeUpdate(query);
		return count;
	}

	private Connection getConnect() {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("src/main/resource/database.properties"));
			String url = properties.getProperty("url");
			String userName = properties.getProperty("username");
			String password = properties.getProperty("password");
			Class.forName("com.mysql.cj.jdbc.Driver");

			return DriverManager.getConnection(url, userName, password);
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
//		String user = "root";
//		String pasasword = "root";

		return null;
	}
}
