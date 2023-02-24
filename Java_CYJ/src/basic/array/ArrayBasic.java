package basic.array;

import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {
		//#배열(array)
		//->같은 데이터 타입의 값을 집합 형태로 나열하기 위한 자료형
		
		//1. 배열 변수 선언
		int[] arr;  //자바 스타일
		int arr2[]; //c언어 스타일
		
		//2. 배열 객체를 생성 - 실제 값들이 저장될 공간을 형성
		//생성할때 배열의크기를 정해주셔야 합니다.
		arr = new int[5];
		
		//3. 배열의 초기화 - 배열내부에 실제값들을 저장
		//배열의 초기화는 인덱스를 통해 수행
		//인덱스란 배열내부의 위치를 지정할수 있는 값
		//인덱스는 0번붙 시작하여 1씩 순차 증가
		
//		arr = 65;(x)
		arr[0] = 65; //(o) 인덱스 지목후 값대입
		arr[1] = 88;
		arr[2] = arr[0]; //2번인덱스에 0번인덱스 값을 대입해 저장
//		arr[3] = 3.14;(x)
//		arr[4] = "들어가려나"(x)
		
//		arr[5] = 77;  //인덱스범위초과, 실행시 에러(런타임에러가 일어남)(길이5 -> 인덱스4까지만 있음!
//		arr[6] = 542; //오류가 안남 주의
		
		//4. 배열의 총 크기(길이)확인 -> 배열변수명.length
		System.out.println("arr 배열의 길이: "+arr.length);
		
		//5. 배열에 저장된 값을 참조(사용)하는법(인덱스 이용)
		
		System.out.println("배열의 1번째 데이터: " + arr[0]);
		System.out.println("배열의 2번째 데이터: " + arr[1]);
		System.out.println("배열의 3번째 데이터: " + arr[2]);
		System.out.println("배열의 4번째 데이터: " + arr[3]);
		System.out.println("배열의 5번째 데이터: " + arr[4]);
		
		System.out.println("-----------------------------------------");
		
		//6.배열의 반복문 처리
		//배열은 인덱스 번호를 제어변수로 화룡하여 반복문 쉽게처리가능
		for(int idx=0; idx<arr.length; idx++)
		{
			System.out.printf("배열의 %d번째 데이터: %d\n", idx+1, arr[idx]);
		}
		//7. 배열내부 요소값을 문자열 형태로 한눈에 출력
		
//		System.out.println(arr); //깨져서 안보임
		System.out.println(Arrays.toString(arr)); //배열을 문자열로 표현		
		
		//8. 배열의 선언과 생성을 동시에 하기
		double[] dArr = new double[3]; //double의 기본값 0.0
		String[] sArr = new String[4]; //string의 기본값 null
		byte[] bArr = new byte[10];    //byte기본값 0
		
		//배열은 생성됨과 동시에 각 타입의 기본값으로 자동초기화
		System.out.println(Arrays.toString(dArr));
		System.out.println(Arrays.toString(sArr));
		System.out.println(Arrays.toString(bArr));
		
		//9.배열 생성과 동시에 초기화도 진행하는법
		char[] letters = new char[] {'a','b','c','d'};
		System.out.println(Arrays.toString(letters));
		
		//선언과 동시에 초기화시 딱 1번만 가능한 문법 (배열은 생성시 크기가 고정되기 때문에 늘거나 줄어들수없음!)
		String[] hello = {"안녕","하세요"};
//		names = {"반갑","습니다"}; (x)
		
		//만약 배열의 크기를 늘리거나 줄이고싶다면 기존배열을 조작하는것이 아니라 새롭게 생성해야한다
		hello = new String[] {"반갑","습니다"}; 
		
	}

}
