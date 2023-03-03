package oop.string;

import java.util.Scanner;

public class CompareStr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		User kim = new User("abc1234","aaa1111");
		System.out.print("비밀번호를 입력하세요: ");
		String password = sc.next();
		
		System.out.println("방금 입력한 비번: "+ password);
		System.out.println("객체생성시 지정한 비번: " + kim.pw);
		
		System.out.println("-------------------------------------");
		System.out.println("== 연산자의 결과: "+(password == kim.pw)); //문자열 비교x
		System.out.println("equals의 결과: "+(password.equals(kim.pw)));
		

	}

}
