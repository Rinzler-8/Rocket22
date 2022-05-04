package com.vti.frontend;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.DepartmentController;
import com.vti.entity.Department;
import com.vti.utils.ScannerUtils;

public class Function {

	private DepartmentController DepartmentController;

	public Function() {
		DepartmentController = new DepartmentController();
	}

	public void getListDepartments() throws ClassNotFoundException, SQLException {

		List<Department> Departments = DepartmentController.getListDepartments();
		System.out.printf("%-15s %-25s %-25s\n", "ID", "Email", "Fullname");
		for (Department Department : Departments) {
			System.out.printf("%-15s %-25s %-25s\n", Department.getId(), Department.getDepartmentName());
		}

	}
	

	public void getDepartmentById() throws ClassNotFoundException, SQLException {

		System.out.print("Enter Department ID: ");
		int DepartmentId = ScannerUtils.inputPositiveInt("Only positive integers allowed! Please enter again: ");

		Department Department = DepartmentController.getDepartmentById(DepartmentId);

		if (Department != null) {
			System.out.println(Department);
		} else {
			System.err.println("No Departments found for id = " + DepartmentId);
		}
	}

	public void deleteDepartmentById() throws ClassNotFoundException, SQLException {
		while (true) {
			System.out.print("Enter Department ID to delete: ");
			int DepartmentId = ScannerUtils.inputPositiveInt("Only integers allowed! Please enter again: ");
			boolean result = DepartmentController.deleteDepartmentExistsById(DepartmentId);
			if (result) {
				System.out.println("Delete succesfully");
				return;
			} else {
				System.err.println("No Departments found for id = " + DepartmentId);
			}
		}
	}

//	public Department login() throws ClassNotFoundException, SQLException {
//		while (true) {
//			System.out.print("Enter your email: ");
//			String email = ScannerUtils.inputEmail("Invalid email! Please enter again");
//
//			System.out.print("Enter your password: ");
//			String password = ScannerUtils
//					.inputPassword("Invalid password! Please enter again!");
//
//			Department Department = DepartmentController.login(email, password);
//
//			if (Department != null) {
//				System.out.printf("Welcome %s \n \n \n", Department.getDepartmentName());
//				return Department;
//			} else {
//				System.err.println("Invalid email/password! Please enter again!");
//			}
//		}
//	}

	public void addDepartment() throws ClassNotFoundException, SQLException {
		System.out.print("Enter your fullname: ");
		String fullname = ScannerUtils.inputName("Invalid fullname! Please enter again");

		String department_name;
		System.out.print("Enter department name: ");
		while (true) {
			department_name = ScannerUtils.inputString("Invalid email! Please enter again");
			boolean resultExistsEmail = DepartmentController.isDepartmentExistsByName(department_name);
			if (resultExistsEmail) {
				System.err.printf("\nEmail already exists! ", department_name);
			} else {
				break;
			}
		}

		DepartmentController.createDepartment(department_name);
		System.out.printf("Create account successfully", department_name);
	}

	public void isDepartmentExistsByID() {
		// TODO Auto-generated method stub
		
	}
}
