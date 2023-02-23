package basic.loop;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		/*
		 - 정수 1개를 입력받아서 해당정수가 소수(prime number)인지를 판별 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt(); //약수의 갯수가 2개면 소수, 초과면 소수X
		int i = 1;
		int count = 0;
	
		while(i<=num) {
			if(num % i==0) {
				count++;
			} 
			i++;
		}
		
		if(count ==2) {
			System.out.println("약수의 갯수가 1과 자기자신 뿐이므로 소수입니다.");		
		} else {
			System.out.printf("약수의 갯수가 %d개이므로 소수가 아닙니다.",count);
		}
		
		sc.close();
		
		//모범답안
		/*
		int i = 1; //소수의 판별을 위해 입력받은 정수 num을 지속적으로 나누어 볼 변수.
		int count = 0; //나누어 떨어진 횟수를 기억할 변수.
		
		while(i <= num) {
			if(num % i == 0) {
				count++;
			}
			i++;
		}
		
		if(count == 2) {
			System.out.println(num + "은(는) 소수입니다.");
		} else {
			System.out.println(num + "은(는) 소수가 아닙니다.");
		}
		sc.close();
		*/
		
		//답안2
		/*
		int j = 2; //1은 모든 수의 약수이기 때문에 배제합니다.
		
		while(num % j != 0) {
			j++;
		}
		
		System.out.println(num == j ? "소수입니다." : "소수가 아닙니다.");
		*/
		
		
	}

}
