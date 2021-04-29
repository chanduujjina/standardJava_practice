package com.demo;

public class ShallocloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		Sample sample = new Sample();
		sample.setSampleid(1);
		sample.setSampleName("test");

		// shallow clone
		Sample sample2 = sample;
		System.out.println("sample" + sample);
		System.out.println("sample2" + sample2);

		sample2.setSampleName("test1");
		System.out.println("after mutating object by sample2:" + sample);
		System.out.println("after mutating object by sample2:" + sample2);

		// deep clone
		Sample sample3 = (Sample) sample.clone();
		System.out.println(sample3);
		sample3.setSampleName("test3");
		System.out.println("after mutating object by sample3:" + sample);
		System.out.println("after mutating object by sample3:" + sample3);

	}

}
