package com.vti.entity.ex6;

public class Employee extends User {

	public Employee(String name, double salaryRatio) {
		super(name, salaryRatio);
	}

	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		return salaryRatio * 420;
		
	}

}
