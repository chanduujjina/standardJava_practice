package com.demo;

public class RectangleClient {

	public static void main(String[] args) {

//create an object of Reactangle

		
		
		// set data to the object
		//Parametorized Constror constructor
		Rectangle rectangle = new Rectangle(10,15,0);
		
		

		// set the data to the object

		//rectangle.setLength(10);
		//rectangle.setBreadth(5);
		
		int area = rectangle.getAreaOfRectangel();
		System.out.println("area of rectangle::"+area);
		
		int perimter = rectangle.getPerimeterOfRectangle();
		System.out.println("perimter::"+perimter);

		

	}
	
	

}
