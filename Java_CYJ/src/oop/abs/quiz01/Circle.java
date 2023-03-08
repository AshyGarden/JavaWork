package oop.abs.quiz01;

public class Circle extends Shape {

	int radius;
	static double pi =  3.141592;
	Circle(String name,int radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * pi;
	}
}
