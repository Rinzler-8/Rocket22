package com.vti.frontend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.vti.entity.Student8;

public class p1 {
	public static void main(String[] args) {
		List<Student8> students = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			int index = random.nextInt(100);
			Student8 student = new Student8(i, index + "name", LocalDate.now(), 10 - i);
			students.add(student);
		}
		Student8 student1 = new Student8(1, "1name", LocalDate.of(2022, 4, 22), 1);
		Student8 student2 = new Student8(2, "1name", LocalDate.of(2022, 4, 23), 1);
		Student8 student3 = new Student8(3, "1name", LocalDate.of(2022, 4, 21), 1);
		Student8 student4 = new Student8(4, "1name", LocalDate.of(2022, 4, 22), 3);
		Student8 student5 = new Student8(5, "1name", LocalDate.of(2022, 4, 22), 0);
		Student8 student6 = new Student8(6, "1name", LocalDate.of(2022, 4, 22), 1);
		students.add(student6);
		students.add(student2);
		students.add(student1);
		students.add(student5);
		students.add(student4);

		// 1
//		for (int i = 0; i < students.size() - 1; i++) {
//			for (int j = i + 1; j < students.size(); j++) {
//				if (students.get(i).compareTo(students.get(j)) > 1) {
//					Student8 student = students.get(i);
//					students.set(i, students.get(j));
//					students.set(j, student);
//				}
//			}
//		}

		// 2 name -> birthday -> point

		Collections.sort(students, Comparator.comparing(Student8::getName).thenComparing(
				Comparator.comparing(Student8::getBirthday).thenComparing(Comparator.comparing(Student8::getPoint))));
		Comparator<Student8> compName = new Comparator<Student8>() {
			public int compare(Student8 o1, Student8 o2) {
				if (o1.getBirthday().isAfter(o2.getBirthday())) {
					return 1;
				} else if (o1.getBirthday().isBefore(o2.getBirthday())) {
					return -1;
				}
				return 0;
			}
		};

		Comparator<Student8> compBirthday = new Comparator<Student8>() {
			public int compare(Student8 o1, Student8 o2) {
				if (o1.getName().compareTo(o2.getName()) > 0) {
					return 1;
				} else if (o1.getName().compareTo(o2.getName()) < 0) {
					return -1;
				}
				return 0;
			}
		};

		Comparator<Student8> compPoint = new Comparator<Student8>() {
			public int compare(Student8 o1, Student8 o2) {
				if (o1.getPoint() > (o2.getPoint())) {
					return 1;
				} else if (o1.getPoint() < (o2.getPoint())) {
					return -1;
				}
				return 0;
			}
		};
		for (Student8 student : students) {
			System.out.println(student.getName());
		}

		students.sort(compName.thenComparing(compBirthday.thenComparing(compPoint)));
	}

}
