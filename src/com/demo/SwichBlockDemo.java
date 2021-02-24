package com.demo;

public class SwichBlockDemo {

	public static void main(String[] args) {
		int result =0;
		int a =10;
		int b=20;
		String type="MOD";
		
		
		switch(type) {
		case "ADD":
		 result = a+b;
		 System.out.println("result::"+result);
		 break;
		 
		case "SUB":
			result = b-a;
			 System.out.println("result::"+result);
			break;
			
		case "MUL":
			result = a*b;
			 System.out.println("result::"+result);
			break;
			
		case "DIV":
			result = b/a;
			 System.out.println("result::"+result);
			break;
			
		case "MOD":
				result = b%a;
				 System.out.println("result::"+result);
				break;
		default :
			break;
		}
		
		String messageType = getMessage(5);
		System.out.println("messageType::"+messageType);
		
		int number =getValFromMessage("phone call");
		System.out.println("number::"+number);

	}
	
	private static String getMessage(int number) {
		switch (number) {
		case 1:
			
			return "text message";
			
		case 2:
			return "phone call";
			
		case 3:
			return "email";
			
		case 4 :
			return "voice message";

		default:
			return "no meaasge";
		}
	}
	
	private static int getValFromMessage(String message){
		switch (message) {
		case "text message":
			
			return 1;
			
		case "phone call":
			return 2;
			
		case "email":
			return 3;
			
		case "voice message" :
			return 4;

		default:
			return 0;
		}
	}

}
