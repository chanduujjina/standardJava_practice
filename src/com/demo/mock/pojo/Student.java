package com.demo.mock.pojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
	
	private String sId;
	
	private String name;
	
	private String branch;
	
	private String gender;
	
	private String sem;

}
