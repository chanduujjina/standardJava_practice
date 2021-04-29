package com.demo.mock.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.designPatterns.pojo.Student;

public class Studentdaoimpl {
	
	
	
	public  List<Student> getStudentList(){
		List<Student> studentList = new ArrayList();
		studentList.add(Student.builder().id(1).studentName("chandu").year("2-1").build());
		studentList.add(Student.builder().id(2).studentName("siva").year("3-1").build());
		studentList.add(Student.builder().id(1).studentName("vasu").year("4-1").build());
		return studentList;
	}
	

}
