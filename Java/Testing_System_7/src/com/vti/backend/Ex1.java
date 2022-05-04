package com.vti.backend;

import java.util.ArrayList;
import java.util.List;

import com.vti.entity.HinhChuNhat;
import com.vti.entity.HinhTron;
import com.vti.entity.MyMath;
import com.vti.entity.PrimaryStudent;
import com.vti.entity.SecondaryStudent;
import com.vti.entity.Student;
import com.vti.utils.*;

public class Ex1 {
	ArrayList<Student> studentList = new ArrayList<Student>();

	public void q1() {
		Student s1 = new Student(1, "Nguyen Van A", "Dai hoc bach khoa");
		Student s2 = new Student(2, "Nguyen Van B", "Dai hoc bach khoa");
		Student s3 = new Student(3, "Nguyen Van C", "Dai hoc bach khoa");
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		System.out.println("Student info: ");
		for (Student s : studentList) {
			System.out.println(s);
		}
		System.out.println("Chuyen sinh vien sang dai hoc cong nghe");
		Student.setCollege("Dai hoc cong nghe");
		System.out.println("Student info after changed: ");
		for (Student s : studentList) {
			System.out.println(s);
		}
	}

	public void q2() {

		System.out.println("Tong quy la: " + (Student.moneyGroup += 300));
		System.out.println("Sinh vien 1 lay 50k mua bim bim");
		System.out.println("Tong quy sau khi mua bim bim: " + (Student.moneyGroup -= 50));
		System.out.println("Sinh vien 2 lay 20k mua banh my");
		System.out.println("Tong quy sau khi mua banh my: " + (Student.moneyGroup -= 20));
		System.out.println("Sinh vien 3 lay 150k mua do dung hoc tap");
		System.out.println("Tong quy sau khi mua do dung hoc tap: " + (Student.moneyGroup -= 150));
		System.out.println("Ca nhom moi nguoi dong 50k");
		System.out.println("Student info after changed: ");
		System.out.println("Tong quy sau khi moi nguoi dong 50k: " + (Student.moneyGroup += 150));
	}

	public void q3() {
		System.out.println("Enter int num 1:");
		int a = ScannerUtils.inputInt();
		System.out.println("Enter int num 2:");
		int b = ScannerUtils.inputInt();

		System.out.println("Min: " + MyMath.min(a, b));
		System.out.println("Max: " + MyMath.max(a, b));
		System.out.println("Sum: " + MyMath.sum(a, b));

	}

	public void q4() {
		Student s1 = new Student(1, "Nguyen Van A", "Dai hoc bach khoa");
		Student s2 = new Student(2, "Nguyen Van B", "Dai hoc bach khoa");
		Student s3 = new Student(3, "Nguyen Van C", "Dai hoc bach khoa");
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		System.out.println("----Demo get/set q4----");
		Student s = new Student();
		System.out.println("College: " + s.getCollege());
		System.out.println("Change college to dai hoc ha noi");
		s.setCollege("Dai hoc ha noi");
		System.out.println("New college: " + s.getCollege());
	}

	public void q5() {
		System.out.println("Add new students: ");
		for (int i = 0; i < 5; i++) {
			System.out.println("Student " + (i + 1) + ":");
			Student st = new Student();
		}

		System.out.println("Num of created students: " +

				Student.COUNT);
	}

	public void q6() {
		System.out.println("---Add primary students---");
		for (int i = 0; i < 2; i++) {
			System.out.println("Primary Student " + (i + 1) + ":");
			PrimaryStudent prSt = new PrimaryStudent();
		}

		System.out.println("Num of primary students: " +

				PrimaryStudent.prCount);

		System.out.println("---Add secondary students---");
		for (int i = 0; i < 4; i++) {
			System.out.println("Secondary Student " + (i + 1) + ":");
			SecondaryStudent seSt = new SecondaryStudent();
		}

		System.out.println("----Number of students----");
		System.out.println("Total Student: " + Student.COUNT);
		System.out.println("PrimaryStudent: " + PrimaryStudent.prCount);

		System.out.println("SecondaryStudent: " + SecondaryStudent.seCount);

	}

	public void q7() {

		for (int i = 0; i < 6; i++) {
			Student st = new Student();
		}
		System.out.println("Create Primary Student: ");
		PrimaryStudent prSt = new PrimaryStudent();
		System.out.println("Primary Student: " + prSt);
		System.out.println("Secondary Student: ");
		SecondaryStudent seSt = new SecondaryStudent();
		System.out.println("Secondary Student: " + seSt);
	}

	public void q8() throws Exception {

		System.out.println("---Create rectangles---");
		HinhChuNhat[] recs = new HinhChuNhat[4];
		for (int i = 0; i < 4; i++) {

			System.out.println("Rectangle num " + (i + 1) + ":");
			System.out.print("Side a: ");
			Float a = ScannerUtils.inputFloat();
			System.out.print("Side b: ");
			Float b = ScannerUtils.inputFloat();
			HinhChuNhat rec = new HinhChuNhat(a, b);
			recs[i] = rec;
		}
		System.out.println("Circle num 1, enter the radius: ");
		Float r1 = ScannerUtils.inputFloat();
		HinhTron c1 = new HinhTron(r1, r1);
		System.out.println("Circle num 2, enter the radius: ");
		Float r2 = ScannerUtils.inputFloat();
		HinhTron c2 = new HinhTron(r2, r2);
	}
}
