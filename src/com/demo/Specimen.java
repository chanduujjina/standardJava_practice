package com.demo;

public class Specimen {
	
	public Specimen() {
		System.out.println("inside Specimen::");
	}
	
	private int height;
	
	private int weight;
	
	
	//getter method
	public int getHeight() {
		return height;
	}
   //setter method
	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	
	
	public void canRun() {
		System.out.println("speciment can run");
	}
	
	public void canSleep() {
		System.out.println("speciment can sleep");
	}
	
	//setter method

}
