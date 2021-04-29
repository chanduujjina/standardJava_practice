package com.demo.encapsulation;

public abstract  class Sim {
	
	
	//concrete method(having method definition and body)
	public String simSize() {
		return "3*4";
	}
	
	//concrete method(having method definition and body)
	public int getOTP() {
		return 12345;
	}
	
	//abstract method
	abstract Configuration getConfiguration();
	
	abstract Plan getPlan();
	

}
