package com.demo.oops.client;

import com.demo.oops.pojo.ChildClass;
import com.demo.oops.pojo.ParentClass;

public class ChildClassClient {

	public static void main(String[] args) {
		ChildClass child = new ChildClass();
		System.out.println(child.getName());
		
		System.out.println(child.getNumber());
	}

}
