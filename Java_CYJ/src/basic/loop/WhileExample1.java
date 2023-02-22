package basic.loop;

public class WhileExample1 {

	public static void main(String[] args) {
		
		
		/*
		 #while문의 진행순서
		 1.제어변수 선언(시작값 세팅)
		 2.while문의 조거신을 검사해서 true면 반복문시작, false라면 반복문 종료
		 3. while문 블록내부가 한번진행되면 (끝까지 내려가면) 자시조건식을 검사하여 true라면 계속진행 false라면 반복문종료
		 4.반복문내에는 증감식을 배치하여 제어변수값을 조정 
		 */
		
		
		
		//begin-step-end 반복문의 필수요소 3가지
		int n =1; //제어변수: 반복문의 횟수를 제어할 변수 (begin)	
		while(n <= 10) { //논리형조건식 - 반복문이 끝나는 조건을 설정(end)
			System.out.println("안녕하세요! 반갑습니다." + n);
			n++; //증감식: 반복문의 종료를 위해 제어변수의 값을 조전(step)
		}

		System.out.println("-------------------------------------------");
		
		//1~10까지의 누적합계
		int i =1; //begin
		int total = 0; //누적합 기억할 변수
		
		while(i<=10){ //end
	
			total += i; //=total=total+1;
			i++; //step
		}
		
		System.out.println("1~10까지의 누적합: " + total) ;
	
	}

}
