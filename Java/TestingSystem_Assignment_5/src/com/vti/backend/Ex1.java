package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Ex1.News;

public class Ex1 {
	Scanner sc = new Scanner(System.in);
	ArrayList<News> newsList = new ArrayList<News>();

	public Ex1() {

	}

	public void q1_c() {
		menu();
	}

	private void menu() {
		while (true) {
			System.out.println("======================================================================");

			System.out.println("=================Options==================");

			System.out.println("1. Insert News.");

			System.out.println("2. View List News.");

			System.out.println("3. Average rate.");

			System.out.println("4. Exit.");

			System.out.println("======================================================================");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter news title: ");
				String title = sc.next();
				System.out.println("Enter news publish date: ");
				String publishDate = sc.next();
				System.out.println("Enter news author: ");
				String author = sc.next();
				System.out.println("Enter news content: ");
				String content = sc.next();
//				System.out.println("Enter rate 1: ");
//				int rate1 = sc.nextInt();
//				System.out.println("Enter rate 2: ");
//				int rate2 = sc.nextInt();
//				System.out.println("Enter rate 3: ");
//				int rate3 = sc.nextInt();
				System.out.println("");
				int rates[] = new int[3];
				for (int i = 0; i < rates.length; i++) {
					System.out.println("Enter rate " + (i + 1) + ": ");
					int rate = sc.nextInt();
					rates[1] = Integer.valueOf(rate);
				}
//				int rate[] = { rate1, rate2, rate3 };
				News news1 = new News(title, publishDate, author, content, rates);

				newsList.add(news1);
				break;
			case 2:
				for (News displayNews : newsList) {
					displayNews.display();
				}
				break;
			case 3:
				for (News calNews : newsList) {
					System.out.println("Title: " + calNews.getTitle() + " has average rate is: " + calNews.calculate());
				}
				break;
			case 4:
				return;
			default:
				System.out.println("Invalid. Try again.");
				break;
			}

		}
	}
}
