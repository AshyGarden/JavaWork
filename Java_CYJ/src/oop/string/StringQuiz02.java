package oop.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {
		/*
		 1. 주민등록번호 13자리(-포함 입력받음)
		 2. 13자리가 아니라면 다시입력받음
		 3. 남자인지 여자인지 구분해서출력	  
		 */

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("주민등록번호를 입력해주세요: ");
			String inputIdNum = sc.nextLine();			
			String nohyponID= inputIdNum.replace("-", "");
			
//			System.out.println(nohyponID);
//			System.out.println(String.valueOf(nohyponID.charAt(6)));
			if(nohyponID.length()!=13) {
				System.out.println("13자리가 아닙니다 다시입력해주세요");
			} else if(nohyponID.charAt(6)=='1'||nohyponID.charAt(6)=='3') {				
				System.out.println("남자입니다");
				break;
			} else if(nohyponID.charAt(6)=='2'||nohyponID.charAt(6)=='4') {
				System.out.println("여자입니다");
				break;
			} else {
				System.out.println("잘못된 주민번호입니다.");
			}
			
		}
		
		sc.close();
	}

}
