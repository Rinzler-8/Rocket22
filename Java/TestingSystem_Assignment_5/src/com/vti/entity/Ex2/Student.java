package com.vti.entity.Ex2;

public class Student implements IStudent {
	private static long id;
	private String name;
	private int group;
	public static long currentID = 0;

	public void auto() {
		currentID++;
		id = currentID;
	}

	public Student() {
		auto();
	}

	public Student(String username) {
		auto();
		this.name = username;
	}

	public Student(int id, String name, int group) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", group=" + group + "]";
	}

	@Override
	public void diemDanh() {
		System.out.println(name + " diem danh");
	}

	@Override
	public void hocBai() {
		System.out.println(name + " dang hoc bai");

	}

	@Override
	public void donVeSinh() {
		System.out.println(name + " ");

	}

}
