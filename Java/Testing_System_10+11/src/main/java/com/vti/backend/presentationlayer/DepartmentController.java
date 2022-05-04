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

	public Department getDepartmentById(long departmentId) throws ClassNotFoundException, SQLException {
		return DepartmentService.getDepartmentById(departmentId);
	}

//	public Department login(String email, String password) throws ClassNotFoundException, SQLException {
//		return DepartmentService.login(email, password);
//	}

	public boolean deleteDepartmentExistsById(long departmentId) throws ClassNotFoundException, SQLException {
		return DepartmentService.deleteDepartmentExistsById(departmentId);
	}

	public boolean isDepartmentExistsByName(String department_name) throws ClassNotFoundException, SQLException {
		return DepartmentService.isDepartmentExistsByName(department_name);
	}
	public boolean isDepartmentExistsByID(long department_id) throws ClassNotFoundException, SQLException {
		return DepartmentService.isDepartmentExistsByID(department_id);
	}

	public void createDepartment(String department_name) throws ClassNotFoundException, SQLException {
		DepartmentService.createDepartment(department_name);
	}
	public boolean updateDepartmentName(long departmentId, String newName) throws ClassNotFoundException, SQLException {
		return DepartmentService.updateDepartmentName(departmentId, newName);
	}
}
