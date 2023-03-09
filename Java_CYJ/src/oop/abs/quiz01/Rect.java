package oop.abs.quiz01;

public class Rect extends Shape {

	private int length;
	Rect(String name,int length) {
		super(name);
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		return length * length;
	}
	
	

	/*
	 //모범답안 
	private int side;
	private int width;
	private int height;
	
	public Rect(String name, int side) {
		super(name);
		this.side = side;
	}
	

	public Rect(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}


	@Override
	public double getArea() {
		if(side != 0) {
			return side * side;
		} else {
			return width * height;
		}
	  
	 */

}
