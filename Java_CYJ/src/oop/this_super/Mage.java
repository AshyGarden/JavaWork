package oop.this_super;

public class Mage extends Player {
	
	int mana;

	Mage(String name){
		super(name);
		this.mana =100;
	}
	@Override
	void charaterInfo() {
		// TODO Auto-generated method stub
		super.charaterInfo();
		System.out.println("마나: "+ mana);
	}
	

}
