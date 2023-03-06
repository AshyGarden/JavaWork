package oop.this_super;

public class Player {
	String name;
	int level;
	int atk;
	int hp;
	
	/*
	 # this 
	  
	  this란 자기자신 객체를 가리키는 키워드
	 - 생성자 또는 매서드 내에서 this 사용시 this는 그 생성자 또는 매서드를 호출한 객체의 주소값을 띄게된다.
	 - this()를 사용해서 같은 클래스 내의 다른생성자를 호출할수 있음
	   이때 매개변수의 선언에따라 괄호내의 적절한 값을 전달하면 된다. 
	 */
	
	
	
	//객체마다 숨겨진필드(this)를 가지고있음
	Player(){
		System.out.println("Player의 기본생성자 호출!");
//		System.out.println("this의 주소값: "+this);
	this.level = 1;
	this.atk = 3;
	this.hp = 50;
	}
	
	Player(String name){
		this();//같은 클래스에 다른생성자 호출
		System.out.println("Player의 2번 생성자 호출!");
//		System.out.println("this의 주소값: "+this);
//		level = 1;
//		atk = 3;
//		hp = 50;
//		name = name; //효과X
		this.name = name; //자기자신주소값 = 생성자를 호출한 그 객체!
	}
	
	
	Player(String name, int hp){
		//다른 생성자 호출은 무조건 최상단에 위치해야함
		this(name); //다른 생성자가 받을수있다면 그 값을 넘기기(2번생성자+hp) 
		System.out.println("Player의 3번생성자 호출");
		//this.name = name;
		this.hp = hp;
	}
	
	void Attack(Player target) {
//		System.out.println("target: "+ target);
//		System.out.println(this);
		
		if(this == target){
			System.out.println("스스로는 때릴수 없습니다");
			return;
		}
		
		//x가 y를 공격합니다.	      //때리는 그놈의 주소값+이름 //맞는 놈의 주소값+이름
		System.out.printf("%s가 %s를 공격합니다. ",this.name,target.name);
	
		//상대방의 체력10다운, 자신은 체력 5회복
		target.hp -=10;
		this.hp +=5;
		System.out.printf(" 나의체력 %d, 상대방의 체력 %d\n",this.hp,target.hp);		
	}
	
	void charaterInfo() {
		System.out.println("*** 캐릭터정보 ***");
		System.out.println("캐릭터 이름: " + name);
		System.out.println("레벨: " + level );
		System.out.println("공격력: " + atk );
		System.out.println("체력: " + hp);
//		System.out.println("지금 이 매서드를 호출한 객체의 이름: "+this.name);
	}

}
