package oop.this_super;



public class Warrior extends Player{ //오버로딩
	int rage;

	Warrior(String name){
		
		//모든 생성자에는 super()가 내장되어있음
		//자식 객체가 생성될때 부모의 객체가 생성되어야 부모의 속성과 기능이 실존하고 물려줄수있기 때문.
		super(name); //부모의 생성자 호출
		//this.name = name;
		this.rage = 60;
	}
	
	@Override //annotation(기능있는 주석, 오버라이딩 검사기능)
	void charaterInfo() {
		// TODO Auto-generated method stub
		super.charaterInfo();
		System.out.println("분노: "+rage); //오버라이딩 :재정의
	}

}
