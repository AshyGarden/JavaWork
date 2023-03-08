package oop.static_.singleton;

public class Singleton {
	/*
	 #싱글톤 디자인 패턴: 클래스의 객체를 단 1개로 제한하기 위한 코드 디자인 패턴 
	 
	 1. 외부에서 이 클래스의 객체를 생성하지 못하게 생성자를 단 1개만 선언
	    private 접근 제한을 붙임.
	 
	 
	 */
	private Singleton() {
		System.out.println("객체 생성!");
	}
	
	//2. 생성자를 호출할수 있는 영역은 같은 클래스 내부뿐이므로 자신의 클래스내부에서 스스로의 객체를 단 1개만 생성
	static Singleton s = new Singleton();
	
	//3. 외부에서 이 클래스의 객체요구할시 2번에서 만들어놓은 단하나의 주소값을 공개된 매서드를 통해 리턴
	public static Singleton getInstance() { //외부세어 객체를 생성할수 없기에 static으로 정적값
		return s;
	}
	
	
	/////////////////////////////////////////////////////////////
	
	public void method1() {
		System.out.println("여러 군데에서 쓰이는 중요한 메서드");
	}
	
	public void method2() {
		System.out.println("꼭 사용해야 하는 귀한 메서드");
	}
	
}
