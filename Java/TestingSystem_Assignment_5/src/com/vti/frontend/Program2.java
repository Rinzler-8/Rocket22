package com.vti.frontend;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.vti.entity.Ex2.Student;

public class Program2 {
	public static void main(String[] args) {
		try {
			enterInt(null);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally");
		}
	}

	private static void enterInt(Student student) throws ArithmeticException {

		boolean isContinue = false;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter int: ");
				int value = sc.nextInt();
				System.out.println(value);
				isContinue = false;

				if (value < 18) {
					throw new ArithmeticException("Enter an int greater than 18");
				}
			} catch (InputMismatchException e) {
				isContinue = true;
				System.out.println("Please enter an integer!");
			}
		} while (isContinue);
	}

	private static void enterLong(Student student) throws NullPointerException {

		boolean isContinue = false;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter int: ");
				int value = sc.nextInt();
				System.out.println(value);
				isContinue = false;
				if (value < 18) {
					throw new ArithmeticException("Enter an int greater than 18");
				}
			} catch (InputMismatchException e) {
				isContinue = true;
				System.out.println("Please enter an integer!");
			}
		} while (isContinue);
	}
}
