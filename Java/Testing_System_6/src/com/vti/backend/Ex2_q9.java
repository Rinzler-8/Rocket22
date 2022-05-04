package com.vti.backend;

import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Department;

public class Ex2_q9 {
	public static void q9_de() throws Exception {
		List<Department> deList = new ArrayList<Department>();
		Department dep1 = new Department();
		Department dep2 = new Department();
		deList.add(dep1);
		deList.add(dep2);
		System.out.println("Department info: ");
		for (Department deInfo : deList) {
			System.out.println(deInfo);
		}

	}

	public static void q9_pos() throws Exception {
		System.out.println("Enter a position: ");
		Department pos1 = new Department();
		System.out.println("Position info: ");
		System.out.println(pos1);
	}

}
