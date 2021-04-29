package com.demo.mock.controller;

import java.util.List;

import com.demo.mock.pojo.ScholorShip;
import com.demo.mock.pojo.Student;
import com.demo.mock.pojo.StudentInfo;
import com.demo.mock.service.ScholorShipService;
import com.demo.mock.service.StudentService;

public class StudentInfoController {
	
	public Student getStudentById(String sid) {
		
		Student student = getStudentInfo(sid);
	
	    return student;
	
		
		
	}
	
	public StudentInfo getStudentInfoByID(String sid) {
		
		Student student = getStudentInfo(sid);
		ScholorShip scholorShip = getScholorShipInfo(sid);
		
		return StudentInfo.builder().scholorship(scholorShip).student(student).build();
	}
	
	
	private Student getStudentInfo(String sid) {
		List<Student> studentList	= StudentService.getStudents();
		
		for(Student student :studentList) {
			if(student.getSId().equals(sid)) {
				return student;
			}
			
		}
		return null;
	}
	
	private ScholorShip getScholorShipInfo(String sid) {
		 List<ScholorShip> spList = ScholorShipService.getScholorShipList();
		 

			for(ScholorShip scholorShip :spList) {
				if(scholorShip.getSid().equals(sid)) {
					return scholorShip;
				}
				
			}
			return null;
	}

}
