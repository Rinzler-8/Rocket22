package com.vti.backend;

import java.io.IOException;

import com.vti.entity.Student;
import com.vti.exceptions.NumberOfStudentsException;
import com.vti.utils.FileManager;

public class Ex2 {
	public static void main(String[] args) {
		try {
			Student st = new Student();
			double groupMoney = st.deposit(100);
			System.out.println(groupMoney);

			FileManager.createFile("");
		} catch (NumberOfStudentsException e) {
			System.out.println("Number of student greater than 12");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
