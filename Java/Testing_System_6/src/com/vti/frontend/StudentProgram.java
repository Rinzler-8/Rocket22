package com.vti.frontend;

import java.util.InputMismatchException;

import com.vti.backend.StudentMethod;

public class StudentProgram {
	public static void main(String[] args) {
		try {
			StudentMethod student = new StudentMethod();
			student.insert();
		} catch (InputMismatchException e) {
			System.out.println("Enter an int");
		}
		catch (ArithmeticException e) {
			System.out.println("Enter an int greater than 18");
		}
	}
}
