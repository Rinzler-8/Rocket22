package com.vti.entity;

import java.time.LocalDate;

public class Student8 implements Comparable<Student8> {
	private long id;
	private String name;
	private LocalDate birthday;
	private float point;

	public Student8() {

	}

	public Student8(long id, String name, LocalDate birthday, float point) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.point = point;
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

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public float getPoint() {
		return point;
	}

	public void setPoint(float point) {
		this.point = point;
	}

	@Override
	public int compareTo(Student8 o) {
		// TODO Auto-generated method stub
		if (this.name.compareTo(o.name) > 0) {
			return 1;
		}
		return this.name.compareTo(o.getName());
	}

}
