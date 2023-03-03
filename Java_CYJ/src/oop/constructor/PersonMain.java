package oop.constructor;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		/*
		 - Scanner이용 이름 나이 키 입력받아서 해당정보를 저장하는 객체를 디자인 
		 - 객체내에는 해당사람의 정보를 모두 출력해주는 info메서드 존쟤	 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요: ");
		String inputName = sc.next();
		
		System.out.print("나이를 입력해주세요: ");
		int inputAge = sc.nextInt();
		
		System.out.print("키를 입력해주세요: ");
		int inputHeight = sc.nextInt();
		
		Person p = new Person(inputName, inputAge, inputHeight);
		System.out.println("입력하신 정보대로 저장한 결과는 다음과 같습니다.");
		p.info();
		sc.close();
		
	}

}
