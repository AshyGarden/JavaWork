package oop.inherit.good;

/*
 #자식 클래스, 하위클래스(Child,subclass)
 - 부모클래스로부터 멤버변수(필드)와 메서드를 물려받는 클래스를 자식클래스
 - 상속을 적용시키려면 자식클래스선언부의 클래스이름뒤에 extends 적은 후
  물려받을 부모클래스의 이름을 적으면된다.
 */


public class Warrior extends Player{ //오버로딩
	int rage;
	/*
    	#매서드 오버라이딩(재정의)
	  - 부모가 물려주는 매서드는 모든자식들에세 다 맞게 설계되기 힘들기 때문에부족한점,맞지않는 경우
	    자식클래스에서 내용을 추가,수정할수있음  - 이것이 오버라이딩
	    
	  -만약 자식클래스에서 부모가 물려준 매서드를 새롭게 재정의한다면 자식이 수정한 매서드가 우선호출
	  - 오버라디이 규칙(3가지 모두 일치해야 오버라이딩 인정)
	  1. 부모가 물려주는 매서드와 이름이 똑같을 것!    (characterInfo)
	  2. 부모가 물려주는 매서드와 리턴타입도 똑같을 것! (void)
	  3. 부모가 물려주는 매서드와 매개변수의 선언방식이 똑같을 것! ()
	 */

	
//	void charaterInfo() {
//		super.charaterInfo();
//		System.out.println("분노: "+rage); //오버라이딩 :재정의
//	}
	
	//#Object(최상위클래스(모든클래스의 상위클래스)) 
	
	//오버라이딩 자동완성 alt+shift+s
	//창에서 override/implement Methods이후 원하는 함수 선택해서 사용
	@Override //annotation(기능있는 주석, 오버라이딩 검사기능)
	void charaterInfo() {
		// TODO Auto-generated method stub
		super.charaterInfo();
		System.out.println("분노: "+rage); //오버라이딩 :재정의
	}

}
