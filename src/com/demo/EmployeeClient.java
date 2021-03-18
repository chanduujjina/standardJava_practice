package com.demo;

public class EmployeeClient {

	public static void main(String[] args) {
		//create an object for the class
		
		Employee emp1 = new Employee(1, "sai", "it", 1000000);
		
		// create another object
		
		Employee emp2 = new Employee(2, "Bharath", "it", 5000000);
		
		Employee emp3= new Employee(2, "Bharath", "it", 5000000);
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		
		
		//just compare data in two objects
		
		boolean positivecase = verifyHshCdEquals(emp2,emp3);
		System.out.println("positivecase::"+positivecase);
		
		boolean negativetivecase = verifyHshCdEquals(emp1,emp2);
		System.out.println("negativetivecase::"+negativetivecase);
		
		
	}
	
	private static boolean verifyHshCdEquals(Employee obj1,Employee obj2) {
		
		if(obj1.hashCode() == obj2.hashCode() && obj1.equals(obj2)) {
			return true;
		}
		return false;
	}

}
