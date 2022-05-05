package com.vti.backend.presentationlayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.UserService;
import com.vti.entity.User;

public class UserController {

	private UserService userService;

	public UserController() {
		userService = new UserService();
	}

	public List<User> getListManager() throws ClassNotFoundException, SQLException {
		return userService.getListManager();
	}

	public List<User> getListEmployee(int projectId) throws ClassNotFoundException, SQLException {
		return userService.getListEmployee(projectId);
	}

	public User login(String email, String password) throws ClassNotFoundException, SQLException {
		return userService.login(email, password);
	}

}
