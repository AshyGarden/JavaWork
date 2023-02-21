package basic;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int point = sc.nextInt();
		System.out.println("현재 당신의 점수는: "+ point + "점 입니다.");
		System.out.println("-------------------------");
		
		if(point>=70) {//조건이 참일경우 이 중괄호 안의 실행문 실행
			System.out.println("70점 이상이시군요. 합격입니다 :)");
		} else {
			System.out.println("70점 미만이시군요. 불합격입니다 :(");
		}
		System.out.println("시험 치르느라 수고하셨습니다");
		
//		if(point<70) {
//			System.out.println("70점 미만이시군요. 불합격입니다 :(");
//		}
		
		
		
		sc.close();

	}

}
