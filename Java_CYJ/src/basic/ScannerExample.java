package basic;
//1. Scanner api 로딩(제공되는 Scanner정보를 현재클래스로 가져오자)
//import java.util.Scanner; 

import java.util.Scanner; //알아서 가져와짐


public class ScannerExample {
	
	public static void main(String[] args) {
		
		//2. 스캐너 객체를 생성.
		Scanner sc = new Scanner(System.in);
		
		/*
		 3. Scanner의 함수들을 이용하여 데이터를 입력받을수 있습니다.
		 - next(): 공백이 없는 문자열을 입력받음 
		 - nextLine(): 공백을 포함한 문자를 입력받습니다.
		 - next+기본타입이름():해당타입에 맞는 데이터를 입력받습니다.
		 
		 ex) 
		 nextInt():정수데이터를 입력받음
		 nextDouble():실수데이터를 입력받음.
		 */ 
		System.out.print("이름을 입력하세요: "); 
//		String name = sc.next(); //next(): 공백이 있으면 공백전까지만 받음
		String name = sc.nextLine();
		System.out.printf("\n반갑습니다 %s님",name); //만약 최 용준->'최'만 출력
		
		System.out.print("\n나이를 입력하세요: ");
		int age = sc.nextInt();
		System.out.printf("\n반갑습니다 %s님! 나이는 %d이시군요.",name ,age);
		//프로그램이 돌아가는지 확인해고 ctrl+f11
		
		//4. Scanner 객체반납
		//객체를 반납 -> Scanner를 메모리에서 해제
		
		sc.close();
		
	}

}
