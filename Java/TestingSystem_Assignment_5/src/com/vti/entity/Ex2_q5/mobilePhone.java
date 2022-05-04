package com.vti.entity.Ex2_q5;

public abstract class mobilePhone implements weapon{
	public void pickUp() {
		System.out.println("Pick up the call");
	};

	
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Every phone can attack");
	}

	public void call() {
		System.out.println("Call");
	};

	public void text() {
		System.out.println("Send message");
	};

	public void receiveMess() {
		System.out.println("Receive message");
	}
}
