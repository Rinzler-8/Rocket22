package com.vti.entity;

public class Admin extends User {
	private int ExpInYear;

	public Admin(int id, String fullName, String email, String password, int expInYear) {
		super(id, fullName, email, password);
		ExpInYear = expInYear;
	}

	public int getExpInYear() {
		return ExpInYear;
	}

	public void setExpInYear(int expInYear) {
		ExpInYear = expInYear;
	}

	@Override
	public String toString() {
		return "Admin [expInYear=" + ExpInYear + ", id=" + id + ", fullName=" + fullName + ", email=" + email + "]";
	}

}
