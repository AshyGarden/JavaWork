package basic.array;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9, 11, 13};
		
//		arr[3] = arr[4];
//		arr[4] = arr[5];
//		arr[5] = arr[6]; 
		
		
	    //삭제되는 값을 기준으로 뒤에있는 값을 한칸씩 앞으로 당기는작업.
		//추후에 생성될 새 배열에 값을 그대로 대입하기 편하게 대입하려고 하는 작업
		for(int i=3; i<arr.length-1; i++) {
			//삭제되는 값지점, 인덱스 크기-1(마지막 값이 없기때문에 그값 전까지만 당길수있음)
			arr[i] = arr[i+1];
		}
		
		//기존의 배열보다 크기가 하나 작은 새 배열 생성
		int[] temp = new int[arr.length-1];
		
		//운본 배열의 값을 새 배열에 인덱스 맞춰서 그대로 대입하기
		//temp[0] = arr[0]; //~
		
		for(int j=0; j<temp.length; j++){
			temp[j] = arr[j];		
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		
		arr = temp;  // 원본배열주소를 임시주소로 바꿈
		temp = null; // 임시배열의 주소를 소거(temp는 자동소멸)
		
		System.out.println(Arrays.toString(arr));
		
	}

}
