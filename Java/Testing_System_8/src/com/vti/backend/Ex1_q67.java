package com.vti.backend;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.vti.entity.Student;
import com.vti.utils.ScannerUtils;

public class Ex1_q67 {
	public void q67() {
		Map<Integer, String> studentMap = new HashMap<Integer, String>();
		while (true) {
			switch (ScannerUtils.inputIntPositive()) {
			case 1:
				System.out.println("Enter a number of students: ");
				int num = ScannerUtils.inputIntPositive();
				for (int i = 0; i < num; i++) {
					System.out.print("Enter student ID: ");
					int id = ScannerUtils.inputIntPositive();
					System.out.print("Enter student name: ");
					String name = ScannerUtils.inputString();
					studentMap.put(id, name);
					System.out.println("Student list in map: ");

					for (Map.Entry<Integer, String> mapStudent : studentMap.entrySet()) {

						System.out.println("ID: " + mapStudent.getKey()

								+ " Name: " + mapStudent.getValue());

					}
					break;
				}
			case 2:
				System.out.println("Print keys in map: ");
				for (Map.Entry<Integer, String> st : studentMap.entrySet()) {
					System.out.println(st.getKey());
				}
				break;
			}
		}
	}
}
