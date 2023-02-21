package basic;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		/*
		 스캐너 사용하여 정수를 하나 입력받음
		 
		 -7의배수라면 "7의 배수입니다."
		 -7의 배수가 아니라면 "7의 배수가 아닙니다."
		 -0이라면 "0입니다."
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요: ");
		int num = sc.nextInt();
		
		if(num==0) {
			System.out.println("0입니다.");
		} else if(num % 7==0) {
			System.out.println("입력하신 숫자는 7의 배수입니다.");
		} else {			
			System.out.println("입력하신 숫자는 7의 배수가 아닙니다.");
		}
		sc.close();

	}

}
