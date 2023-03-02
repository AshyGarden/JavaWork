package oop.basic;

public class Pen {

	//객체의 속성 필드(멤버변수)라고 부릅니다.
	String color;
	int price;
	
	//객체의 기능을 메서드라고 합니다.
	void write() {
		System.out.println(color+ "색 글을 씁니다.");
	}
	
	void priceInfo() {
		System.out.println(color+ "색 펜의 가격은 "+ price+"원 입니다.");
	}
	
	
}
