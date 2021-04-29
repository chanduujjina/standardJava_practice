package com.demo.designPatterns;

import com.demo.encapsulation.ATT;
import com.demo.encapsulation.Configuration;
import com.demo.encapsulation.Plan;
import com.demo.encapsulation.Sim;
import com.demo.encapsulation.Verizon;

public class FactoryDPDemo {

	public static void main(String[] args) {
		
		SimFactory simFactory = new SimFactory();
		String carrierName = "VERIZON";
	   Sim sim = simFactory.getSim(carrierName);
	   
	   
	   if(sim != null) {
		if(carrierName.equals("ATT")) {
		 ATT  att =  (ATT)sim;
		 
		    att.setConfiguration(Configuration.builder().carrierName("ATT").carrireId(1).deviceCompatability("4G").build());
			
			att.setPlan(Plan.builder().planId(1).planType("special").planInfo("ATT 650 gb unlimited calls").build());
			
			System.out.println(att.getConfiguration());
			
			System.out.println(att.getPlan());
			
			System.out.println(att.getOTP());
		   }
		
		else if(carrierName.equals("VERIZON")) {
			Verizon  verizon =  (Verizon)sim;
			 
			verizon.setConfiguration(Configuration.builder().carrierName("VERIZON").carrireId(1).deviceCompatability("4G").build());
				
			verizon.setPlan(Plan.builder().planId(1).planType("rehular").planInfo("VERIZON 500 gb unlimited calls").build());
				
				System.out.println(verizon.getConfiguration());
				
				System.out.println(verizon.getPlan());
				
				System.out.println(verizon.getOTP());
		}
	   }
	   
	  
		
		

	}

}
