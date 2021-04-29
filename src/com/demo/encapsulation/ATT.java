package com.demo.encapsulation;

public class ATT extends Sim{
	
   

	private Configuration Configuration;
	
	private Plan plan;
	
	 public ATT(com.demo.encapsulation.Configuration configuration, Plan plan) {
			super();
			Configuration = configuration;
			this.plan = plan;
		}
	
	
	
	public void setConfiguration(Configuration configuration) {
		Configuration = configuration;
	}



	public void setPlan(Plan plan) {
		this.plan = plan;
	}



	@Override
	public Configuration getConfiguration() {
		//return Configuration.builder().carrierName("ATT").carrireId(1).deviceCompatability("4G").build();
		
		return Configuration;
	}

	@Override
	public Plan getPlan() {
		
		//return Plan.builder().planId(1).planType("special").planInfo("ATT 650 gb unlimited calls").build();
		
		return plan;
	}



	public ATT() {
		super();
		// TODO Auto-generated constructor stub
	}
}
