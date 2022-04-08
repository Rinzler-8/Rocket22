package com.vti.entity.ex5;

public class CanBo {
	private static String name;
	private int age;
	private String address;
	private Gender gender;

	public enum Gender {
		MALE, FEMALE, UNKNOWN;
	}

	public CanBo() {
		// do nothing
	}

	public CanBo(String name, int age, String address, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
	}

	public static String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "CanBo [name=" + name + ", age=" + age + ", address=" + address + ", gender=" + gender + "]";
	}

}
