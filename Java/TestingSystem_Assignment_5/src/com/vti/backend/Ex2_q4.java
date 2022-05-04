package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.Ex2_q4.MyMath;

public class Ex2_q4 {
	Scanner sc = new Scanner(System.in);

	public Ex2_q4() {

	}

	public void q4() {

		System.out.println("Enter a: ");
		int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		MyMath getSum = new MyMath();
		System.out.println("Tong 2 so: " + getSum.sum(a, b));

	}
}
