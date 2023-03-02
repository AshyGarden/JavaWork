package basic.method;

import java.util.Arrays;

public class MethodQuiz02 {

	static String[] foods = {"떡볶이","치킨","파스타"};
	
	//베열의 맨 마지막 위치에 데이터를 추가하는 함수
	static void push(String newFood){
		String[] temp = new String[foods.length+1];
		
		for(int i=0; i<foods.length; i++) {
			temp[i] = foods[i];
		}
		temp[foods.length] = newFood; //
		foods = temp;
		
		//배열크기 1개 늘리고 배열옮겨주기
	}
	
	//배열내의 특정음식의 위치를 찾아주는 함수
	static int indexOf(String targetName) {	
		int index = 0;	
		for(int i=0; i<foods.length; i++) {
			if(targetName.equals(foods[i])) {
				index = i;
			}
		}
		if(index ==0)
			return -1;
		else
			return index;
		/*
		 for(int i=0; i<foods.length; i++) {
		     if(targetName.equals(foods[i])) {
				return i;
			}
		}
		return -1; 
		 */
	}
	
	//특정 음식의 배열포함 여부(참/거짓)
	static boolean include(String targetName) {

		boolean flag = false;
		for(int i=0; i<foods.length; i++) {
			if(targetName.equals(foods[i])) {
				flag = true;
			}
		}
		if(flag) 
			return true;
		else 
			return false;	
		/*
		 return indexOf(targrtName) != -1; 
		 */
		
	}
	
	//특정음식 제거함수
	static void remove(String targetName) {
		int idx = indexOf(targetName);
		if(idx == -1) {
			System.out.println("존재하지 않는 음식입니다.");
		}
		else {
			for(int i = idx; i<foods.length-1; i++) {
				foods[i] = foods[i+1];
			}
			String[] temp = new String[foods.length-1];
			for(int j=0; j<temp.length; j++) {
				temp[j] = foods[j];
			}
			foods = temp;
		}
	}
	
	//특정 음식 수정 메서드
	static void modify(int targetIdx, String newFood) {
		foods[targetIdx] = newFood;
	}
	
	//배열내부 데이터 단순 출력함수
	static void printFood() {
		System.out.println(Arrays.toString(foods));
	}
	
	public static void main(String[] args) {
		
		printFood();
		push("라면");
		push("김치찌개");
		printFood();
		//파스타의 인덱스 
		System.out.println("파스타의 인덱스 번호: " + indexOf("파스타"));
		//김치찌개의 인덱스	
		System.out.println("김치찌개의 인덱스 번호: " + indexOf("김치찌개"));
		//짜장면의 인덱스      //return -1;
		System.out.println("짜장면의 인덱스 번호: " + indexOf("짜장면"));	
		
		
		remove("김치찌개");
		remove("망고"); //존재하지 않는 음식명입니다 출력
		
		//라면의 존재여부
		System.out.println(include("라면"));
		//양념치킨의 존재여부
		System.out.println(include("양념치킨"));
		//2번인덱스 데이터를 닭갈비로 수정.
	
		modify(2, "닭갈비");
		
		
		
		

	}

}
