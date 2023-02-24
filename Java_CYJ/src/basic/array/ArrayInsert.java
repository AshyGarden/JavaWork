package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] names = new String[6];
		for(int i=0; i<names.length; i++) {
			System.out.print("이름을 입력하세요");
			String name = sc.next();
			
			/*
			 - 자바에서는 ㅁㄴ자열 동등비교시 '=='연산자를 사용하면 제대로 비교x
			 -문자열 String타입이 객체 참조타입이기때문
			 객체참조타입은 해당값을 직접 들고있는게 아니라 객체의 주소값을 들고있기때문에,
			 문제열이 같아도 주소가 다르면 false를 도출
			  
			  -
			   - 그러므로 문자열 동등 비교를 진행할 때는 [비교문자열1.equals(비교문자열2)]를 사용
			 */
		
			
			
			if(name.equals("그만")) { //문자열은 동등비교시 == 안먹힘, 객체타입은 비교볼가, 
				System.out.println("입력종료");
				break;
			}
			
			names[i] = name;
		}
		System.out.println("-------------------------------");
		//System.out.println(Arrays.toString(names));
		
		for(String n : names) {
			if(n==null) break;
			System.out.println(n + " ");
		}
		sc.close();

	}

}
