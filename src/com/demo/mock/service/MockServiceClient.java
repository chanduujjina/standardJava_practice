package com.demo.mock.service;

import java.util.List;

import com.demo.mock.pojo.Employee;

public class MockServiceClient {

	public static void main(String[] args) {
		
		// get data from mock service
		List<Employee> employeeList= EmployeeService.getEmployeeList();
		System.out.println(employeeList);
	}

}
