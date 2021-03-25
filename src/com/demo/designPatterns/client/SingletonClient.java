package com.demo.designPatterns.client;

import com.demo.designPatterns.SingletonData;

public class SingletonClient {

	public static void main(String[] args) {
		SingletonData data1 = SingletonData.getInstance();
		
		SingletonData data2 = SingletonData.getInstance();
		
		System.out.println("data1 hashcode::"+data1.hashCode());
		System.out.println("data2 hashcode::"+data2.hashCode());

	}

}
