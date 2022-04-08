package tut3;

import java.util.Scanner;

public class Ex1 {

	// Datatype casting
	private static void q1() {
		float salary1, salary2;
		salary1 = (float) 5240.5;
		salary2 = (float) 10970.055;

		int roundSalary1 = (int) salary1;
		int roundSalary2 = (int) salary2;
		System.out.println("Round salary 1 is: " + roundSalary1 + "and Round salary 2 is: " + roundSalary2);
	}

	private static void q2() {
		int max = 99999;
		int randomNum = (int) (Math.random() * max);
		for (int i = 0; randomNum < 10000; i++) {
			randomNum *= 10;
		}
		System.out.println(randomNum);
	}

	private static void q3() {
		int max = 99999;
		int randomNum = (int) (Math.random() * max);
		for (int i = 0; randomNum < 10000; i++) {
			randomNum *= 10;
		}
		String a = String.valueOf(randomNum);
		// System.out.println("Last 2 num: " + a.substring(3));
		System.out.println("Last 2 num: " + randomNum % 100);
	}

	private static void q4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Print int 1: ");
		int a = sc.nextInt();
		System.out.print("Print int 2: ");
		int b = sc.nextInt();
		System.out.println("Thương: " + a / b);
	}

	// boxing & unboxing
	private static void q5() {
		int salary = 5000;
		float floatSalary = (float) salary;
		System.out.printf("%2.2f", floatSalary);
	}

	private static void q6() {
		String str = "651879";
		int i = Integer.parseInt(str);
		System.out.println(i);
	}

	private static void q7() {
		Integer i = 1234567;
		int i1 = i.intValue();
		System.out.println(i1);
	}

	// String
	private static void q8() {
		String s1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi: ");
		s1 = sc.nextLine();
		String[] words = s1.split(" ");
		System.out.println("Số kí tự: " + words.length);
		sc.close();
	}

	private static void q9() {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi 1: ");
		String s1 = sc1.next();
		System.out.println("Nhập vào chuỗi 2: ");
		String s2 = sc1.next();

		System.out.println("Kết quả sau khi nối chuỗi: " + s1 + " " + s2);
		sc1.close();
	}

	private static void q10() {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Nhập Tên: ");
		name = sc.nextLine();
		String firstCharacter = name.substring(0, 1).toUpperCase();
		String leftCharacter = name.substring(1);
		System.out.println("char at:" + name.charAt(1));
		name = firstCharacter + leftCharacter;
		System.out.println(name);
		sc.close();
	}

	public static void main(String[] args) {
		Ex1.q5();

	}

}
