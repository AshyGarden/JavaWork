package basic.array;

import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		
		/*
		 # 2차원 배열
		 -배열안에 배열이 존재하는 형태를 2차원배열이라고함
		 실제배열에는 배열의 주소값이 들어감 
		 */
		
		
		
		int[] arr = {1,2,3};
		int[][] arr2D = {
				{1,2,3}, {4,5,6} , {7,8,9}, {10,11,12,13,14}};
		
		System.out.println(arr2D.length); //배열(덩어리)를 몇개 가지고있나?
		System.out.println(Arrays.toString(arr2D)); //주소값
		System.out.println(Arrays.toString(arr2D[0])); //n번째 배열덩어리의 배열
		System.out.println(arr2D[0][2]); //배열안의 순서까지 정해준 값

		System.out.println(Arrays.deepToString(arr2D)); //2차원 배열 내부의 모든 배열 다보여줌
		System.out.println("--------------------------------------------------------");
		
		//빈 2차원 배열 만들기
		int[][] arr2 = new int [3][4]; //배열덩어리3개 배열안의 값은 4개씩 존재가능
		arr2[1][2] = 50;
		arr2[2][1] = 75;
		
		for(int[] array : arr2) { //변수타입 = int배열덩어리
			for(int n :array) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
	
	
	}

}
