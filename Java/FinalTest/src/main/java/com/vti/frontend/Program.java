package com.vti.frontend;

import java.sql.SQLException;

import com.vti.entity.User;
import com.vti.utils.JDBCUtils;
import com.vti.utils.ScannerUtils;

public class Program {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		menuLogin();
	}

	private static void menuLogin() throws ClassNotFoundException, SQLException {
		Function function = new Function();

		System.out.println("LOGIN");
		function.login();

		menu();

	}

	// Bridge123@gmail.com
	// Bridging123 
	// 1245
	private static void menu() throws ClassNotFoundException, SQLException {
		Function function = new Function();

		System.out.println("Enter an option:\n" + "1: Get manager list\n" + "2: Get employee list \n" + "3: Exit");

		while (true) {
			System.out.println("\nEnter your option: ");
			int choose = ScannerUtils.inputFunction(1, 3, "Only 1->3. Please enter again!");

			switch (choose) {
			case 1:
				function.getListManagers();
				break;
			case 2:
				function.getListEmployee();
				break;
			case 3:
				System.out.println("Good Bye!");
				return;
			}
		}
	}

}
