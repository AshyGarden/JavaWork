package basic.loop;

public class BreakExample1 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
		{
			if(i>7)	break;                    //i가 7초과 일때 반복문을 꺠고 탈출
			System.out.print(i+" ");  
		}
		System.out.println("\n반복문 종료");
		
		/*
		 - 내부 반복문에 포함된 brea로 바깥쪽반복문까지 한번에 종료하고싶다면
		   바깥쪽 반복문에 label을 붙인다.
		   break 선언시 label을 함께 선언 
		 */
		
		
		System.out.println("-------------------------------------------");
		outer: for(int i=0; i<=2; i++){ //Label = 반복문 자체에 이름을 붙이고 break시 선언하면 즉시 모든for문탈출  
			for(int j=0; j<=1; j++){          //블록안의 줄이 1줄인경우 중괄호 생략가능
				//if(i == j ) break;          //break가 안쪽 for문만 종료시키고 탈출
				if(i == j ) break outer;      //break가 모든 for문을 종료시키고 탈출
				System.out.println(i+"-"+j);  //바깥쪽은 영향 x
			}
		} //출력이 0-0부터 깨지기에 0-1은 출력x
		
		//      j=0  j=1
		//i=0   0-0  0-1 
		//i=1   1-0  1-1 
		//i=2   2-0  2-1
		
	}

}
