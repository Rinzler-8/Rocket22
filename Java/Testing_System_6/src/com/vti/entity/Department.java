package com.vti.entity;

import java.util.Scanner;

import com.vti.utils.*;

public class Department {
	private Scanner sc;
	private int id;
	private String name;

	public Department() throws Exception {
		super();
		sc = new Scanner(System.in);
		System.out.print("Enter department ID: ");
		id = ScannerUtils.inputIntPositive();
		System.out.print("Enter department name: ");
		name = ScannerUtils.inputString();
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
