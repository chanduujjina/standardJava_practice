package com.demo;

public class Sample implements Cloneable{
	@Override
	public String toString() {
		return "Sample [sampleid=" + sampleid + ", sampleName=" + sampleName + "]";
	}
	private int sampleid;
	private String sampleName;
	public int getSampleid() {
		return sampleid;
	}
	public void setSampleid(int sampleid) {
		this.sampleid = sampleid;
	}
	public String getSampleName() {
		return sampleName;
	}
	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	

}
