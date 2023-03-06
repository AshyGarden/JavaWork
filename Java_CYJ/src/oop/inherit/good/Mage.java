package oop.inherit.good;

public class Mage extends Player {
	
	int mana;

	@Override
	void charaterInfo() {
		// TODO Auto-generated method stub
		super.charaterInfo();
		System.out.println("마나: "+ mana);
	}
	

}
