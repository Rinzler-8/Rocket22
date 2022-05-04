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

	public Department getDepartmentById(int DepartmentId) throws ClassNotFoundException, SQLException {
		return DepartmentDao.getDepById(DepartmentId);
	}

	public boolean deleteDepartmentExistsById(int DepartmentId) throws ClassNotFoundException, SQLException {
		return DepartmentDao.deleteDepartmentExistsById(DepartmentId);
	}

//	public Department login(String email, String password) throws ClassNotFoundException, SQLException {
//		return DepartmentDao.login(email, password);
//	}

	public boolean isDepartmentExistsByName(String email) throws ClassNotFoundException, SQLException {
		return DepartmentDao.isDepartmentExistsByName(email);
	}

	public void createDepartment(String department_name) throws ClassNotFoundException, SQLException {
		DepartmentDao.createDepartment(department_name);
	}
}
