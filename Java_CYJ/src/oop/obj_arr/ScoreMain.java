package oop.obj_arr;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		/*
        - Score 객체를 담을 수 있는 배열을 선언하세요.
         배열의 크기는 넉넉하게 100개로 하겠습니다.
         
        - 반복문을 이용해서 사용자에게 이름, 국어, 영어, 수학점수를
        입력받은 후, 입력받은 점수를 토대로 Score 객체를 생성하세요.
        총점과 평균은 여러분들이 직접 구해서 넣으셔야 합니다.
        (직접 넣으시든, 메서드를 하나 만들어서 계산하시든 마음대로~)
        객체 생성 후, 미리 만들어 놓은 배열에 객체를 추가해 주세요.
        이름 입력란에 '그만' 이라고 입력하면 반복문을 종료시켜 주세요.
        
        - 반복문이 종료되었다면, 배열 내부에 있는 객체들을 순회하면서
         scoreInfo()를 모두 불러주세요. (반복문)
         주의!) 입력이 중간에 그만두어진다면, 배열의 나머지 인덱스는
         모두 null로 가득 차 있습니다. (null.scoreInfo() -> 에러)
        */
		
		Scanner sc = new Scanner(System.in);
		Score[] students = new Score[100];
		boolean cursorName = false, cursorNum = false;	
		Score student = new Score("",0,0,0);
	
		inputScore: while(true) {
			for(int i=0; i<students.length; i++) {		
				System.out.println((i+1)+"번째 입력!");
				if(cursorName == false) { //이름
					try {
						System.out.print("이름 : ");
						student.setName(sc.next());;	
						
						if(student.getName().equals("그만")) {
							students[i] = null;
							break inputScore;
						}
			
						 cursorName = true; 
						 
						 System.out.print("국어 점수 : ");
						 student.setKorScore(sc.nextInt());	
						 
						 System.out.print("영어 점수: "); //영어
						 student.setEngScore(sc.nextInt());	
						 
						 System.out.print("수학 점수: ");
						 student.setMathScore(sc.nextInt());	
						 cursorNum = true;
						 
					} catch(NullPointerException e) { //빈칸방지?
						cursorName = false;
						System.out.println("무언가 입력을 입력하세요!");
						sc.nextLine();
					} catch(InputMismatchException e) { //자바 1.7버전 이상부터사용가능, 오류처리문 2개묶기
						cursorName = false;
						System.out.println("이름을 입력하세요!");
						sc.nextLine();
					} catch (Exception e) {
						cursorName = false;
						System.out.println("알수없는 에러발생!");
						System.out.println("에러원인: "+e.getMessage());
						sc.nextLine();
					}
				} 
				
				//else if(cursorNum == false) {
//					try {
//					} catch(InputMismatchException e) { //자바 1.7버전 이상부터사용가능, 오류처리문 2개묶기
//						cursorNum = false;
//						System.out.println("정수를 입력하세요!");		
//						sc.nextLine();
//					}  catch (Exception e) {
//						cursorNum = false;
//						System.out.println("알수없는 에러발생!");
//						System.out.println("에러원인: "+e.getMessage());
//						sc.nextLine();
//					}			
//				}
				
				students[i] = student;
				cursorName = false; 
			    cursorNum  = false;
			}
		}
		
		
		for(int i =0; i<students.length; i++) {
			try {
				
				students[i].scoreInfo();
				System.out.printf("총점: %d, 평균: %d\n",students[i].getTotalScore(),students[i].getAverage());

			} catch(NullPointerException e) {
				System.out.println("여기까지가 점수입니다.");
				break;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("null 참조오류!");
			} catch (Exception e) {
				System.out.println("알수없는 에러발생!");
				System.out.println("에러원인: "+ e.getMessage());
				sc.nextLine();
			}		
		}
		
		sc.close();

	}

}
