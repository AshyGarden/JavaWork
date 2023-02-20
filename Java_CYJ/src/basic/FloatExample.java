package basic;

public class FloatExample {

	public static void main(String[] args) {

		//실수 리터럴의 기본데이터타입은 double이다.
		float f1 = 7.12345f; //double을 float으로 변환할수 없다. 뒤에f를 덧붙임
		double d1 = 7.12345; 
		
		/////////////////////////////
		float f2 = 1.234567891234f; //소수점 7자리 까지만 표시
		double d2 = 1.234567891234; //소수점 15자리까지만 표시
		
		System.out.println(f2);
		System.out.println(d2);
		
	}

}
