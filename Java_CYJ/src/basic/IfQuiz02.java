package basic;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		/*
		 -정수 2개 입력받아서 두 정수중 어느수가 큰지 또는 같은지 판별
		 
		 입력받은수 4,7
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력해주세요:");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 수를 입력해주세요:");
		int num2 = sc.nextInt();
		
		System.out.printf("입력하신수는 다음과 같습니다.\n첫번째수:%d / 두번째수:%d\n",num1,num2);
		if(num1>num2) {
			System.out.printf("첫번째 수인 %d이(가) 큰 수입니다.",num1);
		} else if(num1<num2) {			
			System.out.printf("두번째 수인 %d이(가) 큰 수입니다.",num2);
		} else {			
			System.out.println("두 수는 같은 수입니다.");
		}
		
		sc.close();
		
		//모범답안
		/*
		 Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1:");
		int num1 = sc.nextInt();
		
		System.out.println("정수2:");
		int num2 = sc.nextInt();
		if(num1>num2) {
			System.out.printf("%d이(가) 큰 수입니다.",num1);
		} else if(num1<num2) {			
			System.out.printf("%d이(가) 큰 수입니다.",num2);
		} else {			
			System.out.println("같은 수입니다.");
		}
		 
		 */
		
	}

}
