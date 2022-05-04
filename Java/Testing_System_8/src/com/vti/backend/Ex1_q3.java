package com.vti.backend;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.vti.entity.Student;
import com.vti.utils.ScannerUtils;

public class Ex1_q3 {
	Set<Student> studentSet = new HashSet<Student>();

	public void menu() {
		while (true) {
			System.out.println("Enter an option");
			int choice = ScannerUtils.inputIntPositive();
			switch (choice) {
			case 1:
				System.out.println("Enter a number of students: ");
				int num2 = ScannerUtils.inputIntPositive();
				for (int i = 0; i < num2; i++) {
					Student stSet = new Student(ScannerUtils.inputString());
					studentSet.add(stSet);
					Iterator<Student> setIterator = studentSet.iterator();
					for (int i2 = 0; i2 < studentSet.size(); i2++) {
						System.out.println(setIterator.next());
					}
				}
				break;
			case 2:
				System.out.println("Total num in Set: " + studentSet.size());
				break;
			case 3:
				System.out.println("4th index in Set: ");
				Iterator<Student> setIterator4th = studentSet.iterator();
				for (int i3 = 0; i3 < 2; i3++) {
					setIterator4th.next();
				}
				System.out.println(setIterator4th.next());
			}
		}
	}
}
