package com;

import java.util.Scanner;

//------------------------------------

class Account {

	private double balance = 2000;

	public void withdraw(double amount) {
		balance = balance - amount;
	}

	public double getBalance() {
		return this.balance;
	}

}

// -------------------------------------

class BankWork implements Runnable {

	private Account account;

	public BankWork(Account account) {
		this.account = account;
	}

	@Override
	public void run() {

		Thread thread = Thread.currentThread();
		String name = thread.getName();

		System.out.println(name + ": with Bank to withdraw");

		synchronized (account) {

			double curBal = account.getBalance();

			if (curBal > 500) {

				Scanner scanner = new Scanner(System.in);
				System.out.println(name + ":Enter Amount");
				double amount = scanner.nextDouble(); //

				if (amount <= curBal) {
					account.withdraw(amount);
					System.out.println(name + ":Thank You banking With Us.");
					System.out.println(name + ":Your Curent balance:"
							+ account.getBalance());
				} else {
					System.out.println(name + ":No Sufficient Balance");
				}

			} else {
				System.out.println(name + ":U cant Withdraw");
			}

		}

	}

}

// ---------------------------------------

public class ThreadSynch_Demo {

	public static void main(String[] args) {

		// Shared Resource
		Account account = new Account();

		BankWork bw = new BankWork(account);

		Thread thread1 = new Thread(bw, "pavithra");
		Thread thread2 = new Thread(bw, "ranjith");

		thread1.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		thread2.start();

	}

}
