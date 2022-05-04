package com.vti.backend;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Student;

public class StudentMethod {
	Scanner sc = new Scanner(System.in);
	List<Student> studentList = new ArrayList<Student>();

	public void insert() throws InputMismatchException {
		System.out.print("Enter student name: ");
		String name = sc.nextLine();
		System.out.print("Enter student age: ");
		int age = sc.nextInt();
		Student student = new Student(name, age);
		studentList.add(student);
		
		if (age < 18) {
			throw new InputMismatchException ("Enter an age greater than 18");
		}
	}

}
