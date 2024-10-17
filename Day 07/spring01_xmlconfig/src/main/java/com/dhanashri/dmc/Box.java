package com.dhanashri.dmc;

public class Box {
	private int length;
	private int breadth;
	private int height;
	
	public Box() {
		System.out.println("parameterless constructor is called");
	}
	public Box(int length,int breadth,int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		System.out.println("parameterized constructor is called \n");
	}
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Box [length=" + length + ", breadth=" + breadth + ", height=" + height + "]";
	}
	
	
	public int calculateVolume() {
		System.out.println("parameterless constructor is called .");
		int vol = this.length*this.breadth*this.height;
		return vol;
	}

}
