package com;
class Test {
	   public static void main(String[] args) {
	     try {
	       String s = "5.6";
	       Integer.parseInt(s); // Cause a NumberFormatException

	       int i = 0;
	       int y = 2 / i;
	     }
	    
	     catch (RuntimeException ex) {
	       System.out.println("RuntimeException"); 
	     }
	     catch (Exception ex) {
		       System.out.println("NumberFormatException");
		     }
	   }
	}