package com;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class InputReadDemo {
	
	
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two nos: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter a String: ");
		String s1=sc.nextLine();
		System.out.println(s1);
		
	
		
		System.out.println("Sum is "+(x+y));
		
		
		
	
		
		
	}
	

}
