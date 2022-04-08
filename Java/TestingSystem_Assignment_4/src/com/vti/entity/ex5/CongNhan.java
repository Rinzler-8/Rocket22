package com.vti.entity.ex5;

public class CongNhan extends CanBo {
	private int rank;

	public CongNhan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CongNhan(String name, int age, String address, Gender gender, int rank) {
		super(name, age, address, gender);
		// TODO Auto-generated constructor stub
		this.rank = rank;
	}

	@Override
	public String toString() {
		return super.toString() + "CongNhan [rank=" + rank + "]";
	}

}
