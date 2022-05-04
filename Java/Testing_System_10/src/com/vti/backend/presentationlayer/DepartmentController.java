package com.vti.backend.presentationlayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.DepartmentService;
import com.vti.entity.Department;

public class DepartmentController {

	private DepartmentService DepartmentService;

	public DepartmentController() {
		DepartmentService = new DepartmentService();
	}

	public List<Department> getListDepartments() throws ClassNotFoundException, SQLException {
		return DepartmentService.getListDepartments();
	}

	public Department getDepartmentById(int DepartmentId) throws ClassNotFoundException, SQLException {
		return DepartmentService.getDepartmentById(DepartmentId);
	}

//	public Department login(String email, String password) throws ClassNotFoundException, SQLException {
//		return DepartmentService.login(email, password);
//	}

	public boolean deleteDepartmentExistsById(int DepartmentId) throws ClassNotFoundException, SQLException {
		return DepartmentService.deleteDepartmentExistsById(DepartmentId);
	}

	public boolean isDepartmentExistsByName(String department_name) throws ClassNotFoundException, SQLException {
		return DepartmentService.isDepartmentExistsByName(department_name);
	}

	public void createDepartment(String department_name) throws ClassNotFoundException, SQLException {
		DepartmentService.createDepartment(department_name);
	}
}
