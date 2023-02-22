package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {
		// 48~150사이의 정수중 8의배수만 가로로 출력해보세요.
		//48부터 숫자를 하나씩 올려가며 8의배수판별
		
		int num = 48;
		while(num<=150) {
			if(num % 8 == 0) {
				System.out.print(num+" ");
			} 
			num++;
		}
		System.out.println("<-48~150사이의 8의 배수");
		
		//또다른 답안
//		int n = 48;
//		while(n <= 150) {
//			System.out.print(n + " ");
//			n += 8;
//		}		
		
		//1~100까지 정수중 4의배수이면서 8의배수는 아닌수를 가로로 출력
		int num2 = 1;
		while(num2<=100) {
			if(!(num2%8==0) && num2 % 4 == 0 ) {
				System.out.print(num2+" ");
			}
			num2++;
		}
		System.out.println("<-1~100사이의 4의 배수이지만 8의 배수가 아닌수");
		
		//답안1
//		int i = 1;
//		while(i <= 100) {
//			if(i % 4 == 0) {
//				if(i % 8 != 0) {
//					System.out.print(i + " ");
//				}
//			}
//			i++;
//		}
		
		//답안2
//		int i = 1;
//		while(i <= 100) {
//			if(i % 4 == 0 && i % 8 != 0) {
//				System.out.print(i + " ");
//			}
//			if(i % 4 == 0) {
//				if(i % 8 != 0) {
//					System.out.print(i + " ");
//				}
//			}
//			i++;
//		}
		
		System.out.println("---------------------------------------");
		//1~30000까지의 정수중 258의 배수의 개수를 출력
	
		int count1 = 0;
		int i1 = 1;
		while(i1 <= 30000) {
			if(i1 % 258 == 0) {
				count1++;
				//System.out.print(i1 + " ");
			}
			i1++;
		}
		System.out.println("숫자 258의 배수 갯수: "+ count1);
		
		//1000의 약수의 개수를 구하시오
		
		int count2 =0;
		int i2 =1;
		while(i2<=1000) {
			if(1000%i2==0) {
				count2++;
				System.out.print( i2 + " ");
			}		
			i2++;
		}
		
		System.out.println("->숫자 1000의 약수 갯수: "+ count2);

	}

}
