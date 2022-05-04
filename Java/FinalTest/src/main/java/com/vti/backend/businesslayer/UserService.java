package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.User;

public class UserService {

	private UserRepository userRepository;

	public UserService() {
		userRepository = new UserRepository();
	}

	public List<User> getListManager() throws ClassNotFoundException, SQLException {
		return userRepository.getListManager();
	}
	public List<User> getListEmployee(int projectId) throws ClassNotFoundException, SQLException {
		return userRepository.getListEmployee(projectId);
	}

	public User login(String email, String password) throws ClassNotFoundException, SQLException {
		return userRepository.login(email, password);
	}

	public boolean full_name(String email) throws ClassNotFoundException, SQLException {
		return userRepository.full_name(email);
	}

}
