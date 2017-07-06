package com;

public class Bank {
	/*
	 * public Bank() { System.out.println("-- Bank Object is Creted"); }
	 */

	private String bankName;
	private String loc;
	private String bankType;
	static int count;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("----- Bank object destroyed "+(++count));
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public void display() {
		System.out.println("Name: " + bankName);
		System.out.println("Type: " + bankType);
		System.out.println("Location: " + loc);
	}

}
