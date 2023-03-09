package oop.abs.quiz01;

public class Circle extends Shape {

	private int radius;
//	static double pi =  3.141592;
	Circle(String name,int radius) {
		super(name);
		this.radius = radius;
	}


	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return radius * radius * Math.PI; //math pi로 구현
	}
}
