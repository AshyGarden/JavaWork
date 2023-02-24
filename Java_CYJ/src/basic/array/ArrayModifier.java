package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {

	public static void main(String[] args) {

		String[] foods = { "삽겹살", "족발", "피자", "햄버거" };
		System.out.println(Arrays.toString(foods));

		foods[0] = "치킨";
		foods[2] = "탕수육";
		System.out.println(Arrays.toString(foods));

		// 배여르이 인덱스 탐색
		System.out.println("------------------------------------");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int indexNum = 0;

		for (int i = 0; i < foods.length; i++) {
			System.out.printf("%d번째 탐색: %s %d\n", i + 1, foods[i], indexNum); // i번째탐색:음식이름
			if (name.equals(foods[i])) { // 음식을 1번에서찾았다
				System.out.println("탐색완료");
				System.out.println("인덱스: " + i + "번");
				break;
			}

			else if (indexNum == foods.length - 1) // 모든 인덱스를 돌고도 못찾았다.
			{
				System.out.println("없는 음식입니다.");
				break;
			}
			indexNum++; // 음식이 i번이 아니다+인덱스번호 늘어나는김에 늘어난변수
		}
		// System.out.println(count);
		sc.close();

		/*
		 * Scanner sc = new Scanner(System.in); String name = sc.next(); boolean b =
		 * false; for(int i=0; i<foods.length; i++) {
		 * //System.out.printf("%d번째 탐색: %s \n", i+1, foods[i]); //i번째탐색:음식이름
		 * 
		 * if(name.equals(foods[i])) { System.out.println("탐색완료");
		 * System.out.println("인덱스: "+ i +"번"); break; } }
		 * 
		 * if(!flag){ System.out.println("없는음식입니다."); }
		 * 
		 * sc.close();
		 */
	}

}
