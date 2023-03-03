package oop.inherit.good;

/*
 #자식 클래스, 하위클래스(Child,subclass)
 - 부모클래스로부터 멤버변수(필드)와 메서드를 물려받는 클래스를 자식클래스
 - 상속을 적용시키려면 자식클래스선언부의 클래스이름뒤에 extends 적은 후
  물려받을 부모클래스의 이름을 적으면된다.
 */


public class Warrior extends Player{
	int rage;
	void charaterInfo() {
		super.charaterInfo();
		System.out.println("분노: "+rage);
	}
	

}
