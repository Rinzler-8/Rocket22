package com.vti.backend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.vti.entity.Student;
import com.vti.utils.ScannerUtils;

public class Ex1 {
	List<Student> studentList = new ArrayList<Student>();

	public Ex1() {
		Student s1 = new Student("Bing chiiling");
		Student s2 = new Student("Bing chiiling");
		Student s3 = new Student("Bing chiiling");
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		System.out.print("Enter number of students: ");
		int num = ScannerUtils.inputIntPositive();
		for (int i = 0; i < num - 3; i++) {
			Student st = new Student(ScannerUtils.inputString());
			studentList.add(st);
		}

	}

	public void menu() {
		while (true) {
			System.out.println("---Select an option---");
			int choice = ScannerUtils.inputIntPositive();
			switch (choice) {
			case 1:
				totalStudent();
				break;
			case 2:
				Student_4th();
				break;
			case 3:
				firstLastStudent();
				break;
			case 4:
				addStudentHeadList();
				break;
			case 5:
				addStudentEndList();
				break;
			case 6:
				reverseStudent();
				break;
			case 7:
				searchStudentID();
				break;
			case 8:
				searchStudentName();
				break;
			case 9:

				break;
			case 10:
				delNameByID();
				break;
			case 11:
				delStudentByID();
				break;
			case 12:
				arrayListCopy();
				break;
			}
		}
	}

	public void printStudent() {
		for (Student s : studentList) {
			System.out.println(s);
		}
	}

	public void totalStudent() {
		System.out.println("Total number of student is: " + studentList.size());
		printStudent();
	}

	public void Student_4th() {
		System.out.println("4th student info: " + studentList.get(3));
	}

	public void firstLastStudent() {
		System.out.println("1st student info: " + studentList.get(0));
		System.out.println("Last student info: " + studentList.get(studentList.size() - 1));
	}

	public void addStudentHeadList() {
		System.out.println("---Add student at the head of the list---");
		studentList.add(0, new Student(ScannerUtils.inputString()));
		printStudent();
	}

	public void addStudentEndList() {
		System.out.println("---Add student at the end of the list---");
		studentList.add(new Student(ScannerUtils.inputString()));
		printStudent();
	}

	public void reverseStudent() {
		Collections.reverse(studentList);
		System.out.println("Student list after reverse: ");
		printStudent();
	}

	public void searchStudentID() {
		System.out.println("---Search student by ID---");
		System.out.print("Enter an ID: ");
		int searchID = ScannerUtils.inputIntPositive();
		for (Student searchStudent : studentList) {
			if (searchStudent.getId() == searchID) {
				studentList.remove(searchStudent);
			}
		}
	}

	public void searchStudentName() {
		System.out.println("---Search student by Name---");
		System.out.print("Enter a name: ");
		String searchName = ScannerUtils.inputString();
		for (Student searchStudent : studentList) {
			if (searchStudent.getName().equals(searchName)) {
				System.out.println(searchStudent);
			}
		}
	}

	public void printSameName() {
		System.out.println("---Print student with same name---");
		for (int i = 0; i < studentList.size(); i++) {
			for (int j = i + 1; i < studentList.size(); j++) {

			}
		}
	}

	public void delNameByID() {
		System.out.println("---Delete student name by ID = 2---");
		for (Student studentID2 : studentList) {
			if (studentID2.getId() == 2) {
				studentID2.setName(null);
			}
		}
		printSameName();
	}

	public void delStudentByID() {
		System.out.println("---Delete student by ID = 5---");
		for (Student studentID5 : studentList) {
			if (studentID5.getId() == 5) {
				studentList.remove(studentID5);
			}
		}
		printSameName();
	}

	public void arrayListCopy() {
		System.out.println("---Student copy arraylist---");
		List<Student> studentCopies = new ArrayList<Student>();
		// studentCopies.addAll(studentList);
		for (Student st : studentList) {
			studentCopies.add(st);
		}
		System.out.println("Print ArrayCopy: ");
		for (Student student : studentCopies) {
			System.out.println(student);
		}
	}
}
