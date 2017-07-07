package com;

import com.exceptions.UnderAgeException;

public class UserDefined {

	public static void main(String[] args) {
		
		//try {
			
			
			int age=13;
			if(age>=18) {
				System.out.println("---- Welcome");
				Use u=new Use();
				u.fun();
				
			}else {
				try {
					//throw new UnderAgeException();
					throw new UnderAgeException("hey check your age!");
				} catch (UnderAgeException e) {
					System.out.println("Msg: "+e);
				}
			}
			
			
			
			
	//	} catch (Exception e) {
			//System.out.println("--- Under age to continue");
		//}
		
		
	}
}