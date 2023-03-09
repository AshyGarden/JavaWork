package etc.exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		try {
			System.out.print("정수: ");
			int n = sc.nextInt();
			
			int result = 100 / n;
			
			System.out.println(arr[result]);
			
			String s = null;
			s.equals("메롱");
			
			
			
			/*
			 -다중 catch은 에러발생시 위에서부터 순서대로 catch문을 검색하면서 내려오기 때문에
			 부모타입의 예외를 자식타입의 에외보다 위에 작성하면 안된다.
			 
			 - catch 옆에 괄호에 예외타입을 여러개 작성하고 싶은경우는 |(or)를 이용하여 나열하면
			   하나의catch블록으로 여러타입 예외를 동시에 처리가능
			   (java 7버전부터 가능한 문법)
			 
			 */
			
			
			
			
			
			
			
		} catch(InputMismatchException | ArithmeticException e) { //자바 1.7버전 이상부터사용가능, 오류처리문 2개묶기
			System.out.println("0이 아닌 정수를 입력하세요!");		
		}  catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위를 벗어났어요!");
		} catch (NullPointerException e) {
			System.out.println("null 참조오류!");
		} catch (Exception e) {
			System.out.println("알수없는 에러발생!");
			System.out.println("에러원인: "+e.getMessage());
		}
		
		System.out.println("프로그램 정상 종료!");
		sc.close();
	
	}
}
