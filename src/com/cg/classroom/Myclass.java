package com.cg.classroom;

public class Myclass implements Comparable  {
	private String name;

	public Myclass(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Myclass [name=" + name + "]";
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}
