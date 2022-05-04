package com.vti.entity.ex6;

import java.util.ArrayList;

public class VietnamesePhone extends Phone{
	public ArrayList<Contact> contactList;
	
	public VietnamesePhone() {
		contactList = new ArrayList<Contact>();
	}
	@Override
	public void insertContact(String name, int number) {
		Contact contact = new Contact(name, number);
		contactList.add(contact);
	}
	
	@Override
	public void removeContact(String name) {
		contactList.removeIf(contact -> contact.getName().equals(name));
	}

	@Override
	public void updateContact(String name, int newNumber) {
		// TODO Auto-generated method stub
		for (Contact updateContact : contactList) {
			updateContact.setName(name);
			updateContact.setNumber(newNumber);
		}
	}

	@Override
	public void searchContact(String name) {
		// TODO Auto-generated method stub
		for (Contact searchContact: contactList) {
			if (searchContact.getName().equals(name)) {
				System.out.println(searchContact);
			}
		}
	}
	
	public void printContact() {
		for (Contact printContact : contactList) {
			System.out.println(printContact);
		}
	}
	
	
}

