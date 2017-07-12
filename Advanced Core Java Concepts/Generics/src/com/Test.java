package com;

import java.util.concurrent.ThreadPoolExecutor;

class Vehicle {

	public void disp() {
		System.out.println("Vehicle disp");
	}
}

class TwoWheeler<T extends Vehicle> extends Vehicle {
	public void disp() {
		System.out.println("TwoWheeler disp");
	}
}

class ThrWheeler<T extends Vehicle> extends Vehicle {
	/*public void disp() {
		System.out.println("ThreeWheeler disp");
	}*/
	
	void test() {
		
	}
}

class Fruit extends TwoWheeler{

}

public class Test {

	public static void main(String[] args) {

	/*	TwoWheeler<Vehicle> tw = new TwoWheeler<>();
		tw.disp();
		ThrWheeler<Vehicle> tt = new ThrWheeler<>();
		tt.disp();
		tt.test();*/
		
		Vehicle v=new TwoWheeler<>();
		v.disp();
		v=new ThrWheeler<>();
		v.disp();
	
		TwoWheeler<Vehicle> ttt=new Fruit();
		
		
		System.out.println("Working");
	}

}
