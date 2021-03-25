package com.demo.mock.pojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
	
	private int id;
	
	private String name;
	
	private double salary;
	
	private String gender;
	

}
