package com.vti.frontend;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.UserController;
import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.User;
import com.vti.utils.ScannerUtils;

public class Function {

	private UserController userController;

	public Function() {
		userController = new UserController();
	}

	public void getListManagers() throws ClassNotFoundException, SQLException {

		List<User> users = userController.getListManager();
		System.out.printf("%-15s %-25s %-25s %-25s %-25s\n", "ID", "Email", "FullName", "Role", "ExpInYear");
		for (User user : users) {
			System.out.printf("%-15s %-25s %-25s %-25s %-25s\n", user.getId(), user.getEmail(), user.getFullName(),
					((Manager) user).getRole(), ((Manager) user).getExpInYear());
		}

	}

	public void getListEmployee() throws ClassNotFoundException, SQLException {

		System.out.print("Enter project ID: ");
		int projectId = ScannerUtils.inputPositiveInt("Only positive int allowed! Try again");

		List<User> users2 = userController.getListEmployee(projectId);

		System.out.printf("%-15s %-25s %-25s %-25s %-25s\n", "ID", "Email", "FullName", "Role", "ProSkill");
		for (User user2 : users2) {
			System.out.printf("%-15s %-25s %-25s %-25s %-25s\n", user2.getId(), user2.getEmail(), user2.getFullName(),
					((Employee) user2).getRole(), ((Employee) user2).getProSkill());
		}

	}

	public User login() throws ClassNotFoundException, SQLException {
		while (true) {
			System.out.print("Enter your email: ");
			String email = ScannerUtils.inputEmail("Invalid email! Please enter again");

			System.out.print("Enter your password: ");
			String password = ScannerUtils.inputPassword("Invalid password! Please enter again!");

			User user = userController.login(email, password);

			if (user != null) {
				System.out.printf("Welcome %s - %s\n\n\n", user.getFullName(), user.getRole());
				return user;
			} else {
				System.err.println("Invalid email/password! Please enter again!");
			}
		}
	}

}
