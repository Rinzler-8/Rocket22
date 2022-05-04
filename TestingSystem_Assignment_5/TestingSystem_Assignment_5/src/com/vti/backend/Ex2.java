package com.vti.backend;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import com.vti.entity.ex2.*;

public class Ex2 {
	Scanner sc = new Scanner(System.in);
	ArrayList<Student> group1 = new ArrayList<Student>();

	public void q1() {
		menu();
	}

	private void menu() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			Random random = new Random();
			ArrayList<Student> studentList = new ArrayList<Student>();
			System.out.println("=======================================================================");
			System.out.println("=================Enter option===================");
			System.out.println("1. Create student list.");
			System.out.println("2. Display list.");
			System.out.println("3. Diem danh ca lop");
			System.out.println("4. Call group 1 'di hoc bai'");
			System.out.println("5. Call group 2 'di don ve sinh'");
			System.out.println("6. Exit");
			System.out.println("=======================================================================");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				for (int i = 1; i < 11; i++) {
					Student student = new Student("Student " + i, random.nextInt(3) + 1);
					studentList.add(student);
					System.out.println("Add 10 students successfully.");
				}
				break;
			case 2:
				for (Student student : studentList) {
					System.out.println(student);
				}
				break;
			}
		}
	}
}