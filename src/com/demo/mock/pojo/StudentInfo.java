package com.demo.mock.pojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentInfo {
	
	private Student student;
	
	private ScholorShip scholorship;

}
