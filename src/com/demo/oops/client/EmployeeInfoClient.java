package com.demo.oops.client;

import com.demo.oops.pojo.AddressTypeInfo;
import com.demo.oops.pojo.EmployeeInfo;
import com.demo.oops.pojo.EmployeeTypeInfo;

public class EmployeeInfoClient {

	public static void main(String[] args) {
		// create an object
		
	
		
		EmployeeTypeInfo employeeTypeInfo =new EmployeeTypeInfo("contractor","ibm");
		//employeeTypeInfo.setEmployeeType("contractor");
		//employeeTypeInfo.setPayRole("ibm");
		
		
		AddressTypeInfo addressTypeInfo = new AddressTypeInfo("present","hyd");
		
		//addressTypeInfo.setAddressType("current");
		
		//addressTypeInfo.setAdress("hyd");
		
	    EmployeeInfo employeeInfo = new EmployeeInfo(1,"Sai",100000,"male",employeeTypeInfo,addressTypeInfo);
	    
	    EmployeeInfo employeeInfo1 = new EmployeeInfo(2,"Bharath",100000,"male",employeeTypeInfo,addressTypeInfo);
	   // employeeInfo.setId(1);
	    //employeeInfo.setName("Sai");
	   // employeeInfo.setSalary(100000l);
	   // employeeInfo.setGender("male");
		
		
		//employeeInfo.setEmployeeTypeInfo(employeeTypeInfo);
		
		//employeeInfo.setAddressTypeInfo(addressTypeInfo);
		
		System.out.println("employeeInfo::"+employeeInfo);
		System.out.println("employeeInfo::"+employeeInfo.getName());
		
		System.out.println("employeeInfo::"+employeeInfo1);
		System.out.println("employeeInfo::"+employeeInfo1.getName());
		
		
		

	}

}
