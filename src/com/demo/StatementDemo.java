package com.demo;

public class StatementDemo {

	public static void main(String[] args) {
		//if ,nested if ,ternarry operators,switch blocks,loops
		
		int num1=30;
		
		int num2=20;
		//find the largest number using if else
		if(num1 > num2) {
			System.out.println("largerst Number::"+num1);
		}
		else {
			System.out.println("inside else largerst Number::"+num2);
		}

		//using ternary operator
		
		//varible =expression?val1:val2
		
		int value =num1 > num2 ? num1 : num2;
		System.out.println("largest value using ternary::"+value);
		
		
		int a=5;
		int b=10;
		int c=20;
		int d=40;
		//&& ,||.
		if(a==b && (c==b ||a==b)) {
			//System.out.println("condition satisfied");
		}
		else {
			//System.out.println("condition is not satisfied");
		}
		
		//exp1 && exp2||exp3
		//a ||b 
		//exp1 || exp2 && exp3
		
		// exp1 || exp2 ||exp3
		
		if(a>b) {
			System.out.println("a:"+a);
		}
		else if(b>c) {
			System.out.println("b:"+b);
		}
		else {
			System.out.println("c::"+c);
		}
		
		int response = a>b ? a : b>c ? b :c;
		System.out.println("response::"+response);
	}

}
