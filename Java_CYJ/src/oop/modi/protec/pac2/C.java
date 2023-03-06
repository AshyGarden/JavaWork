package oop.modi.protec.pac2;

import oop.modi.protec.pac1.A;

public class C extends A {
//	A a1 = new A(30);    //protected
//	A a2 = new A(5.67);  //default
	public C() {
		/*
		 -protected 제한자는 패키지가 다른경우 두 클래스사이에 상속관계가 있다면 
		  super키워드를 통해 참조를 허용
		  
		  상속을 강제시킴
		 */
		super(30);   //protected라서 상속 가능
//		super(5.67); //default라서 안됨
		super.x = 1;
//		super.y = 2;
		super.method1();
//		super.method2();
	}

}
