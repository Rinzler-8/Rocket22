package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.random.RandomGenerator.ArbitrarilyJumpableGenerator;

import com.vti.entity.CanBo;
import com.vti.entity.CanBo.Gender;
import com.vti.entity.CongNhan;
import com.vti.entity.KySu;
import com.vti.entity.NhanVien;

public class Ex5 {
	Scanner sc = new Scanner(System.in);
	private ArrayList<CanBo> canBoList;

	// inheritance
	public Ex5() {
		canBoList = new ArrayList<CanBo>();

	}

	public void q1() {

	}

	public void q2() {
		menu();
	}

	public void menu() {

		while (true) {
			System.out.println("======================================================================");

			System.out.println("=================Options==================");

			System.out.println("=== 1. Add new Can Bo. ===");

			System.out.println("=== 2. Search. ===");

			System.out.println("=== 3. Display can bo list. ===");

			System.out.println("=== 4. Enter a name and delete ===");

			System.out.println("=== 5. Exit. ===");

			System.out.println("======================================================================");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				add();
				break;
			case 2:
				search();
				break;
			case 3:
				displayList();
				break;
			case 4:
				delByName();
				break;
			case 5:
				return;
			}
		}
	}

	private void displayList() {
		for (CanBo canbo : canBoList) {
			System.out.println(canbo);
		}
	}

	private void search() {
		System.out.println("Enter a name to search: ");
		String findByName = sc.nextLine();
		for (CanBo canbo : canBoList) {
			if (canbo.getName().equals(sc.nextLine())) {
				System.out.println(canbo);
			}
		}
	}

	private void add() {
		System.out.println("======================================================================");

		System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng==================");

		System.out.println("=== 1. Add công nhân. ===");

		System.out.println("=== 2. Add kỹ sư. ===");

		System.out.println("=== 3. Add nhân viên. ===");

		System.out.println("======================================================================");
		int choice1 = sc.nextInt();
		switch (choice1) {
		case 1:
			System.out.println("Nhập vào tên Công Nhân: ");
			String nameCongNhan = sc.next();
			System.out.println("Nhập vào tuổi Công Nhân: ");
			int ageCongNhan = sc.nextInt();
			System.out.println("Nhập giới tính của công nhân: 1. Male, 2.Female, 3.Unknown: ");
			int choiceGender = sc.nextInt();
			Gender genderCongNhan = null;
			switch (choiceGender) {
			case 1:
				genderCongNhan = Gender.MALE;
				break;
			case 2:
				genderCongNhan = Gender.FEMALE;
				break;
			case 3:
				genderCongNhan = Gender.UNKNOWN;
				break;
			}
			System.out.println("Nhập vào địa chỉ Công Nhân: ");
			String addressCongNhan = sc.next();
			System.out.println("Nhập vào rank của Công Nhân: ");
			int rankCongNhan = sc.nextInt();
			CanBo CongNhan1 = new CongNhan(nameCongNhan, ageCongNhan, addressCongNhan, genderCongNhan, rankCongNhan);
			canBoList.add(CongNhan1);
			break;
		case 2:
			System.out.println("Enter Ky su name: ");
			String nameKySu = sc.next();
			System.out.println("Enter Ky su age: ");
			int ageKySu = sc.nextInt();
			System.out.println("Enter ky su gender: 1. Male, 2.Female, 3.Unknown: ");
			int choiceGender1 = sc.nextInt();
			Gender genderKySu = null;
			switch (choiceGender1) {
			case 1:
				genderKySu = Gender.MALE;
				break;
			case 2:
				genderKySu = Gender.FEMALE;
				break;
			case 3:
				genderKySu = Gender.UNKNOWN;
				break;
			}
			System.out.println("Enter Nhan Vien address: ");
			String addressKySu = sc.next();
			System.out.println("Enter Nhan Vien department: ");
			String departmentKySu = sc.next();
			CanBo KySu1 = new KySu(nameKySu, ageKySu, addressKySu, genderKySu, departmentKySu);
			canBoList.add(KySu1);
		case 3:
			System.out.println("Enter Nhan Vien name: ");
			String nameNhanVien = sc.next();
			System.out.println("Enter Nhan Vien age: ");
			int ageNhanVien = sc.nextInt();
			System.out.println("Enter Nhan Vien gender: 1. Male, 2.Female, 3.Unknown: ");
			int choiceGender2 = sc.nextInt();
			Gender genderNhanVien = null;
			switch (choiceGender2) {
			case 1:
				genderNhanVien = Gender.MALE;
				break;
			case 2:
				genderNhanVien = Gender.FEMALE;
				break;
			case 3:
				genderNhanVien = Gender.UNKNOWN;
				break;
			}
			System.out.println("Enter Nhan Vien address: ");
			String addressNhanVien = sc.next();
			System.out.println("Enter Nhan Vien department: ");
			String taskNhanVien = sc.next();
			CanBo nhanVien1 = new NhanVien(nameNhanVien, ageNhanVien, addressNhanVien, genderNhanVien, taskNhanVien);
			canBoList.add(nhanVien1);
		}

	}

	private void printListCanBo() {
		for (CanBo canbo : canBoList) {
			System.out.println(canbo);
		}
	}

	private void delByName() {
		System.out.println("Enter a name to delete: ");
		String delName = sc.next();
		canBoList.removeIf(CanBo.getName().equals(delName));
		printListCanBo();
	}
	
	
}
