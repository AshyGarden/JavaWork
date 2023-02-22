package basic.begin;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {

		/* 
		 - 스캐너를 사용하여 이름과 나이를 입력받아서
		 이름: XXX
		 나이: xx세
		 출생년도: xxx년 
		 을 출력 (출생년도를 입력받지 않는다)
		 */
		
		//개인답안
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요: ");
		String name = sc.nextLine();
		System.out.printf("반갑습니다. %s님\n",name);
		System.out.print("현재 나이가 어떻게 되시나요?: ");
		int age = sc.nextInt();
		System.out.printf("현재 %s님의 나이는 %d세(이)며 출생년도는 %d년 이시군요",name,age, 2023 - age + 1);
		sc.close();
		
		//모범답안
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요: ");
		String name = sc.next(); 
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		int birth = 2023 - age;
		
		//println
		System.out.println("이름: " + name); 
		System.out.println("나이: " + age +"세");
		System.out.println("출생년도: " + (2023 - age) + "년");
		sc.close();
		
		//printf
		System.out.printf("이름: %s\n나이: %d세\n출생년도: %d년\n"
		, name, age, 2023 -age);
		 
		*/
		
		
		
		
	}

}
