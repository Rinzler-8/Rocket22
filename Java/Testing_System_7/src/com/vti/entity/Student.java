package com.vti.entity;

import com.vti.utils.ScannerUtils;

/**
 * @author Phucz
 *
 */
public class Student {
	private int id;
	private String name;
	private static String college;
	public static int moneyGroup;

	public int getMoneyGroup() {
		return moneyGroup;
	}

	public static void setMoneyGroup(int moneyGroup) {
		Student.moneyGroup = moneyGroup;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCollege() {
		return college;
	}

	public static void setCollege(String college) {
		Student.college = college;
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student(int id, String name, String college) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
	}

	public Student(int id, String name, String college, int moneyGroup) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.moneyGroup = moneyGroup;
	}

	public static int COUNT = 0;

	public Student() {
		super();
		this.id = ++COUNT;
		if (COUNT > 7) {
			System.err.println("Reach maximum students. Can't add more");
		} else {
			this.id = COUNT;
			System.out.println("Enter student name: ");
			this.name = ScannerUtils.inputString();
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", dong tien quy=" + moneyGroup + "]";
	}
	
	private static double groupMoney = 0;
	public static double withdraw(double money) {
		groupMoney -= money;
		return groupMoney;
	}
	public static double deposit(double money) {
		groupMoney += money;
		return groupMoney;
	}
	
	public double getGroupMoney() {
		return groupMoney;
	}
}
