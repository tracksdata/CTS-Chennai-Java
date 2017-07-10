package com;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class BufferedDemo {
	
	public static void main(String[] args) {
		
		
		try {
			//File  f=new File("d:/aa/test.txt");
			
			
			InputStreamReader isr=new InputStreamReader(new FileInputStream("d:/aa/test.txt"));
			BufferedReader br=new BufferedReader(isr);
			
			/*System.out.println("Enter a no: ");
			int x=Integer.parseInt(br.readLine());
			
			System.out.println("Enter another no: ");
			int y=Integer.parseInt(br.readLine());

			System.out.println("Enter a String: ");
			String s1=br.readLine();
			
			System.out.println("Enter a Char: ");
			char ch=(char)br.read();
			System.out.println("Character is: "+ch);
			System.out.println("String is "+s1);*/
			
			int x=Integer.parseInt(br.readLine());
			int y=Integer.parseInt(br.readLine());
			String info=br.readLine();
			
			System.out.println("Sum is "+(x+y));
			System.out.println("Info: "+info);
			
			
			
					
			
		} catch (Exception e) {
			System.out.println("Failed due to "+e);
		}
		
		
		
	}

}
