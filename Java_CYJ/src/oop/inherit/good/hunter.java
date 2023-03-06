package oop.inherit.good;

public class hunter extends Player{
	String pet;

	@Override
	void charaterInfo() {
		// TODO Auto-generated method stub
		super.charaterInfo();
		System.out.println("헌터의 친구: " + pet);
	}
	
	
}
