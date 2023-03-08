package oop.static_.method;

public class Count {
	
	public int a; //인스턴스변수
	public static int b; //정적변수

	/*
	 - 인스턴스 매서드: 객체를 생성하여 주소값을 통해 접근한 후 호출하는 매서드
	   인스턴스 매서드 안에서는 정적(static)변수와 인스턴스 변수 모두 참조 가능 
	  
	  
	 */
	public int method1() {
		return this.a + Count.b;
	}
	
	public static int method2() { //호출시 Count.method2()로 부르기, 객체생성 필요X
		//return this.a + Count.b; //static에서는 객체 참조값과 무관하기에 호출불가, this쓸수없음
		
		Count ccc = new Count();
		return ccc.a + Count.b; //주소를 만들어주면 호출가능!
	}
}
