package oop.poly.player;

public class Hunter extends Player{
	String pet;

	Hunter(String name) {
		super(name);
		this.pet = "애완동물";
	}
	@Override
	void charaterInfo() {
		// TODO Auto-generated method stub
		super.charaterInfo();
		System.out.println("헌터의 친구: " + pet);
	}
	
	
}
