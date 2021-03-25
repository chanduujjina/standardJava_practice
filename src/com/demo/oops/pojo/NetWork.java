package com.demo.oops.pojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NetWork {
	
	public NetWork(int carrierId, String carrierName, String dataCenter) {
		
		this.carrierId = carrierId;
		this.carrierName = carrierName;
		this.dataCenter = dataCenter;
	}

	private int carrierId;
	
	private final String carrierName;
	
	
	
	private String dataCenter;
	
	public String getPlan() {
		return "Unlimited 500 gb data plan";
	}

	public String getCarrierNameWithCountry(String country) {
		if(country.equals("Japan")) {
			return "there is no specfic provider";
		}
		return carrierName+"-"+country;
		
	}

	public NetWork(int carrierId, String carrierName) {
		super();
		this.carrierId = carrierId;
		this.carrierName = carrierName;
	}

}
