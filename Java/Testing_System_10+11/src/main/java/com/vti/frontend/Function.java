package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.vti.backend.presentationlayer.DepartmentController;
import com.vti.entity.Department;
import com.vti.utils.ScannerUtils;

public class Function {

	private static DepartmentController DepartmentController;

	public Function() {
		DepartmentController = new DepartmentController();
	}

	public void getListDepartments() throws ClassNotFoundException, SQLException {

		List<Department> Departments = DepartmentController.getListDepartments();
		System.out.printf("%-15s %-25s\n", "DepartmentID", "DepartmentName");
		for (Department Department : Departments) {
			System.out.printf("%-15s %-25s\n", Department.getId(), Department.getDepartmentName());
		}

	}

	public void getDepartmentById() throws ClassNotFoundException, SQLException {

		System.out.print("Enter Department ID: ");
		int DepartmentId = ScannerUtils.inputPositiveInt();

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
			long DepartmentId = ScannerUtils.inputPositiveInt();
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
		String department_name;
		while (true) {
			System.out.print("Enter department name: ");
			department_name = ScannerUtils.inputName();
			boolean resultExistsName = DepartmentController.isDepartmentExistsByName(department_name);
			if (resultExistsName) {
				System.err.printf("\nDepartment name already exists! ", department_name);
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

	public void updateDepartmentName() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		DepartmentController DepartmentController = new DepartmentController();
		long updateID = getIdUpdate();
		System.out.print("Enter a name to update: ");
		String newName = ScannerUtils.inputString();
//		String newName = sc.nextLine();
		if (DepartmentController.updateDepartmentName(updateID, newName)) {
			System.out.println("Update successfully");
			getListDepartments();
		} else {
			System.err.println("Error");
		}
	}

	private static long getIdUpdate() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		DepartmentController DepartmentController = new DepartmentController();
		while (true) {
			System.out.print("Enter departmentID needs to update: ");
			long id = ScannerUtils.inputLong("Only long allowed! Please enter again");
			Department dep = DepartmentController.getDepartmentById(id);
			if (dep == null) {
				System.out.println("No ID found");
			} else {
				return id;
			}
		}
	}
}
