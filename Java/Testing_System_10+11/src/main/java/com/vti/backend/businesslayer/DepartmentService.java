package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.DepartmentDao;
import com.vti.entity.Department;

public class DepartmentService {

	private DepartmentDao DepartmentDao;

	public DepartmentService() {
		DepartmentDao = new DepartmentDao();
	}

	public List<Department> getListDepartments() throws ClassNotFoundException, SQLException {
		return DepartmentDao.getListDepartment();
	}

	public Department getDepartmentById(long departmentId) throws ClassNotFoundException, SQLException {
		return DepartmentDao.getDepById(departmentId);
	}

	public boolean deleteDepartmentExistsById(long departmentId) throws ClassNotFoundException, SQLException {
		return DepartmentDao.deleteDepartmentExistsById(departmentId);
	}

//	public Department login(String email, String password) throws ClassNotFoundException, SQLException {
//		return DepartmentDao.login(email, password);
//	}

	public boolean isDepartmentExistsByName(String email) throws ClassNotFoundException, SQLException {
		return DepartmentDao.isDepartmentExistsByName(email);
	}

	public boolean isDepartmentExistsByID(long department_id) throws ClassNotFoundException, SQLException {
		return DepartmentDao.isDepartmentExistsByID(department_id);
	}
	public void createDepartment(String department_name) throws ClassNotFoundException, SQLException {
		DepartmentDao.createDepartment(department_name);
	}
	
	public boolean updateDepartmentName(long departmentId, String newName) throws ClassNotFoundException, SQLException {
		return DepartmentDao.updateDepartmentName(departmentId, newName);
	}
}
