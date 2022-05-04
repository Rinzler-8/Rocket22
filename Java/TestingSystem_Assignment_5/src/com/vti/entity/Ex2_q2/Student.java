package com.vti.entity.Ex2_q2;

import java.util.Scanner;

public class Student extends Person {
	Scanner sc = new Scanner(System.in);
	private int id;
	private float avgGrade;
	private String email;

	@Override
	public void inputInfo() {
		System.out.print("ID: ");
		this.id = sc.nextInt();
		System.out.print("GradeAvg: ");
		this.avgGrade = sc.nextFloat();
		System.out.print("email: ");
		this.email = sc.next();
	}

	@Override
	public String showInfo() {
		// TODO Auto-generated method stub
		return "Student [id=" + id + ", Average grade=" + avgGrade + ", Email=" + email + "]";
	}

	public boolean scholar() {
		return avgGrade > 8 ? true : false;
	}
}
