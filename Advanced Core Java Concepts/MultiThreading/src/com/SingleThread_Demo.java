package com;

import java.util.Scanner;

/*
 *  proj:
 *  -----
 *  
 *  Task 1: Get Name from User and print it
 *  Task 2: Print Number from 1-100
 * 
 */

class Task1 {

	public void doTask1() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scanner.nextLine();
		System.out.println("Hello  : " + name);

	}

}

class Task2 {

	public void doTask2() {

		for (int i = 0; i < 100; i++) {
			System.out.println("count:  " + i);
		}

	}

}

public class SingleThread_Demo {

	public static void main(String[] args) {

		System.out.println("START");

		Task1 task1 = new Task1();
		task1.doTask1();

		System.out.println("------------");

		Task2 task2 = new Task2();
		task2.doTask2();

		System.out.println("End");

	}

}
