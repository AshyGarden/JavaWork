package basic;

public class TextureExample {

	public static void main(String[] args) {
		
		char c1 = 'A';//단일문자 데이터타입
		System.out.println(c1);
		
//		char c2 = 'AB'; //두글자불가
//		char c3 = "A";  //쌍따옴표(")는 string용, char는 무조건 홑따옴표(')
		
		char c4 = 65; //아스키코드에 따라 저장한 값의 문자를 출력,65번 문자는 A
		System.out.println(c4);
		
		char c5 = 97; //아스키코드에 따라 저장한 값의 문자를 출력,97번 문자는 a
		System.out.println(c5);
		
		char c6 = 44032; //가
		System.out.println(c6);
		//문자표 번호 = 음수가 없음
		
		/*
		 # 문자열을 저장할수 있는 데이터타입 String
		 - 저장하고싶은 문자열을 겹따옴표("")에 담아 대입
		 - String은 기본 데이터 타입은 아님!(Class타입)
		   그러나 기본 데이터 타입처럼 사용(사실 객체타입)
		 * */
		
		String s1 = "my dream"; //공백,숫자도 문자취급
		String s2 = "is a Programmer";
		System.out.println(s1);
		System.out.println(s2);
		
		//자바에서는 문자열의 덧셈연산을 지원한다.
		//연산결과로는 문자열을 연결해서 결합한 결과가 도출된다.
		System.out.println(s1 +" "+ s2); 
		
		//문자열과 다른데이터 타입간의 연산
		//결과는 무조건 문자열의 덧셈 연산과 같다.
		
     	System.out.println("--------------------------");
     	
     	System.out.println( 100 + 100);
     	System.out.println("100" + "100");
     	System.out.println("100" + 100);
     	System.out.println( 3.14 + "Phi");
     	
     	int month = 10;
     	int day   = 13;
     	
     	//내 생일은 10월 13일 입니다.
     	System.out.println("내 생일은 " + month + "월 " + day + "일 입니다.");
     	
	}

}
