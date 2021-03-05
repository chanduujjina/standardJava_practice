package com.demo;

public class RectangleClient {

	public static void main(String[] args) {

//create an object of Reactangle

		Rectangle rectangle = new Rectangle();

		// set the data to the object

		rectangle.setHeight(5);
		rectangle.setWidth(10);

		// call area method to find sqaure of rectangle

		int area = rectangle.getAreaofRectangle();
		System.out.println("area of sqaure::" + area);

		// if you want to test with diffrent data

		// create a new object

		Rectangle rectangle1 = new Rectangle();

		rectangle1.setHeight(7);
		rectangle1.setWidth(14);

		int area1 = rectangle1.getAreaofRectangle();
		System.out.println("area of sqaure::" + area1);
		
		//predefined method
		
		int max = Math.max(10, 7);
		System.out.println("max value is ::"+max);
		
		//call a static method
		
		Rectangle.displayAreaofReactangle();

	}
	
	

}
