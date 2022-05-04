package com.vti.utils;

import java.util.Scanner;

public class ScannerUtils {
	private static Scanner sc = new Scanner(System.in);

	public static int inputInt() {
		while (true) {
			try {
				return Integer.parseInt(sc.next());
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid. Try again");
			}
		}
	}

	public static float inputFloat() {
		while (true) {
			try {
				return Float.parseFloat(sc.next());
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid. Try again");
			}
		}
	}

	public static double inputDouble() {
		while (true) {
			try {
				return Double.parseDouble(sc.next());
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid. Try again");
			}
		}
	}

	public static String inputString() {
		while (true) {
			String str = sc.nextLine();
			if (!str.isEmpty()) {
				return str;
			} else {
				// TODO: handle exception

				System.out.println("Invalid. Try again");
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

	public static <T> void print(T value) {
		System.out.println(value);
	}

	public <T, U> void print2(T value1, U value2) {
		System.out.println(value1);
		System.out.println(value2);
	}
}
