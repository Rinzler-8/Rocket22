package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.Ex2_q3.hinhVuong;

public class Ex2_q3 {
	Scanner sc = new Scanner(System.in);
	private hinhVuong hv;

	public Ex2_q3() {

	}

	public void q3() {
		while (true) {
			System.out.println("=================Enter option===================");
			System.out.println("1.Tao hinh vuong");
			System.out.println("2.Tinh chu vi");
			System.out.println("3.Tinh dien tich");
			System.out.println("4.Exit");
			System.out.println("=================================================");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("--Tao 1 hinh vuong--");
				System.out.print("Nhap canh cua hinh vuong: ");
				int canh = sc.nextInt();
				hv = new hinhVuong(canh);

				break;
			case 2:
				int cv_hv = hv.tinhChuVi();
				System.out.println("Chu vi hv la: " + cv_hv);
				break;
			case 3:
				int dt_hv = hv.tinhDienTich();
				System.out.println("Dien tich hv la: " + dt_hv);
				break;
			}
		}
	}
}
