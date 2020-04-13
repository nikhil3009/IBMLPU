package com.example.demo;
import java.util.Formattable;
import java.util.Formatter;

public class AddressImpl  implements Address,Formattable{
	
	private AddressImpl obj;

	public void formatTo(Formatter formatter, int flags, int width, int precision) {
		// TODO Auto-generated method stub
		
	}
	
	public AddressImpl getObj() {
		return obj;
	}

	public void setObj(AddressImpl obj) {
		this.obj = obj;
	}

	public String displayAddress() {
		return "Telangana";
	}

	
	

}