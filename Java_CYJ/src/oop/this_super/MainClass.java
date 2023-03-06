package oop.this_super;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player p1 = new Player();
		
		p1.name = "전사1";
		System.out.println("p1의 주소값: "+p1);
		p1.charaterInfo();
		
		System.out.println("-------------------------------");
		Player p2 = new Player("전사2");
		System.out.println("p2의 주소값: "+p2);
		p2.charaterInfo();
		
		System.out.println("-------------------------------");
		Player p3 = new Player("전사3",200);
		p3.charaterInfo();
		
		System.out.println("-------------------------------");
		p3.Attack(p2);
		p1.Attack(p2);
		p2.Attack(p2);
		
		System.out.println("-------------------------------");
		Warrior w1 = new Warrior("리뉴얼전사");	
		w1.charaterInfo();
		Mage m1  = new Mage("법사1");
		m1.charaterInfo();
		hunter h1 = new hunter("사냥꾼");
		h1.charaterInfo();
	}

}
