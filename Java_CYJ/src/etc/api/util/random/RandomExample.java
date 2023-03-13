package etc.api.util.random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		
		Random r = new Random();

		//실수 난수 0.0 <= x < 1.0
		double d = r.nextDouble();
		System.out.println(d);
		
		//정수난수
		int i= r.nextInt(); //int 전 범위
		System.out.println(i);
		
		//0~5 정수난수(끝값이 미만)
		int j = r.nextInt(6); //5까지 나와야하므로 6을 전달!
		
		//10~100까지의 정수 난수
		int k = r.nextInt(91) + 10; //0~90 + 10
		
		boolean flag = r.nextBoolean();
		System.out.println(flag);
		
		
		
		
		
		
		
		
		
	}

}
