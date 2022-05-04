package com.vti.utils;

import java.util.Scanner;

public class ScannerUtils {
	private static Scanner sc = new Scanner(System.in);

	public static int inputFunction(int a, int b, String errorMessage) {
		while (true) {
			int number = ScannerUtils.inputInt(errorMessage);
			if (number >= a && number <= b) {
				return number;
			} else {
				System.err.println(errorMessage);
			}
		}
	}

	public static String inputEmail(String errorMessage) {
		while (true) {
			String email = ScannerUtils.inputString(errorMessage);
			if (email == null || !email.contains("@")) {
				System.err.println(errorMessage);
				System.out.print("Enter your email: ");
			} else {
				return email;
			}
		}
	}

	public static String inputPassword(String errorMessage) {
		while (true) {
			String password = ScannerUtils.inputString(errorMessage);
			if (password.length() < 6 || password.length() > 12) {
				System.err.println(errorMessage);
				System.out.print("Enter your password: ");
				continue;
			}

			boolean hasAtLeast1Character = false;

			for (int i = 0; i < password.length(); i++) {
				if (Character.isUpperCase(password.charAt(i)) == true) {
					hasAtLeast1Character = true;
					break;
				}
			}
			if (hasAtLeast1Character == true) {
				return password;
			} else {
				System.err.println(errorMessage);
				System.out.print("Enter your password again: ");
			}
		}
	}

	public static int inputPositiveInt(String errorMessage) {
		while (true) {
			int id = ScannerUtils.inputInt(errorMessage);
			if (id < 0) {
				System.err.println(errorMessage);
			} else {
				return id;
			}
		}
	}

	public static int inputInt(String errorMessage) {
		while (true) {
			try {
				String input = sc.nextLine();
				input = input.trim();
				int output = Integer.parseInt(input);
				return output;
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	public static String inputString(String errorMessage) {
		while (true) {

			String inputString = sc.nextLine();
			inputString = inputString.trim();
			inputString = inputString.replaceAll("\\s+", " ");

			return inputString;
		}
	}

	public static String inputName(String errorMessage) {
		while (true) {

			String name = ScannerUtils.inputString(errorMessage);

			String[] words = name.split(" ");
			name = "";
			for (String word : words) {

				String firstCharacter = word.substring(0, 1).toUpperCase();
				String leftCharacter = word.substring(1).toLowerCase();
				word = firstCharacter + leftCharacter;
				name += word + " ";
			}

			return name.trim();
		}
	}
}
