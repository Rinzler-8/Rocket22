package com.vti.entity;

public class Department {
	private long id;
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public long getId() {
		return id;
	}

	public void setId(long departmentId) {
		this.id = departmentId;
	}

	public Department(String departmentName) {
		this.id = 0;
		this.departmentName = departmentName;
	}

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(long id, String departmentName) {
		super();
		this.id = id;
		this.departmentName = departmentName;
	}

}