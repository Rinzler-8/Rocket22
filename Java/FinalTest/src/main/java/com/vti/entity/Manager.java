package com.vti.entity;

public class Manager extends User {

	private int expInYear;

	public Manager(int id, String fullName, String email, int expInYear) {
		super(id, fullName, email, Role.MANAGER);
		this.expInYear = expInYear;
	}

	public Manager(int id, String fullName, String email) {
		super(id, fullName, email, Role.MANAGER);
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	@Override
	public String toString() {
		return "Admin [expInYear=" + expInYear + ", id=" + id + ", fullName=" + fullName + ", email=" + email
				+ ", role=" + role + "]";
	}

}
