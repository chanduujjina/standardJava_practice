package com.demo.polymorphism;

public class CompileTimePloyMorphismDemo {
	
	
	
	//method overloding
	
	public static int add(int a, int b) {
		return  a+b;
		
	}
	
	
	
	public static int add(int a, int b,int c) {
		return a+b+c;
	}
	
	public static double add(double a ,double b) {
		return a+b;
	}
	
	public static double add(int a,double b) {
		return a+b;
	}


	
	public static void main(String[] args) {
		int result = add(1,2);
		
		double result1 = add(1d,2d);
		System.out.println("result:"+result);
		System.out.println("result1:"+result1);
	}

}
