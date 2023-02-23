package basic.switch_;

import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {
		
		/*
		 정수를 하나 입력받고, 연산자 하나 입력받기
		 다시 정수를 입력받아서 사용자가 선택한 연산자를 기준으로 연산결과 출력(switch문) 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력해주세요: ");
		int num1 = sc.nextInt();
		System.out.print("연산기호를 입력해주세요[+,-,*,/]: ");
		String marker = sc.next();
		System.out.print("두번째 숫자를 입력해주세요: ");
		int num2 = sc.nextInt();
		
		switch(marker) {
		
		case "+":
			System.out.println("더하기를 선택하셨습니다.");
			System.out.printf("두 수의 합은 %d입니다.", num1 + num2);
			break;
			
		case "-":
			System.out.println("빼기를 선택하셨습니다.");
			System.out.printf("첫번째 숫자에서 두번째 숫자를 뺀 값은 %d입니다.", num1 - num2);
			break;
			
		case "*":
			System.out.println("곱하기를 선택하셨습니다.");
			System.out.printf("두 수의 곱은 %d입니다.", num1 * num2);
			break;
			
		case "/":
			System.out.println("나누기를 선택하셨습니다.");
			if(num2==0) {
				System.out.println("0으로 나눌수 없습니다.");
				break;
			}
			else {
				System.out.printf("첫번째 숫자에서 두번째 숫자를 나눈 값은 %.2f입니다.", (double)num1 / num2);
				break;
			}
						
	    default:
	    	System.out.println("잘못된 연산기호를 입력하셨습니다.");			
		}
		sc.close();
		
		//모범답안
		/*
		 Scanner sc = new Scanner(System.in);
		System.out.print("정수1: ");
		int num1 = sc.nextInt();
		System.out.print("연산을 선택하세요[+,-,*,/]: ");
		String operator = sc.next(); 
		System.out.print("정수2: ");
		int num2 = sc.nextInt();
		
		
		//방법1
		switch(operator) {
		
		case "+":
			int result = num1 + num2;
			System.out.println("두 수의 덧셈결과" + result);
			break;
			
		case "-":
			System.out.printf("두 수의 뺄셈 결과:" + (num1 - num2));
			break;
			
		case "*":
			System.out.printf("%d X %d= %d\n.", num1, num2, num1 * num2);
			break;
			
		case "/":
		    if(num2 ==0){
		     System.out.println("연산할수없는 입력값입니다.");
		     break;
		    }
		    System.out.printf("%d / %d= %d\n.", num1, num2, num1 / num2);
			break;
								
	    default:
	    	System.out.println("사칙연산기호를 정확하게 입력하세요");
	    	System.out.println("[+,-,*,/]");			
		}
		
		//방법2
		int result = 0;
		boolean flag = false; //참거짓 플래그
		
		switch(operator) {
		
		case "+":
			result = num1 + num2;
			break;
			
		case "-":
			result = num1 - num2;
			break;
			
		case "*":
			result = num1 * num2;
			break;
			
		case "/":
		    if(num2 ==0){
		     System.out.println("연산할수없는 입력값입니다.");
		     flag = true;
		     break;
		    }
		    result = num1/num2;
			break;
								
	    default:
	    	System.out.println("사칙연산기호를 정확하게 입력하세요");
	    	System.out.println("[+,-,*,/]");	
	    	flag = true;		
		}
		
		if(!flag){ //flag = false
		 System.out.printf("%d %s %d = %d\n.", num1, operator, num2, result);
		}
		
		
		
		
		sc.close();
		
		 */
	}

}
