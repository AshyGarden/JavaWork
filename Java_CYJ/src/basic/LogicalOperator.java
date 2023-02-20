package basic;

public class LogicalOperator {

	public static void main(String[] args) {
		
		// 비교(관계)연산자(<,>,>=,<=.==(같다),!=(같지않다)

		//좌학과 우항의크기를 비교하여, 결과값으로 항상 논리형 타입의 값을 도출합니다.
		int x  = 10, y=20;
		
		System.out.println(x!=y);
		
		/*
		 #논리 연산자(&,&&,|,||)
		 -좌항과 우항의 논리값을 연산하여 하나의 논리값 도출
		 1.&,&&: 양쪽 항의 논리값이 모두 true일경우에만 true
		 2.|,||: 양쪽항의 논리값중 한쪽만 ture여도 true
		 우항의 연산을 진행하지 않는다.
		 */
		//
		
		System.out.println(x>10 && (y/0 == 10));
		System.out.println(x>10 || ( y<30 ));
		
		//논리반전연산자(!:단항연산자)
		//단순히 논리값을 반전시킨다.
		//true->false, false->true
		
		int z =10;
		System.out.println(z == 10);
		System.out.println(!(z == 10));
		
		

	}
	
}
		
				