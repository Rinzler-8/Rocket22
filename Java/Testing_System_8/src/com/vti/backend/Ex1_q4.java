package com.vti.backend;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.vti.entity.Student;
import com.vti.utils.ScannerUtils;

public class Ex1_q4 {
	public void q4() {
		List<Student> sList = new ArrayList<Student>();
		System.out.println("Enter a number of students: ");
		int num45 = ScannerUtils.inputIntPositive();
		for (int i = 0; i < num45; i++) {
			System.out.print("Enter student ID: ");
			int id45 = ScannerUtils.inputIntPositive();
			System.out.print("Enter student name: ");
			String name45 = ScannerUtils.inputString();
			Student st45 = new Student(id45, name45);
			sList.add(st45);
		}
		System.out.println("Total number of students: " + sList.size());

		Iterator<Student> i1 = sList.iterator();

		for (int i = 0; i < sList.size(); i++) {
			System.out.println(i1.next());
		}
	}
	

}