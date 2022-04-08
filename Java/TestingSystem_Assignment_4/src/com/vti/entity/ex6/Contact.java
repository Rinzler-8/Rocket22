package com.vti.entity.ex6;

public class Contact {
	String name;
	int number;

	public Contact(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", number=" + number + "]";
	}

}
