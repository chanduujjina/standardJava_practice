package com.demo.oops.pojo;

public class BaseDetails {
    public BaseDetails(int id, String name, double salary, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	private int id;
	
	@Override
	public String toString() {
		return "BaseDetails [id=" + id + ", name=" + name + ", salary=" + salary + ", gender=" + gender + "]";
	}

	private String name;
	
	private double salary;
	
	private String gender;
}
