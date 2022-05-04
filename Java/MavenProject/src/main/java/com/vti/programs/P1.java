package com.vti.programs;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Department;
import com.vti.respositories.DepartmentExRes;

public class P1 {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		DepartmentExRes res = new DepartmentExRes();
		List<Department> departments = new ArrayList<Department>();
		Department de = new Department(1, "Dev1");
		Department de2 = new Department(2, "Dev2");
		departments.add(de);
		departments.add(de2);

		res.insertAll(departments);

	}
}
