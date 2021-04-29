package com.demo.polymorphism;

public class RuntimePolyMorphismDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		// can hold sub class object with super class refrence
		
		//Parent p = new Child1();
		
		//p.m1();
		
		//p = new Child2();
		
		//p.m1();
		
		Parent p = getInstance("com.demo.polymorphism.Child1");
		p.m1();

	}

	private static Parent getInstance(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//Load the class runtime using reflection Api 
		
				Class c = Class.forName(className);
				 
				//create object for the loadded class
				
				Parent p= (Parent) c.newInstance();
				
				return p;
		
	}

}
