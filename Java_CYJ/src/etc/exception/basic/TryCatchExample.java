package etc.exception.basic;

import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수1 입력해주세요: ");
		int i =sc.nextInt();
		
		System.out.print("정수2 입력해주세요: ");
		int j =sc.nextInt();
		
		System.out.println("나누기 시작!");
		
		try { 
			//try블록에는 예외발생 가능성이 있는 코드를 작성한다.
			System.out.printf(" %d / %d = %d \n",i,j,i/j);
			
		} catch(Exception e){
			//catch블록에는 try블로게서 실제 예외가 발생했을시 실행할 코드를 작성
			System.out.println("0으로 나누지 마시오!");
		}
		sc.close();
		
		System.out.println("나누기 종료!");
	
	}

}
