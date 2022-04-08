package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.ex6.VietnamesePhone;

public class Ex6 {
	Scanner sc = new Scanner(System.in);
	
	public Ex6() {
		
	}
	
	public void q1() {
		menu();
	}
	
	private void menu() {
		//VietnamesePhone vnPhone = new VietnamesePhone();
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
			switch(choice) {
			case 1: 
				
			}
		}
		
	}
}
