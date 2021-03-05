package com.demo;

public class CalculatorClient {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.setA(1);
		cal.setB(2);
		cal.setB(3);
		
		int val1 =cal.add(1, 2);
		
		int val2 =cal.add(1, 2,3);
		System.out.println("val1::"+val1);
		System.out.println("val2::"+val2);

	}

}
