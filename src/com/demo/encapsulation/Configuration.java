package com.demo.encapsulation;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Configuration {
	
	private int carrireId;
	
	private String carrierName;
	
	private String deviceCompatability;

}
