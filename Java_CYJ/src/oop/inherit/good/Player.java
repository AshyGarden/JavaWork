package oop.inherit.good;

/*


#부모클래스, 상위클래스(Parent, super class)
- 데이터를 다른 클래스에게 상속하는 클래스를 부모클래스
- 상속을 사용하면 데이터를 물려받는 클래스에게 부모 클래스의 멤버변수(필드)와 메서드가 상속됩니다. 
  단, 생성자는 상속되지 않는다.
  
 */


public class Player {
	String name;
	int level;
	int atk;
	int hp;
	
	void charaterInfo() {
		System.out.println("*** 캐릭터정보 ***");
		System.out.println("캐릭터 이름: " + name);
		System.out.println("레벨: " + level );
		System.out.println("공격력: " + atk );
		System.out.println("체력: " + hp);
	}

}
