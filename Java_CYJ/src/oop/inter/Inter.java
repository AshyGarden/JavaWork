package oop.inter;


//인터페이스: 객체의 규격을 표준화해서 명세하는 역할-
public interface Inter {

	//인터페이스에서 변수를 선언하면 상수(static final)로 지정
	int n=5;
	
//	Inter(){
//		인터페이스는 생성자를 가질수없다(객체화가 불가능한 개념)
//	}
	
	//인터페이스에서 매서드를 선언하면 추상메서드로 지정
	void method1();
}
