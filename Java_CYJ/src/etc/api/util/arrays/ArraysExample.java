package etc.api.util.arrays;

import java.util.Arrays;

public class ArraysExample {
	
	public static void main(String[] args) {
		
		//배열복사
		char[] arr = {'J','A','V','A'};
		char[] arr2 = Arrays.copyOf(arr, 5); //0번부터x번째까지, 더복사할게없으면 빈칸이 삽입됨!
		char[] arr3 = Arrays.copyOfRange(arr2, 1, 3);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		//배열탐색: 이진탐색 binarySearch(배열, 검색할 값)
		//반드시 정렬이 선행되어야함!
		int[] numbers = {1,3,5, 7, 9,11,13};
		System.out.println("5의 위치?: "+Arrays.binarySearch(numbers, 0));
		
		//배열의 정렬
		int[] nums = {42, 11, 35, 88, 34, 100};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
				
		//배열 내부 요소가 동일하지의 여부를 확인
		System.out.println(Arrays.equals(arr, arr2));
		
		
	}

}
