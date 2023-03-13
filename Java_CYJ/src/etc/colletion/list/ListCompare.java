package etc.colletion.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCompare {

	public static void main(String[] args) {
		
		/*
		 ArrayList는 탐새구 객체를 참조하는 경우에 유리
		 LinkedList는 찾은 삽입/삭제등으로 리스트의 크기가 변할떄 유리
		 사이즈가 크지않다면 크게차이는 없다. 
		 */
		
		
		
		List<Integer> array = new ArrayList<>();
		List<Integer> linked = new LinkedList<>();
		
		for(int i=0; i<1000000; i++) {
			array.add(i);
			linked.add(i);
		}
		
		long start, end;
		start = System.currentTimeMillis();
	
		//배열리스트에서 데이터 제어
		for( int i=0; i<array.size(); i++) {
//			array.remove(0); //374ms
			array.get(i); //2ms
		}
		
		end = System.currentTimeMillis();
		System.out.printf("배열 리스트의 소요시간: %dms\n", end - start);
		
		//연결리스트에서 데이터제어
		start = System.currentTimeMillis();
		for( int i=0; i<linked.size(); i++) {
//			linked.remove(0); //
			linked.get(i); //
		}
		
		end = System.currentTimeMillis();
		System.out.printf("연결 리스트의 소요시간: %dms\n", end - start);
		
		
	}

}
