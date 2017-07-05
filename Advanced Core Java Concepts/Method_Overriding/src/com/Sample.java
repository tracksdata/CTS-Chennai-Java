package com;

class C1 {
	/*
	 * Notes
	 *  -------
	 * 1. if super class method is public , and sub class overridden
	 *    method must be defined as public only.
	 * 2. if super class method is default, then sub class
	 *    overridden method can be default, public and protected
	 * 3. If super class method is protected, then its sub class
	 *    overridden method can be protected  and public 
	 * 4. if super class method is private in super class, then 
	 *    that method is not visible to the sub classes
	 * 
	 */
	  void fun() {

	}

}

class C2 extends C1 {

	@Override
	void fun() {

	}

}

 public class Sample extends C1{
	
	@Override
	protected void fun() {
		
	}
	
	void f1() {// default scope not avaible to any classes other than com

	}

	public void f2() {

	}

	public static void main(String[] args) {

	}

}
