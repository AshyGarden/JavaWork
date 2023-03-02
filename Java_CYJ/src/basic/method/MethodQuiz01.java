package basic.method;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MethodQuiz01 {

	/*
    1. calcDivisor()라는 메서드를 선언하세요.
    2. 이 메서드는 정수 하나를 전달받아서 해당 정수의
     모든 약수를 가로로 출력하고 약수의 개수를 리턴하는
     메서드입니다. (가로로 출력은 메서드 내부에서 진행)
    3. 메서드 선언을 완료하시고, main에서
     72의 약수의 개수와 10의 약수의 개수를 출력해 보세요.
     호출 두번 하시는 거에요.
     */
	
	static int Divisor(int div) {
		
    	int count = 0;
		System.out.println("약수: ");
		
		for(int i=1; i<=div; i++) {
			if(div%i == 0) {
			    System.out.print(i+" ");
				count++;
			}
		} 
		return count;
	}
		  
		 
		
//		int[] temp = new int[div];		
//		int count =0;
//		
//		for(int i=1; i<=div; i++) {
//			if(div/i == 0) {
//				count++;
//			}
//		}
//		int[] divisors = new int[count];
//		
//		
//		for(int i=0; i<temp.length-1; i++) {	
//			for(int j=0; j<count; j++){
//					if(temp[i]!=0 && divisors[j]==0) {
//						divisors[j] = temp[i];
//				}
//			}
//		}
//		return divisors;
	
	
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		//int inputNum = sc.nextInt();	
		int inputNum = 72;
		System.out.println(inputNum + "의 약수 개수: "+Divisor(inputNum));
		//int inputNum2 = sc.nextInt();
		int inputNum2 = 10;
		System.out.println(inputNum + "의 약수: "+Divisor(inputNum2));
	}

}
