package com;

public class Address {

	private String addrType;
	private String address;

	public String getAddrType() {
		return addrType;
	}

	public void setAddrType(String addrType) {
		this.addrType = addrType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public void displayAddress() {
		
		System.out.println("AddrType : "+addrType);
		System.out.println("Address: "+address);
		System.out.println("--------------------------------------");
		
	}

}
