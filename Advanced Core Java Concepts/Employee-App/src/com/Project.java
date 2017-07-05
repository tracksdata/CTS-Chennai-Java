package com;

public class Project {

	private String prodId;
	private String projName;
	private String customer;
	private String loc;

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	public void projInfo() {
		System.out.println("proj Id: "+prodId);
		System.out.println("Name: "+projName);
		System.out.println("Customer: "+customer);
		System.out.println("Location: "+loc);
		System.out.println("-----------------------------");
	}
	

}
