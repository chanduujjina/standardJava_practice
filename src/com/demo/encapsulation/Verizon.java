package com.demo.encapsulation;

public class Verizon extends Sim {
	
	public void setConfiguration(Configuration configuration) {
		Configuration = configuration;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public Verizon() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Configuration Configuration;
	
	private Plan plan;
	
	
	public Verizon(com.demo.encapsulation.Configuration configuration, Plan plan) {
		super();
		Configuration = configuration;
		this.plan = plan;
	}

	@Override
	public Configuration getConfiguration() {
		//return Configuration.builder().carrierName("Verizon").carrireId(2).deviceCompatability("4G").build();
		
		return Configuration;
	}
	
	@Override
	public Plan getPlan() {
		
		//return Plan.builder().planId(1).planType("reugular").planInfo("Verizon 500 gb unlimited calls").build();
		
		return plan;
	}
}
