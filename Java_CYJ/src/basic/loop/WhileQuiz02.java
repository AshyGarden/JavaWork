package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {
		
		//입력받은 약수의 총합
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		int inputNum = sc.nextInt();
		int i = 1;
		int total = 0;
		if(inputNum<=0) {
			System.out.println("0이하의 정수는 약수를 구할 수 없습니다.");
		} else {
			while(i<=inputNum) {
				if(inputNum % i==0) {
					total += i;
					//System.out.println(i);
				}
				
				i++;
			}
			System.out.printf("입력받은 수 '%d'의 약수 총합->%d",inputNum ,total);
		}
		
		sc.close();
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		int i = 1; //begin
		int total = 0; //누적합 넣어줄 변수
		while(i<= num) {
			if(inputNum % i==0) {
				total += i;
			}	
			i++;
		}
		System.out.printf(num + "의 약수 총합:" + total);
		sc.close();
		 */

	}

}
