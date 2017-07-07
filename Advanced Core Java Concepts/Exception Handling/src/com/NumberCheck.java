package com;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;

public class NumberCheck {
	
	void f1() {
		System.out.println("--- f1 method........");
	}

	public static void main(String[] args) {

		NumberCheck nc=new NumberCheck();
		boolean flag = true;
		while (flag) {

			try {

				InputStreamReader dis = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(dis);
				System.out.println("Enter a No: ");
				int x = Integer.parseInt(br.readLine());
				
				System.out.println("Value of X is " + x);
				
				flag = false;
				
				//nc.f1();

			} catch (Exception e) {
				System.out.println("Invalid Input. try again: ");
			}
		    //nc.f1(); 	//--->  
		} // close of while
		//--->
	}
		// --> will not execute
}
