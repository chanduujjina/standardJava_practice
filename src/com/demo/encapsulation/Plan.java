package com.demo.encapsulation;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Plan {
	
	private int planId;
	
	private String planType;
	
	private String planInfo;

}
