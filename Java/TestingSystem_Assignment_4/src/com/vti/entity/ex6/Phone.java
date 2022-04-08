package com.vti.entity.ex6;

public abstract class Phone {
	public abstract void insertContact(String name, int number);
	
	public abstract void removeContact(String name);
	
	public abstract void updateContact(String name, int newNumber);
	
	public abstract void searchContact(String name);
}
