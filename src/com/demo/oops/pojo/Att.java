package com.demo.oops.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public final class  Att extends NetWork{
	
	public Att(int attplanId, String attplanName, String attplanCode, String attTradeinCode,NetWork network) {
		super(network.getCarrierId(),network.getCarrierName());
		this.attplanId = attplanId;
		this.attplanName = attplanName;
		this.attplanCode = attplanCode;
		this.attTradeinCode = attTradeinCode;
	}

	private int attplanId;
	
	private String attplanName;
	
	private String attplanCode;
	
	private String attTradeinCode;
	
	@Override
	public String getPlan() {
		return "AT & T Unlimited 700 gb plan with plan offering";
	}

	
}
