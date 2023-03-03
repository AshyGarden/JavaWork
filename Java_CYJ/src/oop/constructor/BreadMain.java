package oop.constructor;


public class BreadMain {


	public static void main(String[] args) {
		
		/*
		 -객체를 생성하지 않았을때의 예시를 보고
		 빵객체를 생성할수있는 클래스(설계도)를 작성해보세요
		 클래스이름은 Bread로 통일
		 
		 -BreadMain에서 피자빵 초코케익정보를 호출
		 
		 */
		System.out.println("빵집 오픈!");
		
		Bread pizzaBread = new Bread("피자빵", 1500, "치즈");
		pizzaBread.info();
		
		Bread chocoCake = new Bread("초코케이크", 2500, "초콜렛");
		chocoCake.info();
		
		Bread Chiabatta = new Bread("치아바타", 500, "밀가루");
		Chiabatta.info();

	}

}
