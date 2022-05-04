package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.ex6.Employee;
import com.vti.entity.ex6.Manager;
import com.vti.entity.ex6.Waiter;

public class Ex6_ques3 {
	Scanner sc = new Scanner(System.in);

	// TODO Auto-generated method stub
	public void q3() {

		while (true) {
			System.out.println("======================================================================");

			System.out.println("=================Options==================");

			System.out.println("=== 1. Insert Employee. ===");

			System.out.println("=== 2. Insert Manager. ===");
			
			System.out.println("=== 3. Insert Waiter. ===");

			System.out.println("=== 4. Exit. ===");

			System.out.println("======================================================================");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Employee name: ");
				String eName = sc.nextLine();
				System.out.println("Enter Employee salary ratio: ");
				int eSalaryRatio = sc.nextInt();
				Employee e = new Employee(eName, eSalaryRatio);
				e.displayInfo();
				break;
			case 2:
				System.out.println("Enter Manager name: ");
				String mName = sc.nextLine();
				System.out.println("Enter Manager salary ratio: ");
				int mSalaryRatio = sc.nextInt();
				Manager m = new Manager(mName, mSalaryRatio);
				m.displayInfo();
				break;
			case 3:
				System.out.println("Enter Waiter name: ");
				String wName = sc.nextLine();
				System.out.println("Enter Waiter salary ratio: ");
				int wSalaryRatio = sc.nextInt();
				Waiter w = new Waiter(wName, wSalaryRatio);
				w.displayInfo();
				break;
			case 4:
				return;
			default:
				System.out.println("Invalid. Choose again.");
				break;
			}

		}
	}
}
