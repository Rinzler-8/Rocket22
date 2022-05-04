package com.vti.backend;

import java.util.Scanner;

public class Ex2_q5 {
	public static int inputAge() {
		int age = 0;
		boolean isContinue = true;

		while (isContinue) {
			try {
				Scanner sc = new Scanner(System.in);
				isContinue = false;
				System.out.print("Enter user age: ");
				int intAge = Integer.parseInt(sc.next());
				if (intAge > 0) {
					System.out.println("User age is " + intAge);
				} else {
					System.out.println("Wrong inputing! The age must be greater	than 0, please input again.");
					isContinue = true;
				}
			} catch (Exception e) {
				System.out.println("Wrong inputing! Please input an age as int, input again.");
				isContinue = true;
			}
		}
		return age;
	}

//	
//	public int inputInt(String messageError) {
//		int intValue = 0;
//		while (true) {
//			try {
//				Scanner sc = new Scanner(System.in);
//				System.out.println("Enter integer: ");
//				String strValue = sc.nextLine();
//				intValue = Integer.valueOf(strValue).intValue();
//				if (intValue > 0) {
//					break;
//				}
//				System.out.println(messageError);
//			} catch (NumberFormatException e) {
//				// TODO: handle exception
//				System.out.println(messageError);
//			}
//		}
//		return intValue;
//	}
}
