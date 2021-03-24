package com.demo.oops.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString


public class Verizon extends NetWork{
    public Verizon(int vzplanId, String vzplanName,
			String vzplanCode, String vzpromotionCode,NetWork netwok) {
		super(netwok.getCarrierId(), netwok.getCarrierName());
		this.vzplanId = vzplanId;
		this.vzplanName = vzplanName;
		this.vzplanCode = vzplanCode;
		this.vzpromotionCode = vzpromotionCode;
	}

	private int vzplanId;
	
	private String vzplanName;
	
	private String vzplanCode;
	
	private String vzpromotionCode;
	
	@Override
	public String getPlan() {
		return "Verizon Unlimited 600 gb plan with promo offering";
	}
}
