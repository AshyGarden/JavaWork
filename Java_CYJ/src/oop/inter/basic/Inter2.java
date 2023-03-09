package oop.inter.basic;

//클래스가 상속 가능한 .것처럼 인터페이스도 extend를 사용하여 인터페이스간의 상속구현가능
//인터페이스끼리는 다중상속이 가능하다!
public interface Inter2 extends ParentInter{

	int I = 5; // static final
	
	void method2(); //abstract
	
}
