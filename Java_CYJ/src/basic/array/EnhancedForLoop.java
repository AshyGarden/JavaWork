package basic.array;

import java.util.Arrays;

public class EnhancedForLoop {

	public static void main(String[] args) {
		/*
		 
		 #향상된 For문 (for each)
		 - 제어변수(인덱스)의 사용없이 배열내부의 요스를 전체 참조할수있게 해주는 반복문
		 
		 ex)
		 for(배열요소를 받아줄수 있는 변수 : 배열변수명){
		    반복실행문
		 }	  
		 */
		
		String[] week = {"월","화","수","목","금","토","일"};
		
//		for(int i=0; i<week.length; i++)
//		{
//			System.out.println(week[i] + "요일 좋아~!");
//		}

		for(String day : week) { //좌항(배열요소의 타입+배열변수)  : 우항(배열의 이름)			
			System.out.println(day + "요일 좋아~!"); //모든범위가 해당
		}
		
		/*
		 1. scores라는 이름으로 int배열을 하나 선언해서
         점수 데이터를 저장하세요.
         {96, 88, 74, 63, 100, 55}

         2. 향상 for문(forEach)을 사용하여 총점과 평균을 구해보세요.
         총점(int), 평균(double, 소수점 둘째 자리까지 출력)
		  
		 */
		
		//1.scores
		
		int[] scores = {96, 88, 74, 63, 100, 55};
		System.out.println(Arrays.toString(scores));
		
		//2 총점, 평균
		int totalScores = 0;
		for(int total : scores) {
			totalScores += total;
		}
			
		double avg = (double)totalScores/scores.length;
		System.out.println(totalScores);
		System.out.printf("%.2f",avg);
		
	}

}
