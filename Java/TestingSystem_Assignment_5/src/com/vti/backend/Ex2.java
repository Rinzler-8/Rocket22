package com.vti.backend;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;

import com.vti.entity.Ex2.Student;
import com.vti.entity.Ex2.*;

public class Ex2 {
	Scanner sc = new Scanner(System.in);
	ArrayList<Student> group1 = new ArrayList<Student>();
	int num;

	public void q1() {
		menu();
	}
//Student account1 = new Student();
//System.out.println("CurrentID lan 1: " + Student.currentID);
//Student account2 = new Student();
//System.out.println("CurrentID lan 2: " + account1.currentID);
	private void menu() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			Random random = new Random();
			ArrayList<Student> studentList = new ArrayList<Student>();
			System.out.println("=================Enter option===================");
			System.out.println("1. Create student list.");
			System.out.println("2. Display list.");
			System.out.println("3. Diem danh ca lop");
			System.out.println("4. Call group 1 'di hoc bai'");
			System.out.println("5. Call group 2 'di don ve sinh'");
			System.out.println("6. Exit");
			System.out.println("=================================================");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				for (int i = 1; i < 11; i++) {
					int id = i;
					System.out.println("Student ID: ");
					System.out.println("Enter student name: ");
					String name = sc.next();
					int group = random.nextInt(3) + 1;
					System.out.println("Student group: " + group);
					Student student = new Student(id, name, group);
					studentList.add(student);
				}
				break;
			case 2:
				for (Student displayStudent : studentList) {
					System.out.println(displayStudent);
				}
				break;
			case 3:
				for (Student allStudent : studentList) {
					allStudent.diemDanh();
				}
				break;
			case 4:
				System.out.println("Group 1 di hoc bai: ");
				for (Student studentGroup1 : studentList) {
					if (studentGroup1.getGroup() == 1) {
						studentGroup1.hocBai();
					}
				}
				break;
			case 5:
				System.out.println("Group 2 di don ve sinh: ");
				for (Student studentGroup2 : studentList) {
					if (studentGroup2.getGroup() == 2) {
						studentGroup2.donVeSinh();
					}
				}
				break;
			case 6:
				return;
			default:
				System.out.println("Invalid. Try again");
				break;
			}
		}
	}
}