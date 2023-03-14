package etc.generic.basic;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 # 제네릭
		 - 클래스 내부에서 타입을 지정하는것이 아니라 외부에서 객체를 생성시 타입이 지정될수 있게하는 문법 
		 - 제네릭 사용시 객체 생성시 사용할 타입을 지정할수 있고 따로 타입을 변환할 필요가 없다.
		   관리가 용이, 잘못된 타입이 들어오는 것을 방지->유지보수성, 코드의 재사용성이 높아짐 	  
		 */
		
		Box<String> box = new Box(); //자바7 이후로 생성자 타입은 생략 가능
		box.setT("홍길동");
		String name = box.getT(); //형변환이 따로 필요없다.
		
//		Box<int> intBox = new Box(); //제네릭에는 기본데이터 타입 지정 x
		Box<Integer> intBox = new Box<>(); 
		intBox.setT(43);
		int num = intBox.getT();
		
		Box<Person> pBox = new Box<>();
		pBox.setT(new Person());
		Person p = pBox.getT();

	}

}
