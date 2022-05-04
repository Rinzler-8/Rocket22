package com.vti.frontend;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import com.vti.backend.Ex1;
import com.vti.backend.Ex1_q3;
import com.vti.backend.Ex1_q4;
import com.vti.entity.Example;
import com.vti.entity.MyMath;
import com.vti.entity.Student;
import com.vti.exceptions.NumberOfStudentsException;
import com.vti.utils.ScannerUtils;

public class P1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException, NumberOfStudentsException {
		MyMath demo = new MyMath();
		demo.sum2numInt(5, 4);
//		Ex1 e1 = new Ex1();
//		e1.menu();

//		Ex1_q3 q3 = new Ex1_q3();
//		q3.menu();
//		
//		Ex1_q4 q4 = new Ex1_q4();
//		q4.q4();

//		
//		Example ex1 = new Example();
//		Example ex2 = new Example();
//		Example<Integer> example = new Example();
//		example.setId(Integer.valueOf(1));
//		Example<String> example3 = new Example();
//		example3.setId("");
//		
//		
//		useStack();
//		Student st1 = new Student();
//		Student st2 = new Student();
//		System.out.println(st1.compareTo(st2));
//
//		Comparator<Student> comparator = new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				if (o1.getId() > o2.getId()) {
//					return 1;
//				} else if (o1.getId() < o2.getId()) {
//					return -1;
//				} else {
//					return 0;
//				}
//			}
//
//		};
//		List<Student> students = new ArrayList<>();
//		students.add(st1);
//		students.add(st2);
//
//	}
//	// TODO Auto-generated method stub
//
//	private static void useStack() {
//		Stack<String> studentStack = new Stack<>();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number: ");
//		int numOfStudents = ScannerUtils.inputIntPositive();
//
//		for (int i = 0; i < numOfStudents; i++) {
//			System.out.println("Enter a name of student: ");
//			studentStack.push(ScannerUtils.inputString());
//		}
//		System.out.println("Stack student: ");
//		while (!studentStack.isEmpty()) {
//			System.out.println(studentStack.pop());
//		}
//	}

	}
}
