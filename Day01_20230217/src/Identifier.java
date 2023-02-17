
public class Identifier {
	//식별하다 = 분별하여 알아보다
	
	public static void main(String[] args) {
		//꼭 지켜야 할 규칙(안 지킬시 에러가 발생할수 있습니다.)
		//1. 식별자의 이름은 중복을 허용하지 않습니다.
		//그리고 대소문자를 철저하게 구분합니다.
		
		int age = 35;
//		int age = 40;(x)
		int Age = 40;
		System.out.println(age);
		System.out.println(Age);
		
		//2. 식별자 이름은 숫자로 지정하거나 숫자로 시작하시면 안됩니다.
//		int 700 = 365;   (x) 변수는 숫자만으로이루어질수없음
//		int 7number = 7; (x) 변수시작은 숫자 불가능
		int number7 = 7;
		int num7ber = 7;
		
		//3. 식별자 이름에 공백을 포함할수 없습니다.
//		int my birthday = 19921013; (x)
		int mybirthday = 19940206;  
		int myBirthDay = 19940206;  //연결단어의 첫글자를 대문자(camel case)
	    
	    //4. 식별자 이름에 쓸수있는 특수문자는 밑줄(_), 달러기호($)뿐이다.
		//하지만 사용을 권장하지않음
	    //저 특수문자들은 사용하기로 약속한 곳이 지정되어있습니다.
		
		String $hello = "안녕"; //가능은 함 
		
		//5. 키워드(예약어)는 식별자 이름으로 사용이 불가능합니다.
		//키워드는 이미 어떠한 기능을 내포하고 있는 지정문자입니다.
		//ex) int, static, void 등등
		
//		String class = "클래스";       (x)
		String Class = "클래스";     //(o) 권장하지 않음
		String className = "클래스"; 
		
		//6. 한글이나 한자같은 식별자 이름도 지정가능
		//하지만 사용을 권장하지않음
		int 숫자 = 7;
		String 名 = "홍길동";
	    System.out.println(숫자);
	    System.out.println(名);
	    int sutja = 10; //콩글리시 자제
	    
	    
	    
	
	}

}
