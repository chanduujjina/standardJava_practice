package com.demo.mock.service;

import java.util.ArrayList;
import java.util.List;

import com.demo.mock.pojo.Employee;

public class EmployeeService {
	
	// static variable
	private static List<Employee> list = new ArrayList();
	
	//static block
	static {
		list.add(Employee.builder().id(1).name("Sai").salary(10000).gender("male").build());
		list.add(Employee.builder().id(2).name("Manith").salary(10000).gender("male").build());
		list.add(Employee.builder().id(3).name("Krishna").salary(10000).gender("male").build());
		list.add(Employee.builder().id(3).name("Bharath").salary(10000).gender("male").build());
	}
	
	//static method
	public static List<Employee> getEmployeeList(){
		return list;
	}

}
