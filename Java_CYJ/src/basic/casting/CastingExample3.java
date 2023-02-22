package basic.casting;

public class CastingExample3 {

	public static void main(String[] args) {
		//서로 타입이 다른 기본데이터의 연산시에는
		//데이터타입이 작은쪽이 큰쪽에 맞춰져서 형변환이 진행된 후 연산이 진행.
		
		char c = 'B'; //66번
		int i = 2;
		
		int  intResult  = c+i; //큰쪽으로 맞춰짐
		char charResult = (char) (c+i);
		
		System.out.println(intResult);  //
		System.out.println(charResult); //68번의 문자
		
		int k = 10;
		double d1 = k/4; //10/4는 int안에서 2가 됨. 따라서 d에 2.0이 삽입됨
		System.out.println(d1);
		
		double d2 = (double) k / 4; //방법1 변수를 double로 끌어올림
		System.out.println(d2);
		
		double d3 = k / 4.0;        //방법2 실수쪽을 double로 literal업
		System.out.println(d3);
		//둘다 double로 바꿔줄 이유가없음 둘중 하나를 바꿔주면 원하는 값이 나옴
		
		//int보다 작은크기의 데이터연산은 자동으로 값이 int로 변환되어 처리(데이터 손실 방지)
		byte b1 = 100;
		byte b2 = 70;	
		System.out.println(b1+b2); //값손상X (JVM이 기본값은 int로 자동변환해줌)
		
		
	}

}
