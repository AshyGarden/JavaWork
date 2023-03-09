package oop.inter.basic;

/*
 1. 인터페이스를 작성한 후에는 클래스를 생성후 인터페이스에 명세된 내용을 구현하면 됨.
 2. 인터페이스의 구현 키워드 Implements 
    상속과 같이 클래스 이름뒤에 구현하고자 하는 인터페이스 이름을 작성
 3. 인터페이스에 선언된 추상매서드는 반드시 구현클래스에서 오버라이딩을 진행해야 합니다.
 */

public class ImplClass1 implements Inter, Inter2{

	@Override
	public void method1() {
		System.out.println("Inter의 추상메서드 구현!");
	}

	@Override
	public void method2() {
		System.out.println("Inter2의 추상메서드 구현!");
		
	}
	
	public void method3() {
		System.out.println("ImplClass1의 메서드 구현!");
	}

	@Override
	public void parentMethod() {
		System.out.println("부모 인터페이스의 메서드 구현!");
		
	}
}
