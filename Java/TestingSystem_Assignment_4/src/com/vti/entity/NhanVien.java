package com.vti.entity;

public class NhanVien extends CanBo {
	private String task;
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String name, int age, String address, Gender gender, String task) {
		super(name, age, address, gender);
		this.task = task;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "NhanVien [task=" + task + "]";
	}
	
}
