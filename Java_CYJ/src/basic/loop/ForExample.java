package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		
//		int i =1;
//		int total =0;
//		while (i<=10) {
//			total+=i;
//			i++;
//		}
//		int total = 0;
//		for(int i=1; i<=10; i++) { //begin; end; step
//
//			total += i;
//		}
		
		//1~200까지의 정수중 6의배수 12의배수는 아닌수 가로출력
		for(int i=0;i<=200;i++){
			if(i % 6 == 0 && i % 12 != 0) {
				System.out.printf("%d ",i);
			}
		}
		System.out.println();
		//1~60000까지 정수중 177의 배수의 개수
		int count = 0;
		for(int i = 1; i<=60000; i++) {
			if(i % 177 == 0)		
				count++;			
		}
		System.out.println("1~60000까지 정수중 177의 배수의 개수:"+count+"개");
		
		//입력받은 정수까지 팩토리얼값
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int fac = sc.nextInt();
		int total1 = 1;
		int total2 = 1;
		
		for(int i=1; i<=fac; i++) {
			total1 *= i;
		}
		
		for(int i = fac; i>=1; i--) {
			total2 *= i;
		}
		System.out.printf("%d!의 값은 %d 입니다\n", fac, total1);
		System.out.printf("%d!의 값은 %d 입니다\n", fac, total2);
		
		sc.close();

	}

}
