package com.demo.oops.client;

import com.demo.oops.pojo.Att;
import com.demo.oops.pojo.NetWork;
import com.demo.oops.pojo.Verizon;

public class NetworkClient {

	public static void main(String[] args) {
		
		NetWork network = NetWork.builder().carrierId(1).carrierName("AT&T").build();
		Att att =  new Att(1, "individual plane", "ATTINP01", "TRD001", network);
		System.out.println(att);
		System.out.println(att.getCarrierName());
		
		
		
		NetWork network1 = NetWork.builder().carrierId(2).carrierName("Verizon").build();
		
		Verizon vz = new Verizon(1, "promo offer", "00vz01", "promoapp1", network1);
		System.out.println(vz);
		///able to access super class varibles
		System.out.println(vz.getCarrierName());
		//can override super class method in subclass for bussiness replacement/features
		String plan = vz.getPlan();
		//able to access super class method by inheritance
		String carrirewithCountry = vz.getCarrierNameWithCountry("US");
		System.out.println(carrirewithCountry);

	}

}
