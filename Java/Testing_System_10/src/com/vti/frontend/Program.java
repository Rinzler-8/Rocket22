package com.vti.frontend;

import java.sql.SQLException;

import com.vti.entity.Department;
import com.vti.utils.JDBCUtils;
import com.vti.utils.ScannerUtils;

public class Program {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		menu();
		System.out.println("Sdsd");
	}

//	private static void menuLogin() throws ClassNotFoundException, SQLException {
//		Function function = new Function();
//
//		System.out.println("LOGIN");
//		function.login();
//
//		menu();
//
//	}

	// mynt2407@gmail.com
	// Mynguyen123
	private static void menu() throws ClassNotFoundException, SQLException {
		Function function = new Function();

		System.out.println("Enter an option:\n" + "1: Display Departments\n" + "2: Find Department by ID\n"
				+ "3: Delete Department by ID\n" + "4: Add Department\n" + "5: Exit");

		while (true) {
			System.out.println("\nEnter your option: ");
			int choose = ScannerUtils.inputFunction(1, 5, "Only 1->5. Please enter again!");

			switch (choose) {
			case 1:
				function.getListDepartments();
				break;
			case 2:
				function.getDepartmentById();
				break;
			case 3:
				function.deleteDepartmentById();
				break;
			case 4:
				function.addDepartment();
				break;
			case 5: 
				function.isDepartmentExistsByID();
				break;
			case 6:
				System.out.println("Good Bye!");
				return;
			}
		}
	}

}
