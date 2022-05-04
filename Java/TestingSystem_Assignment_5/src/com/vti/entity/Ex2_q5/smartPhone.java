package com.vti.entity.Ex2_q5;

public class smartPhone extends mobilePhone {
	@Override
	public void attack() {
		System.out.println("Smartphone attacks");
	}

	public void use3G() {
		System.out.println("Using 3G");
	}

	public void camera() {
		System.out.println("Taking picture");
	}

}
