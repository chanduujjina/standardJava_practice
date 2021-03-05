package com.demo;

public class SpecimentClinet {

	public static void main(String[] args) {
		// using new keyword

		Specimen specimen = new Specimen();

		// set data into object

		specimen.setHeight(10);

		specimen.setWeight(20);

		specimen.canRun();

		specimen.canSleep();

		// get the value from object

		System.out.println("height::" + specimen.getHeight());
		System.out.println("height::" + specimen.getWeight());
		
		unrefrenceObject(specimen);
		
		System.out.println(specimen.getHeight());

	}
	
	private static void unrefrenceObject(Specimen specimen) {
		
		specimen=null;
		
	}

}
