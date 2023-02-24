package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {
		
		/*
		 2가지의 정수를 1~100사이의 난수를 발생
		 문제출제후 정답입력받기
		  
		  종료이후 정답오답횟수 출력
		 */
		
		Scanner sc = new Scanner(System.in);				
		int correct  = 0; //정답개수 카운팅, 값이 고정되어야 하는 애들이므로 while문 밖에 배치
		int error    = 0; //오답개수 카운팅
		System.out.println("      ***덧셈뺄셈퀴즈***");
		System.out.println("  두 숫자의 범위는 각각 0~100");
		System.out.println("종료를 원하시면 1000을 입력해주세요!");
		
		while(true) 
		{	
			int randNum1 = (int) ((Math.random() * 100)+1) ; //값이 계속 변해야 하는 애들 = while문 안쪽에 배치
		    int randNum2 = (int) ((Math.random() * 100)+1) ;
			int randOp   = (int) (Math.random() * 2) ;		
			if( randOp == 1 ) //더하기
			{
				System.out.printf("%d + %d = ???", randNum1, randNum2);	
				System.out.println();
				int answer = sc.nextInt();
				
				if(answer == randNum1 + randNum2) //정답일때
				{
					System.out.println("정답입니다.");
					correct++;
				}
				
				else if(answer == 1000 ) { //그만두고싶을때
					System.out.println("1000을 입력받아 프로그램을 종료합니다");
					System.out.println("------------------------");
					System.out.println("정답갯수: " + correct);
					System.out.println("오답갯수: " + error);
					break;
				}
				else { //틀렸을때
					System.out.println("오답입니다.");
					error++;
				}	
			}
					
			else 	//빼기
			{
				System.out.printf("%d - %d = ???", randNum1, randNum2);
				System.out.println();
				int answer = sc.nextInt();
				if(answer == randNum1 - randNum2) 
				{
					System.out.println("정답입니다.");
					correct++;
				}
				else if(answer == 1000 ) {
					System.out.println("1000을 입력받아 프로그램을 종료합니다");
					System.out.println("------------------------");
					System.out.println("정답갯수: " + correct + "회");
					System.out.println("오답갯수: " + error + "회");
					break;
				}
				else {
					System.out.println("오답입니다.");
					error++;
				}							
				
			}
							
						
		}
		
		sc.close();
		
		/*
		 Scanner sc = new Scanner(System.in);
		int cCount = 0;
		int iCount = 0;
		
		System.out.println("*** 연산 퀴즈 ***");
		System.out.println("# 종료하시려면 0을 입력해 주세요.");
		
		while(true) {
			
			int rn1 = (int) ((Math.random()*100) + 1);
			int rn2 = (int) ((Math.random()*100) + 1);
			int num = (int) (Math.random()*2);
			
			
			//연산을 미리 만들어놓고 입력받기
			int correct; //미리 변수 1개선언(while이 돌기때문에 선언변수는 다음 사이클에 초기화)
			if(num == 0) {//더하기연산
				System.out.printf("%d + %d = ???\n", rn1, rn2); 
				correct = rn1 + rn2;
			} else { //빼기연산
				System.out.printf("%d - %d = ???\n", rn1, rn2);
				correct = rn1 - rn2;
			}
			
			System.out.print("> ");
			int answer = sc.nextInt();
			
			if(answer == correct) {
				System.out.println("정답입니다!");
				cCount++;
			} else if(answer == 0) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("틀렸습니다~");
				iCount++;
			}
			
		}
		
		System.out.println("------------------------");
		System.out.println("정답 횟수: " + cCount + "회");
		System.out.println("오답 횟수: " + iCount + "회");
		
		sc.close();
		 
		 
		 
		 
		 */

	}

}
