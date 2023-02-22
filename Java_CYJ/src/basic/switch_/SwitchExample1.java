package basic.switch_;

import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 입력하세요. (M/F): ");
		System.out.print(">");
		String gender = sc.next();
		
		/*
		 - switch키워드 뒤에 나오는 괄호는 
		 boolean형 조건식이 아닌 변수나, 변수의 연산식
		 타입은 정수, 문자열만 가능! (기준은 명확한 값이 필요)
		 
		 switch 조건에 부합하는 case가 1개라도있다면 만족한 코드부터 모두실행됨(코드흘러내림현상)
		 
		 */
		switch(gender) {
		
		/*
		 switch 괄호안에 지정하신 기준값에 따라 만족하는 case문을 순서대로 탐색
		 적합한 case가 존재하는 경우에는 해당case에 종속된 문장 실행
		 따로 조치가 없다면 나머지 case가 연속으로 실행
		 */
		
		
		case "m": case"ㅡ": case "M": //조건만족시 코드흘러내리게해서 마지막만 실행하게하기
			System.out.println("남자입니다.");
			break; //해당 케이스만 실행후 switch문을 종료
			
		case "f": case "ㄹ": case "F":
			System.out.println("여자입니다.");	
			break;
		
		default: //case를 설정하지 않은 값들은 모두 default 취급
			     //항상 맨마지막에 default작성 = break 필요X
			System.out.println("잘못된 입력입니다");	
			
		}
		
		sc.close();

	}

}
