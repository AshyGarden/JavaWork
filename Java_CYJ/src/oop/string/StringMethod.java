package oop.string;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		
		String str = "Hello Java"; //str2가 str1의 값과 주소를 공유하게됨
		String str2 = "Hello Java";

		System.out.println(str == str2);
		
		//charAt(index): 문자열인덱스에 따른 단일문자반환
	
		char c =str.charAt(4);
		System.out.println("4번 인덱스: " + c);
		//subString(begin, end) : 문자열을 범위지정하여 추출
		
		String ss1 = str.substring(1,5); //1번이상 5번"미만"!
		System.out.println("ss1: "+ss1);
		
		String ss2 = str.substring(6);//6벝부터 끝까지 추출
		System.out.println("ss2: " + ss2);
		
		//length(): 문자열의 총 길이 반환
		int len = str.length();
		System.out.println("len: "+ len);
		
		//indexOf(str): 해당 문자가 있는 인덱스를 반환, 해당문자가 존재하지않으면 -1을 리턴, 앞에서부터탐색
		int idx1 = str.indexOf("1");
		System.out.println("idx: "+idx1);
		
		int idx2 = str.lastIndexOf("1"); //indexOf(str): 해당 문자가 있는 인덱스를 반환(뒤에서부터 탐색)
		System.out.println("idx2: "+ idx2);
		
		int idx3 = str.lastIndexOf("java"); //시작 인덱스를 반환
		System.out.println("idx3: "+ idx3);
		
		
		//일괄 대/소문자 변경
		String str3 = "HeLLo worLd";
		String lower = str3.toLowerCase();
		System.out.println(str3);
		String upper = str3.toUpperCase();
		System.out.println(str3);
		
		 //trim(): 문자열의 앞, 뒤 공백을 제거
	    String name = "				홍길동              ";
	    System.out.println(name.trim() + "님 안녕하세요~!");
	    
		//replace(old, new)
	    //: 기존 문자열 내부의 old값을 모두 찾아서 new 문자열로 일괄 변경.
	    String java = "자바는 재밌습니다. 자바 커피는 맛있습니다.";
	    System.out.println(java.replace("자바", "Java"));
	    System.out.println(java.replace("습니", ""));
		
	    //split: 문자열을 구분자로 구분하여 분할, 분할된 문자들은 String배열로 담아서 리턴
	    String phone = "010-1234-5678";
	    String[] numbers = phone.split("-"); //무엇으로구분
	    System.out.println(Arrays.toString(numbers));
	    
	    String pet = "멍멍이, 야옹이, 짹짹이";
	    String[] pets = pet.split(", "); //무엇으로구분
	    System.out.println(Arrays.toString(pets));
	    
	    System.out.println("-------------------------------------");
	    
	    //문자열의 정수/실수 변환
	    String s1 = "100";
	    String s2 = "3.14";
	    
	    int i = Integer.parseInt(s1); //문자열->정수
	    double d = Double.parseDouble(s2); //문자열->실수
	    System.out.println( i + d );
	    
	    //valueOf: 기본타입을 문자열로 변경
	    System.out.println(3+4);
	    System.out.println(String.valueOf(3)+String.valueOf(4));
	    
	    
	    
	}

}
