package basic.loop;

import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {
		/*
		 -정수 1개를 입력받아서 해당 숫자까지 모든소수를 가로출력, 소수갯수 구하기
		  
		  ex) 30
		  소수:~
		  소수개수:n
		  
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요: ");
		int input = sc.nextInt();
		int totalPrime =0;
		int count = 0;
		
		System.out.print("소수: ");
		for(int i=2; i<=input; i++) //i: 2부터 input 값까지 세주기
		{      
			for(int j=1; j<=i; j++) //입력되고 있는 i에 대해 j를 1부터 i까지 세주기
			{      
				if( i % j == 0) count++;  //만약 i가j로 나누어 떨어지면 count++		
			} //for문 탈출시 count증감동결
			
			if(count==2)  //count=2 ->소수(1과 자기자신)
			{                
				totalPrime++;              //소수개수++
				System.out.print(i + " "); //이때 i는 소수이므로 출력해줌
			}
			count = 0;                     //다음숫자로 넘어가기전에 count초기화
		}
			
		System.out.println();
		System.out.println("소수의 개수:" + totalPrime);
		sc.close();
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		int count = 0; //소수의 개수를 세 줄 변수.
		
		for(int i=1; i<=num; i++) {
			int cnt = 0; //소수의 판별을 위해서 약수의 개수를 세 줄 변수.
			for(int j=1; j<=i; j++) {
				if(i % j == 0) {
					cnt++;
				}
			}
			if(cnt == 2) {
				System.out.print(i + " ");
				count++;
			}
			
		} 
		  
		 */
		
		
		
	}

}
