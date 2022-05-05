package com.vti.backend.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.User;
import com.vti.utils.JDBCUtils;

public class UserRepository {

	private JDBCUtils jdbcUtils;

	public UserRepository() {
		jdbcUtils = new JDBCUtils();
	}

	public List<User> getListManager() throws ClassNotFoundException, SQLException {
		List<User> managersList = new ArrayList<>();
		try {
			// Step 1: connect to database
			Connection connection = jdbcUtils.getConnection();

			// Step 2: interacting with database statement
			String sql = "SELECT UserID, FullName, Email, Role, ExpInYear FROM `User` ";
			PreparedStatement statement = connection.prepareStatement(sql);

			// Step 3: run query
			ResultSet resultSet = statement.executeQuery();

			// Step 4: handle result
			while (resultSet.next()) {
				int id = resultSet.getInt("UserID");
				String fullName = resultSet.getString("FullName");
				String email = resultSet.getString("Email");
				String role = resultSet.getString("Role");

				if (role.equals("Manager")) {
					int expInYear = resultSet.getInt("ExpInYear");
					User manager = new Manager(id, fullName, email, expInYear);
					managersList.add(manager);
				}
			}
		} finally {
			jdbcUtils.disconnect();
		}
		return managersList;
	}

	public List<User> getListEmployee(int projectId) throws ClassNotFoundException, SQLException {
		List<User> employeesList = new ArrayList<>();
		try {
			// Step 1: connect to database
			Connection connection = jdbcUtils.getConnection();

			// Step 2: interacting with database statement
			String sql = "SELECT UserID, FullName, Email, Role, ExpInYear, ProSkill FROM `User` WHERE ProjectId = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, projectId);
			// Step 3: run query
			ResultSet resultSet = statement.executeQuery();
			// Step 4: handling result
			while (resultSet.next()) {
				int id = resultSet.getInt("UserID");
				String fullName = resultSet.getString("FullName");
				String email = resultSet.getString("Email");
				String role = resultSet.getString("Role");
				if (role.equals("Employee")) {
					String proSkill = resultSet.getString("ProSkill");
					User emp = new Employee(id, fullName, email, proSkill);
					employeesList.add(emp);
				}
			}
		} catch (Exception e) {
			System.err.println("Invalid Project ID! Please enter again!");
		} finally {
			jdbcUtils.disconnect();
		}
		return employeesList;
	}

	public User login(String email, String password) throws SQLException, ClassNotFoundException {

		try {
			// Step 1: connect to database
			Connection connection = jdbcUtils.getConnection();

			// Step 2: interacting with database statement
			String sql = "SELECT UserID, FullName, Role FROM `User` WHERE Email = ? AND `Password` = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, email);
			statement.setString(2, password);

			// Step 3: run query
			ResultSet resultSet = statement.executeQuery();

			// Step 4: handling result
			if (resultSet.next()) {
				int id = resultSet.getInt("UserID");
				String fullName = resultSet.getString("FullName");
				String role = resultSet.getString("Role");

				if (role.equals("Manager")) {
					User manager = new Manager(id, fullName, email);
					return manager;
				} else {
					User employee = new Employee(id, fullName, email);
					return employee;
				}
			} else {
				return null;
			}
		} finally {
			jdbcUtils.disconnect();
		}
	}

}
