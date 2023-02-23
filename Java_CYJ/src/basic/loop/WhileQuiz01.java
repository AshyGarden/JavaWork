package basic.loop;

import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {
		
		/*
		 구구단 단수를 입력받아서 해당단수의 구구단을 출력하시오
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단을 외우자~");
		System.out.println("단수를 입력해주세요: ");
	    int dan = sc.nextInt();
	    if(dan <= 0) {
			System.out.println("0 또는 음수 단수는 존재하지 않습니다!");
		} else {
			System.out.printf("***구구단 %d단***\n", dan);
			
		    int num = 1;
			while(num<=9) {
				
				System.out.printf("%d X %d = %d\n",dan, num, dan*num);
				num++;
			}
			
		}
	     
		sc.close();
		
		/*
		 
		  
		  
		 */
		
	}

}
