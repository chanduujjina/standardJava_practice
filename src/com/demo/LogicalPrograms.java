package com.demo;

public class LogicalPrograms {

	public static void main(String[] args) {
		
		//1 2 3,5,7
		int count=0; int n=9;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
		System.out.println("prime number is :: "+n);
		}
		else {
			System.out.println("its not prime number is :: "+n);
		}
		
    // print right angle triangle
		//2 3
		
		for(int row=1;row<=10;row++) {
			//2 3
			for(int column=1;column<=row;column++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//find the factorial of given numbers 
		//5!=5*4*3*2*1=120
		//1 2 6 24
		int fact=1;
		int inputvalue=4;
		for(int i=1;i<=inputvalue;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of a given number is::"+fact);
		int original =646;
		int num=original;
		int reversed=0;
		while(num!=0) {
			//1 4 6
			int digit =num%10;
			//0*10+1=1,1*10+4=14,14*10+6=146
			reversed=reversed*10+digit;
			//64,6,0
			num=num/10;
		}
		System.out.println("revsersed::"+reversed);
		if(original ==reversed) {
			System.out.println("given number is palindrome::");
		}
		else {
			System.out.println("given number is not palindrome::");
		}
	}
	
	

}
