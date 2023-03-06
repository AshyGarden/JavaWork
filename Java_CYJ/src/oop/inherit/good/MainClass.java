package oop.inherit.good;

public class MainClass {

	public static void main(String[] args) {
		Warrior w1 = new Warrior();
		w1.level = 1;
		w1.atk = 3;
		w1.hp = 50;
		w1.name = "전사1";
		w1.rage = 60;
		w1.charaterInfo();
		System.out.println();
		
		Mage m1 = new Mage();
		m1.level = 2;
		m1.atk  =1;
		m1.hp = 30;
		m1.name =  "마법사1";
		m1.mana = 50;
		m1.charaterInfo();
		System.out.println();
		
		hunter h1 = new hunter();
		h1.level = 5;
		h1.atk  = 6;
		h1.hp = 40;
		h1.name =  "사냥꾼1";
		h1.pet = "하운드";
		h1.charaterInfo();

	}

}
