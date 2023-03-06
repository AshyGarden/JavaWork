package basic;

//작성중인 패키지와 다른곳에 위치한 클래스를 사용하련 import선언이 필요
//import oop.fruit.Apple;
//import oop.fruit.Banana;
//import oop.fruit.Melon;
import oop.fruit.*; //fruit패키지의 모든 클래스를 import(보통 10개이상 가져올때 많이씀)

public class Test {

	public static void main(String[] args) {
		
		//다른 패키지 내의 같은 이름을 가진 클래스 객체를 생성할때는 반드시 패키지 경로를 직접 표시해 주어야 한다!
		//또한 패키지는 색이 있는 문자(new등), 대문자, camel case잘안씀(보통 1단어)
		Apple a = new Apple();
		oop.juice.Apple a2 = new oop.juice.Apple(); //어디출신인지 알려줌
		Banana b = new Banana();
		Melon m = new Melon();
		
		

	}

}
