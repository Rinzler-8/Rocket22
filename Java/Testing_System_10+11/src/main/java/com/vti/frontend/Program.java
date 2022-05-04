package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.entity.Department;
import com.vti.utils.JDBCUtils;
import com.vti.utils.ScannerUtils;

public class Program {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		menu();
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
	private static void menu() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		Function function = new Function();

		System.out.println("Enter an option:\n" + "1: Display Departments\n"
		+ "2: Find Department by ID\n"
		+ "3: Delete Department by ID\n"
		+ "4: Add Department\n" 
		+ "5: Add Department\n" 
		+ "6: Update Department\n" 
		+ "7: Exit");

		

		while (true) {
			System.out.println("\nEnter your option: ");
			int choose = ScannerUtils.inputFunction(1, 7, "Only 1->7. Please enter again!");

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
				function.updateDepartmentName();
				break;
			case 7:
				System.out.println("Good Bye!");
				return;
			}
		}
	}

}
