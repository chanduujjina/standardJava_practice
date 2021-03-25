package com.demo.designPatterns;

public class SingletonData {
	
	//it will create only once when the class is loaded intially
	private static SingletonData sigletonData = new SingletonData();
	
	//crate a private constructor
	private SingletonData() {
		
	}

	//always give the same object refrence
	public static SingletonData getInstance() {
		return sigletonData;
	}
}
