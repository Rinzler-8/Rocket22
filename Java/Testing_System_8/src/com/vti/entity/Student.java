package com.vti.entity;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private int age;
	private static int count;

	public Student(String name) {
		super();
		this.id = ++count;
		this.name = name;
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Student student) {
		if (this.age > student.age) {
			return 1;
		} else if (this.age < student.age) {
			return -1;
		}
		return 0;
	}
	
}
