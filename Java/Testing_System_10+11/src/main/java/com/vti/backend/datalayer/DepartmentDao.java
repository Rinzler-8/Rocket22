package com.vti.backend.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Department;
import com.vti.utils.JDBCUtils;

public class DepartmentDao {

	private JDBCUtils jdbcUtils;

	public DepartmentDao() {
		jdbcUtils = new JDBCUtils();
	}

	public List<Department> getListDepartment() throws ClassNotFoundException, SQLException {

		List<Department> depList = new ArrayList<>();

		// Step 1: get connection
		Connection connection = jdbcUtils.getConnection();

		// Step 2: Create a statement obiect
		Statement statement = connection.createStatement();

		// Step 3: Execute SQL query
		String sql = "SELECT * FROM `Department` ORDER BY department_id ASC";
		ResultSet resultSet = statement.executeQuery(sql); // for select

		// Step 4: Handling Result Set
		while (resultSet.next()) {
			Department de = new Department(resultSet.getInt("department_id"), resultSet.getString("department_name"));
			depList.add(de);
		}

		jdbcUtils.disconnect();

		return depList;
	}

	public Department getDepById(long departmentId) throws SQLException, ClassNotFoundException {

		try {
			// Step 1: get connection
			Connection connection = jdbcUtils.getConnection();

			// Step 2: Create a statement obiect
			String sql = "SELECT department_id, department_name FROM `Department` WHERE department_id = ? ";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setLong(1, departmentId);

			// Step 3: Execute SQL query
			ResultSet resultSet = statement.executeQuery();

			// Step 4: Handling Result Set
			if (resultSet.next()) {
				long depId = resultSet.getLong("department_id");
				String depName = resultSet.getString("department_name");
				Department Department = new Department(depId, depName);
				return Department;

			} else {
				return null;
			}
		} finally {
			jdbcUtils.disconnect();
		}
	}

	public boolean isDepartmentExistsByName(String department_name) throws SQLException, ClassNotFoundException {

		try {
			// Step 1: get connection
			Connection connection = jdbcUtils.getConnection();

			// Step 2: Create a statement obiect
			String sql = "SELECT 1 FROM `Department` WHERE department_name = ? ";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, department_name);

			// Step 3: Execute SQL query
			ResultSet resultSet = statement.executeQuery();

			// Step 4: Handling Result Set
			if (resultSet.next()) {
				return true;
			} else {
				return false;
			}
		} finally {
			jdbcUtils.disconnect();
		}
	}
	
	public boolean isDepartmentExistsByID(long departmentId) throws SQLException, ClassNotFoundException {

		try {
			// Step 1: get connection
			Connection connection = jdbcUtils.getConnection();

			// Step 2: Create a statement obiect
			String sql = "SELECT 1 FROM `Department` WHERE department_id = ? ";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setLong(1, departmentId);

			// Step 3: Execute SQL query
			ResultSet resultSet = statement.executeQuery();

			// Step 4: Handling Result Set
			if (resultSet.next()) {
				return true;
			} else {
				return false;
			}
		} finally {
			jdbcUtils.disconnect();
		}
	}

	public boolean deleteDepartmentExistsById(long departmentId) throws SQLException, ClassNotFoundException {
		try {
			// Step 1: get connection
			Connection connection = jdbcUtils.getConnection();

			// Step 2: Create a statement obiect
			String sql = "DELETE FROM `Department` WHERE department_id = ? ";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setLong(1, departmentId);

			// Step 3: Execute SQL query
			int affect_records = statement.executeUpdate();

			// Step 4: Handling Result Set
			if (affect_records > 0) {
				return true;
			} else {
				return false;
			}
		} finally {
			jdbcUtils.disconnect();
		}
	}

//	public Department login(String email, String password) throws SQLException, ClassNotFoundException {
//
//		try {
//			// Step 1: get connection
//			Connection connection = jdbcUtils.getConnection();
//
//			// Step 2: Create a statement obiect
//			String sql = "SELECT DepartmentID, FullName FROM `Department` WHERE Email = ? AND `Password` = ?";
//			PreparedStatement statement = connection.prepareStatement(sql);
//			statement.setString(1, email);
//			statement.setString(2, password);
//
//			// Step 3: Execute SQL query
//			ResultSet resultSet = statement.executeQuery();
//
//			// Step 4: Handling Result Set
//			if (resultSet.next()) {
//				int id = resultSet.getInt("DepartmentID");
//				String fullName = resultSet.getString("FullName");
//
//				Department admin = new Admin(id, fullName, email);
//				return admin;
//
//			} else {
//				return null;
//			}
//		} finally {
//			jdbcUtils.disconnect();
//		}
//	}

	public void createDepartment(String department_name) throws SQLException, ClassNotFoundException {
		try {
			// Step 1: get connection
			Connection connection = jdbcUtils.getConnection();

			// Step 2: Create a statement obiect
			String sql = "INSERT INTO `Department`  (department_name)" + "VALUES  (?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, department_name);

			// Step 3: Execute SQL query
			statement.executeUpdate();

		} finally {
			jdbcUtils.disconnect();
		}
	}

	public boolean updateDepartmentName(long departmentId, String newName)
			throws ClassNotFoundException, SQLException {
		try {
			Connection connection = jdbcUtils.getConnection();
			Department depID = getDepById(departmentId);
			if (depID == null) {
				return false;
			} else {
				String sql = "UPDATE Department SET department_name = ? WHERE (department_id = ?);";

				PreparedStatement statement = connection.prepareStatement(sql);

				statement.setNString(1, newName);
				statement.setLong(2, departmentId);
				// Step 3: Execute SQL query
				int affect_records = statement.executeUpdate();

				// Step 4: Handling Result Set
				if (affect_records > 0) {
					return true;
				} else {
					return false;
				}
			}
		} finally {
			jdbcUtils.disconnect();
		}

	}


}
