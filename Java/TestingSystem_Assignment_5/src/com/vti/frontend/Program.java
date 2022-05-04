package com.vti.frontend;

import com.vti.entity.Ex2.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(1, 0, null));
	}

	private static int divide(int a, int b, Student student) {
		int c = 0;
		try {
			c = a / b;
			// Student.auto();
		} catch (NullPointerException e) {
			c = 1;
		} catch (Exception e) {
			System.out.println("Exeption");
		}
		return c;
	}

	private static void print(int[] a) {
		System.out.println(a[0]);
	}
}
