package com.vti.entity;

public class KySu extends CanBo {
	private String department;

	public KySu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KySu(String name, int age, String address, Gender gender, String department) {
		super(name, age, address, gender);
		this.department = department;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "KySu [department=" + department + "]";
	}

}
