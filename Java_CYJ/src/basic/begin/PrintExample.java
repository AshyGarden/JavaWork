package basic.begin;

public class PrintExample {

	public static void main(String[] args) {
		
		
		//자바의 표준출력형식은 크게 3가지입니다.
		//1. 개행을 포함하지않는 print();  개행(줄바꿈)
		//2. 자동으로 개행을 포함해주는 println();

		
		System.out.print("Hello~ "); //출력후 바로뒤로 커서위치
		System.out.println("Java!"); //출력후 한줄 내리고 커서위치
		System.out.print("Sad~ "); 		
		System.out.println("Bye!"); 		
		
		//3. 형식 지정 출력함수 printf();
		//서식문자를 이용해서 문자열을 완성시킨후,
		//서식 문자에 들어갈 값을 지정해서 출력하는 방식
		//자동개행X
		
		/*
		 # 포매팅 서식 문자 종류)(printf만 사용)
		 %d: 부호가 있는 정수데이터(decimal)
		 %f: 실수데이터(floation point) 
		 %s: 문자열(String)
		 * */
		
		// # 탈출코드(escape code) -> print, println, printf 모두동작
		// - 반드시 따옴표 내에 위치 
		// - 문자열 내에서 특정명령을 내리고싶을때 사용하는 특수기호
		// \n: 줄 개행명령
		// \t: 가로 공백 4칸(스페이스 4칸 = tab 1번)
		
		
		int month = 12;
		int day = 25;
		String anni = "크리스마스";
		//12월 25일은 크리스마스입니다.		
		System.out.println(month + "월 " + day + "일은 " + anni + "입니다.");
		System.out.printf("%d월 %d일은 %s입니다.\n" , month, day, anni);	//%d = 정수 , %s = 문자
		
		//실수를 표현하는 서식문자 %f -> 기본 6자리까지 표현
		//%.[자리수를 지정하는 숫자]f ->원하는 자리수까지 표현
		//%라는 문자 자체를 표현 -> %%		
		
		double rate = 64.126;
		System.out.printf("합격률은 %f입니다.\n",rate);
		System.out.printf("합격률은 %.2f입니다.",rate);   //소수점 2자리로 반올림
		System.out.printf("합격률은 %.2f%%입니다.",rate); //%% = 문자로 %가 출력
		
	
	
	
	
	}

}
