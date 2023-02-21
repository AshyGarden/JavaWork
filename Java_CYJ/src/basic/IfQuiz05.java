package basic;

import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {
		
		/*
		 #국어, 영어, 수학 점수 입력받음
		 평균구하기(소수점 첫째자리)
		 평균으로 학점
		 
		 95~100->A+, 94~90->A0, 80점대 B, 70점대C, 60점대 D, 나머지F
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력해주세요: ");
		int kor = sc.nextInt();
		System.out.println("영어점수를 입력해주세요: ");
		int eng = sc.nextInt();
		System.out.println("수학점수를 입력해주세요: ");
		int math = sc.nextInt();
		
		double avg;
		avg = (kor+eng+math)/3.0;
		String grade;
		
		if(avg>=95) {
			grade = "A+";
		} else if(avg>=90){
			grade = "A0";
		} else if(avg>=80) {
			grade = "B";
		} else if(avg>=70) {
			grade = "C";
		} else if(avg>=60) {
			grade = "D";
		} else {
			grade = "F";
		} 
		
		System.out.printf("당신의 평균점수는 %.1f점 입니다.\n",avg);
		System.out.printf("당신의 학점은 %s 입니다.",grade);
		
		sc.close();
		

	}

}
