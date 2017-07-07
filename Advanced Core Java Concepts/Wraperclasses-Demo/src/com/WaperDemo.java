package com;

public class WaperDemo {

	    /* Wrapper Classes:
		 *  ----------------
		 *	
		 *  use :
		 *  ----
		 *     
		 *        To covert/wrap all primitives as Objects.
		 *        
		 *   why we need?
		 *   
		 *         --> To Get Object-Level methods on primitives.
		 *         --> To group values within Collections.
		 *         --> To have many number/character related fun 
		 *             on primitives.
		 *             
		 *      
		 *             Byte  --> byte
		 *             Short --> short
		 *  		   Integer --> int
		 *  		   Long    --> long
		 *  		   Float  --> float
		 *             Double  --> double
		 *             
		 *             Character --> char  // UNICODE
		 *             Boolean   --> boolean			
		 * 
		 */
	
	public static void main(String[] args) {
		
		int x=100;
		
		float f=x;// Auto Boxing 
		
		
		//long v1=1000;
		//int v2=v1;
		
		int v3=100;
		long v4=v3; // Auto Boxing
		
		
		
		float y=76.45f;
		int ii=(int)y; // type cast
		
		
		
		Integer i=new Integer(1050);
		int v5=i.intValue(); // auto cast
		
		
		System.out.println(v5);
		
		Float v6=65.65f;
		int v7=v6.intValue();
		float v8=i.floatValue();
		
		Long l=new Long(766);
		int v9=l.intValue();
		
		
		
		
		
		
		
		
		
		
		

	}

}
