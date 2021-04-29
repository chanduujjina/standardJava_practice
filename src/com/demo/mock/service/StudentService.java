package com.demo.mock.service;

import java.util.ArrayList;
import java.util.List;

import com.demo.mock.pojo.Student;

public class StudentService {
	
	//static varible  -1
	private static List<Student> studentList = new ArrayList();
	
	//static block -2
	static {
		studentList.add(Student.builder().name("SAI").branch("ECE").gender("male").sem("3-1").sId("10JK1A0401").build());
		studentList.add(Student.builder().name("Manith").branch("EEE").gender("male").sem("3-1").sId("10JK1A0301").build());
		studentList.add(Student.builder().name("Krishna").branch("ECE").gender("male").sem("4-1").sId("10JK1A0402").build());
	}
	
	//static method -3
	public static List<Student> getStudents(){
		return studentList;
	}

}
