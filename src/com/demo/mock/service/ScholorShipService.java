package com.demo.mock.service;

import java.util.ArrayList;
import java.util.List;

import com.demo.mock.pojo.ScholorShip;
import com.demo.mock.pojo.Student;

public class ScholorShipService {

	
	//static varible  -1
		private static List<ScholorShip> spList = new ArrayList();
		
		//static block -2
		static {
			spList.add(ScholorShip.builder().enrollId(10123).sid("10JK1A0401").amoutt(45000).collegeDetails("test").build());
			spList.add(ScholorShip.builder().enrollId(10123).sid("10JK1A0301").amoutt(45000).collegeDetails("test").build());
			spList.add(ScholorShip.builder().enrollId(10123).sid("10JK1A0301").amoutt(45000).collegeDetails("test").build());
			
		}
		
		//static method -3
		public static List<ScholorShip> getScholorShipList(){
			return spList;
		}
}
