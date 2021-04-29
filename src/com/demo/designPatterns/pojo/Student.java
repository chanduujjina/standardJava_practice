package com.demo.designPatterns.pojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {

	private int id;
	
	private String studentName;
	
	private String branch;
	
	private String  year;
}
