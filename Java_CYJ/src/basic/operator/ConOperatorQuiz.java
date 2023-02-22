package basic.operator;

import java.util.Scanner;

public class ConOperatorQuiz {

	public static void main(String[] args) {
		//42~396사이난수
		//발생난수출력후 홀짝여부 삼항연산자로 출력

//		Scanner sc = new Scanner(System.in);
		
		int randNum = (int) (Math.random() * 355 + 42);
		String result = (randNum%2 == 0 ? "이 숫자는 짝수입니다. " : "이 숫자는 홀수입니다.");
		System.out.println("발생한 난수:" +randNum);
		System.out.println(result);
	}

}
