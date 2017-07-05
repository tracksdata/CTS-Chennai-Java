package com;

public class BankDaoImpl implements Customer, BankEmployee, Manager, Clerk {

	@Override
	public void withDraw() {
		System.out.println("--- windrawing...");
	}

	@Override
	public void deposit() {
		System.out.println("---- Depositing");
	}

	public void openAccount() {
		System.out.println("-- Account opened");
	}

	@Override
	public void closeAccount() {
		System.out.println("-- Account closed");
	}

	@Override
	public void openLocker() {
		System.out.println("-- Locker is opened");
	}
	
	@Override
	public void clerkOps() {
		System.out.println("-- Clerk Operations assigned");
	}

}
