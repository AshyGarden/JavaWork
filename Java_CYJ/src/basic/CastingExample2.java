package basic;

public class CastingExample2 {

	public static void main(String[] args) {
		
		/*
		 -크기가 큰 데이터 타입을 값을 작은 데이터 타입으로 변환하려면
		 반드시 형 변환 연산자: (type)를 사용하여 명시적으로 형변환을 해줘야함
		 (DownCasting)
		 
		 -명시적으로 형변환을 해줘야하는이유
		 DownCasting의경우 저장공간이 줄어들어 데이터손실의 가능성이 항상 존재하기때문
		 (overflow, underflow가능성 존재)
		 */
		
		int i = 72;
		char c = (char) i; //들어가려는 쪽의 타입을 값 앞에 붙여줌
		System.out.println("72의 문자값:" + c);

		double d = 4.98765;
		int j = (int) d;
		System.out.println(j); //정수형값은 4만 남기고버려짐
		
		int k = 1000;
		byte b = (byte) k;
		System.out.println(b); //-24 = 2진수 표현시 1111 1110의 값
		
		
	}

}
