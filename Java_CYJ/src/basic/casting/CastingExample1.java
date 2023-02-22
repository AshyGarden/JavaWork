package basic.casting;

public class CastingExample1 {

	public static void main(String[] args) {
		
		/*
		 - 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할때는
		   자바 가상머신(JVM)이 자동으로 타입을 올려서 변환해줌 (promotion, UpCasting)
		 * */
		
		byte b = 10;
		int i  = b; 
		//타입이 맞지않아도 큰타입이 작은타입을 받는경우는 작은타입을 큰타입으로 변환하여 삽입함.
		System.out.println(i);
		
		char c = 'A'; //char의 아스키코드 값이 65
		int j = c;
		System.out.println("A의 문자 번호:" + j);
		
		int k = 500;
		double d = k;
		System.out.println(d);	
		
	}

}
