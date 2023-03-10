package etc.api.lang.stringbuilder;

public class StrBuilderExample {

	public static void main(String[] args) {
		
		/*
		 #String 클래스의 단점
		 
		 -string 클래스는 아주많이쓰이고 좋은기능들을 많이가지고있지만 메모리를 과소비하는 단점이 있습니다.
		  
		 -string 객체는 처음초기화딘 데이터에 변화는 주어야 하는 상황에서 기존객체를 활용하지않고 새 객체를 계속해서 생성 
		  
		  
		 #StringBuilder ,StringBuffer(자바5버전 부터 사용가능)
		 -String 클래스 단점으로 인한 메모리 과부하 미 속도가 느려지는 현상을 개선하기위해서 StringBuilder가 새롭게 추가
		 
		 -StringBuilder ,StringBuffer는 매서드가 동일함
		 StringBuilder - 단일스레드
		 StringBuffer - 다중 스레드에서 문자열을 공유해야할 때
		 */
		
		String str = "hello";
		System.out.println("str의 주소값: "+ str.hashCode());
		
		str = "hello world";
		System.out.println("str의 주소값: "+ str.hashCode());
				
		str = "hello~!";
		System.out.println("str의 주소값: "+ str.hashCode());
		
		System.out.println("---------------------------------------");
		StringBuilder sb = new StringBuilder("hello"); //객체를 바꾸지않음
		System.out.println(sb);
		System.out.println("sb의 주소값: " + sb.hashCode());
		
		//문자열을 맨 끝에 추가하는 매서드 append(문자열)
		sb.append(" world");
		System.out.println(sb);
			
		//문자열을 특정 인덱스에 삽입하는 메서드 insert(인덱스, 삽입할 문자열)
		sb.insert(6, "my ");
		System.out.println(sb);
		
		//특정 인덱스 범위의 문자열을 교체하는 매서드:replace(begin, end, 문자열)
		sb.replace(6, 8 , "your");
		System.out.println(sb);
		
		//문자열 내의 특정단어 삭제매서드 delete(begin, end(미만))
		sb.delete(6, 11);
		System.out.println(sb);
		
		//문자열 역순배치 reverse();
		sb.reverse();
		System.out.println(sb);
		System.out.println("sb의 주소값: " + sb.hashCode());
	}
}
