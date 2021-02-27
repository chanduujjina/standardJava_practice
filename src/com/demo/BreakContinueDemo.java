package com.demo;

public class BreakContinueDemo {

	public static void main(String[] args) {
		
		//1 2 3 4 5 6 7 8 9 10
		
		for (int i = 1; i <=10;  i++) {
			if(i==5 || i==6 ) {
				continue;
			}
			System.out.println(i);
			
		}

	}

}
