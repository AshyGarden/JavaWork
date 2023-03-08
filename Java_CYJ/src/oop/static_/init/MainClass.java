package oop.static_.init;

public class MainClass {

	public static void main(String[] args) {

		//DBManager manager = new DBManager();
		
		/*
		 - 정적 초기화자를 호출하려면 클래스를 로딩하면 된다.
		 # 클래스 로딩방법 
		 1.클래스 이름을 참조하여 static멤버 호출
		 2. 객체 생성
		 - 정적 초기화자는 클래스 로딩시 최초 1회만 호출됨
		 */
		
		System.out.println("주소: " + DBManager.addr);
		System.out.println("계정명: " + DBManager.uid);
		System.out.println("비밀번호: " + DBManager.uPw);
		
		

	}

}
