package com.fdmgroup.equalshashcode;

public class Car {

	private int cc;
	private int mpg;
	private String make;
	private StringBuffer model;
	

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public int hashCode() {
		return this.cc + make.hashCode() + model.hashCode();
	}

	public boolean equals(Object obj) {
		if (this.cc == ((Car) obj).getCc()) {
			return true;
		} else {
			return false;
		}
	}

}
