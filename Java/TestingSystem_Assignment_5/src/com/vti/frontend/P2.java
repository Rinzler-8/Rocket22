package com.vti.frontend;

import com.vti.backend.Ex2;
import com.vti.entity.Ex2.Student;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student();
		//System.out.println("Current ID lan 1: " + Student.currentID);
		student1.auto();
		
		Student student2 = new Student();
		System.out.println("Current ID lan 2: " + Student.currentID);
		System.out.println("Current ID lan: " + Student.currentID);
		
	}

}
