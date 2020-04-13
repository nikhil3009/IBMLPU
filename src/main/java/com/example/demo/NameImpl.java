package com.example.demo;
public class NameImpl implements Name{

	private Address objAddress;
	
	public String displayName() {
		return "Nikhil";
	}

	public Address getObjAddress() {
		return objAddress;
	}

	public void setObjAddress(Address objAddress) {
		this.objAddress = objAddress;
	}

	public String displayAddress() {
		return objAddress.displayAddress();
	}

	
}