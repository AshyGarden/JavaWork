package oop.poly.player;



public class Warrior extends Player{ //오버로딩
	int rage;

	Warrior(String name){
		
		//모든 생성자에는 super()가 내장되어있음
		//자식 객체가 생성될때 부모의 객체가 생성되어야 부모의 속성과 기능이 실존하고 물려줄수있기 때문.
		super(name); //부모의 생성자 호출
		//this.name = name;
		this.rage = 60;
	}
	
	public void rush(Player p) {
		
		/*
		 -전사의 고유기능인 rush매서드작성 
		 -rush의 대상은 모든직업
		 -rush의 대상이 전사라면 10의피해, 마법사라면 20, 사냥꾼이라면 15의 피해를 받음
		 
		 -서로다른 데미지를 insanceof를 사용하여 구분하여적용
		 -남은체력적용
		 
		 */
		System.out.printf("%s가 %s를 공격합니다. \n",this.name,p.name);
		int damage = 0;
		if(p instanceof Warrior) {
			damage = 10;	
		} else if(p instanceof Hunter) {
			damage = 15;
		} else if(p instanceof Mage) {
			damage = 20;
		}		
		System.out.printf("공격받은 %s의 체력이 %d 감소해 현재 남은체력은 %d입니다.\n",p.name,damage,p.hp-damage);
		/*
		//모범답안
		  System.out.printf("%s님이 %s님에게 돌진을 시전했습니다!\n"
				, this.name, p.name);
		
		if(p instanceof Warrior) {
			p.hp -= 10;
			System.out.printf("%s(전사)님이 10의 피해를 입었습니다.\n"
					, p.name);
		} else if(p instanceof Mage) {
			p.hp -= 20;
			System.out.printf("%s(마법사)님이 20의 피해를 입었습니다.\n"
					, p.name);
		} else if(p instanceof Hunter) {
			p.hp -= 15;
			System.out.printf("%s(사냥꾼)님이 15의 피해를 입었습니다.\n"
					, p.name);
		}
		
		System.out.printf("%s님의 남은 체력: %d\n", p.name, p.hp);
		System.out.println("--------------------------------");  
		 */
		
		
		
		
		
		
	}
	
	@Override //annotation(기능있는 주석, 오버라이딩 검사기능)
	void charaterInfo() {
		// TODO Auto-generated method stub
		super.charaterInfo();
		System.out.println("분노: "+rage); //오버라이딩 :재정의
	}

}
