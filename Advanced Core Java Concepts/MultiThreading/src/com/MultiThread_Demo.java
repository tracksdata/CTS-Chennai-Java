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

class ThreadWork extends Thread {

	@Override
	public void run() {
		System.out.println("Thread 1 Work Start");
		Task11 task1 = new Task11();
		task1.doTask1();
	}
}

class ThreadWork2 extends Thread {

	@Override
	public void run() {
		System.out.println("Thread 2 Work Start");
		Task22 task2 = new Task22();
		task2.doTask2();
	}
}

class Task11 {

	public void doTask1() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scanner.nextLine();
		System.out.println("Hello  : " + name);

	}

}

class Task22 {

	public void doTask2() {

		for (int i = 0; i < 100; i++) {
			System.out.println("count:  " + i);
		}

	}

}

public class MultiThread_Demo {

	public static void main(String[] args) {

		System.out.println("START");

		ThreadWork tw = new ThreadWork();
		Thread thread1 = new Thread(tw);
		thread1.start();

		ThreadWork2 tw2 = new ThreadWork2();
		Thread thread2 = new Thread(tw2);
		thread2.start();

		System.out.println("Main With Other");

	}

}
