package oop.abs.quiz01;

public abstract class Shape {
	
	private String name;
	
	Shape(String name){
		this.name = name;
	}
	
	public abstract double getArea();
//	public abstract String getName();
	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

}
