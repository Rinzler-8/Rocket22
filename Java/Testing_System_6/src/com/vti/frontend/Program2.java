package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.Ex2;
import com.vti.backend.Ex2_q5;
import com.vti.backend.Ex2_q9;
import com.vti.entity.Department;

public class Program2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		q1();
//		Department.getIndex();
//		q3();
		Ex2_q5.inputAge();
//		Ex2_q9.q9_de();
		//Ex2_q9.q9_pos();
	}

	private static void q1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num 1: ");
		int a = sc.nextInt();
		System.out.println("Enter num 2: ");
		int b = sc.nextInt();
		try {
			System.out.println("The quotient of two numbers is: " + Ex2.divide(a, b));
		} catch (Exception e) {
			System.out.print("Cannot divide 0");
		} finally {
			System.out.println("");
			System.out.println("Divide complete");
		}
	}

	private static void q3() {
		int numbers[] = { 1, 2, 3 };
		try {
			System.out.println(numbers[10]);
		} catch (Exception e) {
			System.out.println("Cannot find numbers[10]");
		}
	}

	private static void q4() {

	}
}
