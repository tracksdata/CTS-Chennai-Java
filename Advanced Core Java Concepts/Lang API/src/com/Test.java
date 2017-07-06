package com;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("--- in Main");
		/*Bank b=new Bank();
		b.setBankName("SBI");
		b.setBankType("Govt");
		b.setLoc("Chennai");
		
		//b=null;
		
		//b=new Bank();
		
		b.display();*/
		
		
		
		Bank b=new Bank();
		b.setBankName("SBI");
		b.setBankType("Govt");
		b.setLoc("Chennai");
		Bank b1=new Bank();
		
		b=null;
		b1=null;
		
		System.gc();
		
		Runtime rt=Runtime.getRuntime();
		
		System.out.println("--- Total Memory "+rt.totalMemory());
		
		/*for(int i=1;i<=5000000;i++) {
			new Bank();
		}*/
		
		System.out.println("--- Free Memory "+rt.freeMemory());
		System.out.println("Used memory  is "+(rt.totalMemory()-rt.freeMemory()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
