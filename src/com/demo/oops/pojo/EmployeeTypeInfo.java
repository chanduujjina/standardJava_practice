package com.demo.oops.pojo;

public class EmployeeTypeInfo {
	
	public EmployeeTypeInfo(String employeeType, String payRole) {
		super();
		this.employeeType = employeeType;
		this.payRole = payRole;
	}

	private String employeeType;
	
	private String payRole;

	@Override
	public String toString() {
		return "EmployeeTypeInfo [employeeType=" + employeeType + ", payRole=" + payRole + "]";
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getPayRole() {
		return payRole;
	}

	public void setPayRole(String payRole) {
		this.payRole = payRole;
	}

}
