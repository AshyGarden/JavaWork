package oop.constructor;

public class Phone {
	
	String model;
	String color;
	int price;
	
	/*
	 # 생성자 (Constructor)
	 1. 생성자는 객체를 생성하는 역할을 하며, 그렇기때문에 클래스내부에 반드시 하나이상 존재해야한다.
	 2. 만약 생성자가 하나도 존재하지 않는다면 JVM이 자동으로 매개변수가 하나도 존재하지 않는 
	    가장 기본형태의 생성자(default constructor)를 하나 만들어준다. 
	 3. 생성자는 반드시 클래스 이름과 대/소문자까지 동일하게 작성하여 선언, 리턴타입이 존재하지 않는다.
	 4. 생성자 내부에는 객체가 생성되자마자 해야할 로직들을 기술할 수 있습니다.
	 
	 */
	
	//생성자 선언(선언하지 않는다면 JVM이 기본생성해줌)
	Phone(){ //-> 기본 생성자(매개변수x)
		System.out.println("기본 생성자 호출!");
		model = "폴더폰";
		color = "회색";
		price = 200000;	
	}
	
	/*
	 생성자 오버로딩(중복선언)
	 1. 생성자는 중복선언이 가능하다!
	 2. 단, 생성자의 매개변수의 타입, 갯수, 순서중 하나가 달라야 중복을 인정!
	 */
	Phone(String pModel){ //문자열을 던져주면 이 생성자가 호출
		System.out.println("2번 생성자 호출");
		model = pModel;
		color = "화이트";
		price = 1000000;
	}

	Phone(String pModel, String pColor){ //문자열+색깔을 던져주면 이 생성자가 호출
		System.out.println("3번 생성자 호출");
		model = pModel;
		color = pColor;
		price = 1200000;
	}
	
	void showSpec() {
		System.out.println("***핸드폰의 정보***");
		System.out.println("모델명: " + model);
		System.out.println("색상: " + color);
		System.out.println("가격: " + price + "원");
	}

}
