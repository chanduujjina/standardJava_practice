package com.demo;

public class DatatypeDemo {
	
	
   @Override
	public String toString() {
		return "DatatypeDemo [number=" + number + ", value=" + value + "]";
	}

	//0
	int number;
	
	Integer value;

	public static void main(String[] args) {
		
		DatatypeDemo demo = new DatatypeDemo();
		demo.setNumber(1);
		demo.setValue(null);
		System.out.println(demo);

	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

}
