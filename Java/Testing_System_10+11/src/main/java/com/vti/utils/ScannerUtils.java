package com.vti.utils;

import java.util.Scanner;

public class ScannerUtils {
	private static Scanner sc = new Scanner(System.in);

	public static int inputFunction(int a, int b, String errorMessage) {
		while (true) {
			int number = ScannerUtils.inputInt();
			if (number >= a && number <= b) {
				return number;
			} else {
				System.err.println(errorMessage);
			}
		}
	}

	public static String inputEmail() {
		while (true) {
			String email = ScannerUtils.inputString();
			if (email == null || !email.contains("@")) {
				System.err.println("Invalid! Try again");
				System.out.print("Enter your email: ");
			} else {
				return email;
			}
		}
	}

	public static String inputPassword() {
		while (true) {
			String password = ScannerUtils.inputString();
			if (password.length() < 6 || password.length() > 12) {
				System.err.println("Invalid! Try again");
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
				System.err.println("Invalid! Try again");
				System.out.print("Enter your password again: ");
			}
		}
	}

	public static String inputPhoneNumber() {
		while (true) {
			String number = ScannerUtils.inputString();
			if (number.length() > 12 || number.length() < 9) {
				System.err.println("Invalid! Try again");
				continue;
			}

			if (number.charAt(0) != '0') {
				System.err.println("Invalid! Try again");
				continue;
			}

			boolean isNumber = false;

			for (int i = 0; i < number.length(); i++) {
				if (Character.isDigit(number.charAt(i)) == true) {
					isNumber = true;
					break;
				}
			}
			if (isNumber == true) {
				return number;
			} else {
				System.out.println("Invalid! Try again");
				System.out.print("Enter your phone number again: ");
			}

		}
	}

	public static int inputPositiveInt() {
		while (true) {
			int id = ScannerUtils.inputInt();
			if (id < 0) {
				System.err.println("Invalid! Try again");
			} else {
				return id;
			}
		}
	}

	public static int inputInt() {
		while (true) {
			try {
				String input = sc.next();
				input = input.trim();
				int output = Integer.parseInt(input);
				return output;
			} catch (Exception e) {
				System.err.println("Invalid ! Try again");
			}
		}
	}

	public static float inputPositiveMoney() {
		while (true) {
			float money = ScannerUtils.inputMoney();
			if (money < 0) {
				System.err.print("Invalid! Try again");
			} else {
				return money;
			}
		}
	}

	public static float inputMoney() {
		while (true) {
			try {
				String inputMoney = sc.nextLine();
				inputMoney = inputMoney.trim();
				float outputMoney = Float.parseFloat(inputMoney);
				return outputMoney;
			} catch (Exception e) {
				System.err.println();
			}
		}
	}

	public static String inputString() {
		while (true) {
			String string = sc.next().trim();
			if (!string.isEmpty()) {
				return string;
			} else {
				System.err.println("Invalid! Try again");
			}
		}
	}

	public static String inputName() {
		while (true) {

			String name = ScannerUtils.inputString();

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

	public static float inputFloat(String errorMessage) {
		while (true) {
			try {
				return Float.parseFloat(sc.next());
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println(errorMessage);
			}
		}
	}

	public static double inputDouble(String errorMessage) {
		while (true) {
			try {
				return Double.parseDouble(sc.next());
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println(errorMessage);
			}
		}
	}

	public static long inputLong(String errorMessage) {
		while (true) {
			try {
				return Long.parseLong(sc.next());
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println(errorMessage);
			}
		}
	}

	public static int inputIntPositive() {
		while (true) {
			try {
				int intPositive = Integer.parseInt(sc.next());
				if (intPositive >= 0) {
					return intPositive;
				} else {
					System.out.println("Invalid. Try again with a positive");
				}
			} catch (Exception e) {
				System.out.println("Invalid. Try again with an int");
			}
		}
	}
}
