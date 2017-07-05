package com;

public abstract class Shape {
	/*
	 * Notes:
	 * ---------
	 * -> An abstract class contains abstract method specifications
	 * -> An abstract class can have zero or more abstract methods
	 *    and non abstract methods(concrete methods) along with
	 *    constructors
	 * -> If any class exteding an abstract class, then that 
	 *    sub class must override all the abstract methods of
	 *    super class
	 * -> if the sub class is not implementing any one of the 
	 *    abstract methods from super class, then that sub class
	 *    must be defined as 'abstract'
	 * -> We cannot create an object to abstract class, but we can
	 *    create a reference of a abstract class.
	 * -> The refrence of abstract class can be used to store all
	 *    its sub class objects
	 *              
	 */
	
	public abstract void draw();
	//public abstract void calc();
	
	void fun() {
		System.out.println("--- Shap class fun method");
	}

}