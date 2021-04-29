package com.demo.designPatterns;

import com.demo.encapsulation.ATT;
import com.demo.encapsulation.Sim;
import com.demo.encapsulation.Verizon;

public class SimFactory {
	
	public Sim getSim(String type) {
		
		if(type.equals("ATT")) {
			return new ATT();
		}
		
		else if(type.equals("VERIZON")) {
			return new Verizon();
		}
		
		return null;
		
	}

}
