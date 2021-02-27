package com.demo;

public class ForLoopDemo {

	public static void main(String[] args) {

		// print the values from 1 to 5
		// i=i+1;
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		//print even numbers between 1 to 10
		
		
		for (int i = 1; i <= 10; i++) {
			//if the remainder is zero then number is even
			
			if(i%2==0) {
				//System.out.println("even number::"+i);
			}
			else if(i%2==1) {
				//System.out.println("odd number::"+i);
			}
		}
		int j=1;
		while(j<=10) {
			System.out.println(j);
			j++;
		}

	}
	
	

}
