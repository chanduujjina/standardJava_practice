package com.demo;

public class Rectangle {
	//0 5
	//instance variable
	private int height;
	
	//0 10
	private int width;
	
	//access specifier-public
	
	//return type -int
	
	//methodName - getAreaofRectangle
	
	//parameter list - int height ,int width
	
	//method signature ->MethodName + Parameter List(getAreaofRectangle(int height ,int width))
	//user defined method
	public int getAreaofRectangle() {
		return height*width;
	}
	
	//setter method
	//local varible
	public void setHeight(int height) {
		this.height =height;
	}
	
	public int getHeight() {
		return height;
	}
	
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}
	
   public static void displayAreaofReactangle() {
		System.out.println("inside displayAreaofReactangle::");
	}

	

}
