package basic.if_;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		//if중첩은 else if 문이 첫번째 조건식이 false일경 우 분기를 나눴다면
		//if의중첩문은 첫번쨰 중첩문이 true일때 분기를 나누는 방식
		/*
		 # 변수의 사용범위(유효범위)
		 - 변수는 선언된 블록 내에서만 유효
		 - 선언된 블록을 벗어나면 메모리에서 자동으로 소멸
		 -변수선언시 사용범위를 잘 파악하여 
		 전체적으로 사용할 변수라면 미리 선언해두고,
		 지역적으로 사용할 변수는 그 블록 범위 내에서만 사용하고 소멸시키는 것이 좋다.
		 */
		

		Scanner sc = new Scanner(System.in);

		System.out.println("키를 입력하세요: ");
		int height = sc.nextInt();

		if(height>=140) {
			System.out.println("나이를 입력하세요: ");
			int age = sc.nextInt(); //if문까지만 유효

			if(age>=8) {
				System.out.println("놀이기구 탑승이 가능합니다.");
			} else if(age >= 6) {
				System.out.println("보호자 동반시 탑승이 가능합니다.");
			} else {				
				System.out.println("나이가 6세 미만입니다.");
				System.out.println("놀이기구 탑승이 불가능합니다.");
			}		
		} //여기부터는 age유효X 
		else {
			System.out.println("키가 140cm 미만입니다.");
			System.out.println("놀이기구 탑승이 불가능합니다.");
		}
		
		
//		System.out.println(age);
		sc.close();

	}

}
