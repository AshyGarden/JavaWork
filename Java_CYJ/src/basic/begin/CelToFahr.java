package basic.begin;

import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {
		//섭씨-화씨 변환
		/*
		 사용자에게 섭씨온도를 입력받아서 화씨온도로 변환하여 출력하는 로직을 작성
		 화씨온도는 소수점 첫째자리까지 표현
		 #ㄹ한자7->섭씨기호(℃), ㄹ한자다음장4->화씨기호(℉)
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 서울의 섭씨온도를 적어주십시오:");
		double cel1 = sc.nextDouble();
		double fahr1 = cel1 * 1.8 + 32;
		System.out.println("현재 서울 온도는 다음과 같습니다.");
		System.out.printf("섭씨온도: %.1f℃ / 화씨온도: %.1f℉",cel1,fahr1);
	
		System.out.print("\n현재 워싱턴의 화씨온도를 적어주십시오:");
		double fahr2 = sc.nextDouble();
		double cel2 = (fahr2 - 32) * 5 / 9;
		System.out.println("현재 워성틴 온도는 다음과 같습니다.");
		System.out.printf("화씨온도: %.1f℉ / 섭씨온도: %.1f℃",fahr2,cel2);
		
		sc.close();
		
		//모범답안
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("온도를 입력하세요(℃):");
		double cel = sc.nextDouble();
		doublr fahr = cel * 1.8 + 32;
		System.out.printf("입력한 섭씨: %.1f℃\n",cel);
		System.out.printf("변환한 화씨: %.1f℉\n",fahr);
		sc.close(); 
		
		int ver
		Scanner sc = new Scanner(System.in);
		
		System.out.print("온도를 입력하세요(℃):");
		int cel = sc.nextInt();
//		double fahr = cel * 9 / 5 + 32; //모두 int이기 때문에 정수몫만 남기게되서 값이 오류날수있음
		double fahr = cel * 9.0 / 5 + 32; //아무수나 실수로 형바꿔주면됨 
		System.out.printf("입력한 섭씨: %d℃\n",cel);
		System.out.printf("변환한 화씨: %.1f℉\n",fahr);
		sc.close(); 
				 
		 */
	}

}
