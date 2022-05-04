package com.vti.entity;

public class Department {
	private long departmentId;
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public long getId() {
		return departmentId;
	}

	public void setId(long departmentId) {
		this.departmentId = departmentId;
	}

	public Department(String departmentName) {
		this.departmentId = 0;
		this.departmentName = departmentName;
	}

	public Department(long departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public Department() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
}