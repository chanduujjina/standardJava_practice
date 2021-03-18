package com.demo.oops.pojo;

public class AddressTypeInfo {
	
	public AddressTypeInfo(String addressType, String adress) {
		super();
		this.addressType = addressType;
		this.adress = adress;
	}

	private String addressType;
	
	private String adress;

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "AddressTypeInfo [addressType=" + addressType + ", adress=" + adress + "]";
	}

}
