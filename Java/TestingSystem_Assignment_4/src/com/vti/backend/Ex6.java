package com.vti.backend;

import java.util.Scanner;
import com.vti.entity.ex6.Phone;
import com.vti.entity.ex6.VietnamesePhone;

public class  Ex6 extends VietnamesePhone {
	Scanner sc = new Scanner(System.in);


	public Ex6() {

	}

	public void q1() {
		menu();
	}

	public void menu() {
		VietnamesePhone vnPhone = new VietnamesePhone();
		while (true) {
			System.out.println("======================================================================");

			System.out.println("=================Options==================");

			System.out.println("=== 1. Insert contact. ===");

			System.out.println("=== 2. Remove contact. ===");

			System.out.println("=== 3 Update contact. ===");

			System.out.println("=== 4. Search contact ===");

			System.out.println("=== 5. Show contact. ===");

			System.out.println("=== 5. Exit. ===");

			System.out.println("======================================================================");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter contact name: ");
				String name = sc.nextLine();
				System.out.println("Enter contact number: ");
				int num = sc.nextInt();
				vnPhone.insertContact(name, num);
				break;
			case 2:
				System.out.println("Enter a name to remove: ");
				String removeName = sc.next();
				vnPhone.removeContact(removeName);
				break;
			case 3:
				System.out.println("Enter new name to update: ");
				String newName = sc.next();
				System.out.println("Enter new phone to update: ");
				int newPhone = sc.nextInt();
				vnPhone.updateContact(newName, newPhone);
				System.out.println("New contact: ");
				vnPhone.searchContact(newName);
				break;
			case 4: 
				System.out.println("Enter a name to search: ");
				String searchName = sc.next();
				vnPhone.searchContact(searchName);
				break;
			case 5:
				vnPhone.printContact();
				break;
			case 6:
				return;
			default:
				System.out.println("Invalid. Choose again.");
				break;
			}

		}

	}
}
