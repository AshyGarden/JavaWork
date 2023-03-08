package oop.abs.quiz01;

public class Rect extends Shape {

	int length;
	Rect(String name,int length) {
		super(name);
		this.length = length;
	}

	@Override
	public double getArea() {
		return length * length;
	}

}
