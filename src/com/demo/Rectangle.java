package com.demo;

public class Rectangle {
	
    //instance varible
    private int length;
	
	//0
	private int breadth;
	
	private int result;
	
	//default constructor
	public Rectangle() {
		System.out.println("inside default constructor");
	}
	
	// 2 parametorized constructor
	
	private Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	// 3 paremeter arg constructor
	public Rectangle(int length, int breadth ,int result) {
		//call 2 arg constructor from 3 arg
		this(length,breadth);
		
		
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	//access specifier-public
	
	//return type -int
	
	//methodName - getAreaofRectangle
	
	//parameter list - int height ,int width
	
	//method signature ->MethodName + Parameter List(getAreaofRectangle(int height ,int width))
	//user defined method
	
	
	//area of reactangle
	
	public int getAreaOfRectangel() {
		return length*breadth;
	}
	
	//perimter of rectangle 2(l+b)
	
	public int getPerimeterOfRectangle() {
		return 2*(length+breadth);
	}
	
	public void displayMessage() {
		System.out.println("result::"+result);
	}
	
	
	

}
