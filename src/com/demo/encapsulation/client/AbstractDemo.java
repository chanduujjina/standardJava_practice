package com.demo.encapsulation.client;

import com.demo.encapsulation.ATT;
import com.demo.encapsulation.Configuration;
import com.demo.encapsulation.Plan;
import com.demo.encapsulation.Verizon;


public class AbstractDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		
		ATT att = new ATT(Configuration.builder().carrierName("ATT").carrireId(1).deviceCompatability("4G").build(),Plan.builder().planId(1).planType("special").planInfo("ATT 650 gb unlimited calls").build());
		
		System.out.println(att.simSize());
		
		System.out.println(att.getOTP());
		Configuration conf = att.getConfiguration();
		System.out.println(conf);
		
		Plan plan = att.getPlan();
		
		System.out.println(plan);
		
		
		

	}
	
	

}
