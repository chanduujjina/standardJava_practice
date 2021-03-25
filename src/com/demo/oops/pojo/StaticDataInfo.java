package com.demo.oops.pojo;

public class StaticDataInfo {
	
	// static varible
	private static int number = 10;
	
	// static block
	static {
		System.out.println("inside static block "+number);
	}
	
	// static method
	public static int getNumber() {
		return number;
	}

}
