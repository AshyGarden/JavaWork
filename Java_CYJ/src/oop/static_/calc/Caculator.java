package oop.static_.calc;

public class Caculator {

	/*
	 - 계산기마다 색깔이 다를수 있기때문에 color변수는 데이터를 공유 시키지말고 객체별로 따로관리
	 - 반면,pi같은 원주율은 계산기마다 값이 동일해야하기때무에 static으로 데이터 공유가 유리
	  
	 */
	
	String color;
	static double pi = 3.141592; //값이 불변한다면 static으로
	
	/*
	 - 메서드 내부에서 non-static 데이터를 참조하고 있는 메서드는
	  해당 변수의 정확한 위치(객체의 주소값)을 알려줘야 하기 때문에
	  정적 메서드로 선언하기가 부적합합니다.
	 */
	
	public void paint(String color) {		
		System.out.println("계산기에" + color + "색을 칠합니다.");
		this.color = color;
	}
	
	/*
	 - 메서드 내부에서 인스턴스 변수를 사용하지 않고 범용성 있게 사용하는
	  메서드는 static 키워드를 붙여서 정적 메서드로 선언하는 것이
	  좋습니다.
	 */	
	public static double areaCircle(int r) {
		return r * r * pi;
	}

}
