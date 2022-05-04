package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.Ex2_q2.Person;
import com.vti.entity.Ex2_q2.Student;

public class Ex2_q2 {
	Scanner sc = new Scanner(System.in);

	public Ex2_q2() {
		super();
	}

	public void q2() {
		while (true) {
			System.out.println("=================Enter option===================");
			System.out.println("1.Person");
			System.out.println("2.Student");
			System.out.println("3.Exit");
			System.out.println("=================================================");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				person();
				break;
			case 2:
				student();
				break;
			case 3:
				return;
			default:
				System.out.println("Invalid. Try again");
			}
		}

	}

	private void student() {
		Student student = new Student();
		student.inputInfo();
		System.out.println("Student info: ");
		System.out.println(student.showInfo());
		if (student.scholar()) {
			System.out.println("Student got a scholarship");
		} else {
			System.out.println("Student didn't have one");
		}
	}

	private void person() {
		Person person = new Person();
		person.inputInfo();
		System.out.println("Person info: ");
		System.out.println(person.showInfo());
	}
}
