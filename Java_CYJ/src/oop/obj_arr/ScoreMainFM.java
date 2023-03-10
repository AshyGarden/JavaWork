package oop.obj_arr;

import java.util.Scanner;

public class ScoreMainFM {

	public static void main(String[] args) {
		
		ScoreFM[] scores = new ScoreFM[100];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<scores.length; i++) {
			System.out.println("*** 학생 점수 입력 프로그램 ***");
			System.out.println("'그만'을 입력하시면 종료됩니다.");
			
			System.out.print("이름: ");
			String name = sc.next();
			if(name.equals("그만")) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			
			System.out.println("국어: ");
			int kor = sc.nextInt();
			System.out.print("영어: ");
			int eng = sc.nextInt();
			System.out.print("수학: ");
			int math = sc.nextInt();
			
//			int total = kor + eng + math;
//			double avg = total / 3.0;
//			
//			scores[i] = new ScoreFM(name, kor, eng, math, total, avg);
			
			scores[i] = new ScoreFM(name, kor, eng, math);			
		}
		
		//입력 반복문
		for(ScoreFM s : scores) {
			if(s==null) break;
			
			s.scoreInfo();
			System.out.println("----------------------------");
		}
				
		sc.close();
		

	}

}
