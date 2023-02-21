package basic;

import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {
		/*
		 키와나이를 입력받아서 사용자가 놀이기구에 탑승할수 있는지 여부판단
		 키140이상이며 나이가 8세이상인 사용자만 탑승가능
		 조건이 하나라도 불충족하면 탑승불가
		 
		 놀이기구 탑승여부와 관계없이 "오늘 하루 즐거운 시간되세요!"를 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("탑승자의 키(cm)를 입력해주세요: ");
		double height = sc.nextDouble();
		System.out.println("탑승자의 나이(세)를 입력해주세요: ");
		int age = sc.nextInt();
		
		if(height<140.0) {
			System.out.println("죄송합니다 키가 140cm 미만이라 탑승하실 수 없습니다." );
		} else{
			if(age<8) {
			System.out.println("죄송합니다 나이가 8세 미만이라 탑승하실 수 없습니다." ); 
			} else {			
			System.out.println("환영합니다! 탑승하실수 있습니다." ); 
			}				
		}			
		 
//		if(height < 140.0 || age < 8)
//		{
//			System.out.println("죄송합니다 놀이기구에 탑승하실 수 없습니다." ); 
//		} else {
//			System.out.println("환영합니다! 탑승하실수 있습니다." );
//		}
				 
		System.out.println("오늘 하루 즐거운 시간되세요!");
		
		//모범답안
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력하세요: ");
		double height = sc.nextDouble();
		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		if(height >=140 && age >= 8){
		      System.out.println("놀이기구 탑승이 가능합니다.");
		} else {		
		      System.out.println("놀이기구 탑승이 불가합니다.");
		}
		System.out.println("오늘 하루 즐거운 시간되세요!");
		 	 
		 */

	}

}
