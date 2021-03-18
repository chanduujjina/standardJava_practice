package com.demo.oops.pojo;

public class EmployeeInfo extends BaseDetails{
	
	

	public EmployeeInfo(int id,String name,double salary,String gender,EmployeeTypeInfo employeeTypeInfo, AddressTypeInfo addressTypeInfo) {
		super(id,name,salary,gender);
		this.employeeTypeInfo = employeeTypeInfo;
		this.addressTypeInfo = addressTypeInfo;
		
	}

	@Override
	public String toString() {
		return "EmployeeInfo [employeeTypeInfo=" + employeeTypeInfo + ", addressTypeInfo=" + addressTypeInfo + "]";
	}

	public EmployeeTypeInfo getEmployeeTypeInfo() {
		return employeeTypeInfo;
	}

	public void setEmployeeTypeInfo(EmployeeTypeInfo employeeTypeInfo) {
		this.employeeTypeInfo = employeeTypeInfo;
	}

	public AddressTypeInfo getAddressTypeInfo() {
		return addressTypeInfo;
	}

	public void setAddressTypeInfo(AddressTypeInfo addressTypeInfo) {
		this.addressTypeInfo = addressTypeInfo;
	}

	
	
	private EmployeeTypeInfo employeeTypeInfo;
	
	private AddressTypeInfo addressTypeInfo;

	

}
