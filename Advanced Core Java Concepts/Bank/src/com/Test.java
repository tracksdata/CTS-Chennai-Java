package com;

public class Test {

	public static void main(String[] args) {
		
		Customer cust=new BankDaoImpl();
		//cust.deposit();
		//cust.withDraw();
		
		
		BankEmployee emp=new BankDaoImpl();
		//emp.openAccount();
		//emp.closeAccount();
		
		Manager mgr=new BankDaoImpl();
		//mgr.openLocker();
		
		Clerk c=new BankDaoImpl();
		c.clerkOps();

	}

}
