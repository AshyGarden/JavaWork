package basic; //패키지 선언문, 지우면 안됨

public class IntegerExmaple {

	public static void main(String[] args) {
		
		byte  a = 127;         //1byte = 8 bit -2^7(bit-1) ~ 2^7 (bit-1)-1
		short b = 32767;       //short = 16bit -2^15(bit-1)~ 2^15(bit-1)-1
		int   c = 2147483647;  //int   = 32bit -2^31(bit-1)~ 2^31(bit-1)-1
//		long  d = 2147483648;  //long  = 64bit
		
		//literal value = 변수에 저장되기 전의 상수값 
		//자바의 정수 리터럴은 int이기 때문에 그 범위를 벗어나는 값이면 오류
		//따라서 int범위보다 더큰변수를 표현하기위해서 뒤에 L 추가
		
		long  d = 2147483648L;  //long  = 64bit 
		//숫자 뒤에 "L"or"l"을 붙이면 long으로 인식, 대문자 권장(소문자는 1과 헷갈림)
		
		
		
	}

}
