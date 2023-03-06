package oop.overloading;

public class Calculator {
	
	/*
	 #오버로딩(중복): 하나의 클래스 내부에서 같은 이름을 가진 매서드나 생성자를 여러개 중복해서 선언할수 있게 해주는 문법
	 -오버로딩 적용조건(중 1개이상):
	 1. 매개변수의 데이터 타입이 다를것
	 2. 매개변수의 전달순서가 다를것
	 3. 매개변수의 개수가 다를것   
	 */
	
	
	void inputData() {}
	
	void inputData(int a) {} //3번 만족
	void inputData(int a, int b) {}	
//	void inputData(int b, int a) {} 오버로딩불가(호출시에 구분이 되야함!)
	void inputData(String s) {} //1번 만족
	void inputData(int a, double d) {}
	void inputData(double d, int a) {} //2번 만족
//	void inputData(int number) {} //정수 매개값 1개를 받는 매서드가 이미선언되어있음
	
//	int inputData(int number) {//오버로딩불가(반환 유형은 오버로딩에 영향을 미치지 못함)
//		return 0;
//	}
	
	
	int calcRectArea(int a) {
		return a * a;
		//System.out.println("길이가 5인 정사각형의 넓이 =  " + a * a);
	}
	
	int calcRectArea(int horizontal, int vertical) {
		return horizontal * vertical;
	}
	
	double calcRectArea(int upper, int lower, int height) {
		return (upper+lower)/2.0 * height;
	}
	
	
	

}
