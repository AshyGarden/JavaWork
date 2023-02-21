package basic;

import java.util.Scanner;

public class IfQuiz04 {

	public static void main(String[] args) {
		
		/*
		 -서로다른 정수 3개를 입력받습니다.
		 -가장큰값,중간값,작은값을 구해서 출력
		 
		 max mid min 변수 선언
		 판별후 변수에 값 넣기
		 마지막에 한번에 출력
		 */
		
		//모범답안


		Scanner sc = new Scanner(System.in);
		System.out.println("정수1: ");
		int num1 = sc.nextInt();
		System.out.println("정수2: ");
		int num2 = sc.nextInt();
		System.out.println("정수3: ");
		int num3 = sc.nextInt();

		int max, mid, min;
		if(num1 > num2 && num1 > num3) { //num1=max~
			max = num1;
			if(num2 >num3){ mid = num2; min = num3;} 
			else{ mid=num3; min = num2;}
		} 
		else if(num2 > num1 && num2 > num3){//num2=max~
			max = num2;
			if(num1>num3){ mid = num1; min = num3; }
			else{ mid = num3; min = num1;}

		}  
		else{ //num3=max~
			max = num3;
			if(num1>num2){ mid = num1; min = num2; }
			else{ mid = num2; min = num1;}
		}
		System.out.println("-----------------------------------");  
		System.out.println("최대값: "+ max);  
		System.out.println("중간값: "+ mid);  
		System.out.println("최소값: "+ min);  

		sc.close();
		

		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 숫자를 입력해주세요: ");
//		int num1 = sc.nextInt();
//		System.out.println("두번째 숫자를 입력해주세요: ");
//		int num2 = sc.nextInt();
//		System.out.println("세번째 숫자를 입력해주세요: ");
//		int num3 = sc.nextInt();
//		
//		int max = 0;
//		int min = 0;
//		int mid = 0;
//		
//		if(num1>num2) {			//1>2
//			if(num1>num3) {     //1>3
//				if(num2>num3) { //2>3
//					max = num1;	mid = num2;	min = num3; //case1-1: 1>2>3
//				}  else if(num2<num3) {
//					max = num1;	mid = num3;	min = num2; //case1-2: 1>3>2
//				} else {//case1-3: 1>2=3
//					max = num1;	mid = num2;	min = num3;
//					System.out.println("두번째 수는 세변째수와 같고 첫번째 수보다 작습니다.");
//				}
//								
//			} else if(num1<num3) { //case1-4: 3>1>2
//				max = num3;	mid = num1;	min = num2;
//			} else { //case1-5: 1=3>2
//				max = num1;	mid = num3;	min = num2;
//				System.out.println("첫번째 수와 세변째수는 같고 두번째수보다 큽니다.");
//			}		
//		} 
//		
//		else if(num1<num2) {    //1<2
//			if(num1>num3) {     //case2-1 2>1>3
//				max = num2; mid = num1; min = num3;								
//			} else if(num1<num3) { //case2-2: 2>3>1
//				max = num2;	mid = num3;	min = num1;
//			} else { //case2-5: 2>1=3
//				max = num2; mid = num1; min = num3;	
//				System.out.println("첫번째 수와 세변째수는 같고 두번째 수보다 작습니다.");
//			}
//		} 
//		
//		else { //1=2
//			if(num1 == num3) { //1=2=3
//				max = num1; mid = num2; min = num3;	
//				System.out.println("3개의 숫자는 모두 같습니다.");
//			}
//			else if (num1>num3){//1=2>3
//				max = num1; mid = num2; min = num3;	
//				System.out.println("첫번째 수와 두번째수는 같고 둘다 세번째수보다 큽니다.");
//			}
//			else {//3>1=2
//				max = num3; mid = num1; min = num2;	
//				System.out.println("첫번째 수와 두번째수는 같고 둘다 세번째수보다 작습니다.");				
//			}
//		}
//		System.out.printf("제일큰값은 %d이며 중간값은 %d이고 제일 작은값은 %d입니다.",max,mid,min);
//			
//		sc.close();
		
		
		
		 
		
		
	}

}
