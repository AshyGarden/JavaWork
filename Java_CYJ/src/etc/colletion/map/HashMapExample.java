package etc.colletion.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		/*
		 # Map
		 - Key/Value가 한세트를 이루는 구조
		 - Key값을 통해 Value를 참조하는 방식
		 - Key는 중복저장을 허용하지 않는다!		  
		 */
		
		//Map은 Key, value쌍을 이루기때문에 멀티제네릭을 설정!
		Map<String, String> map = new HashMap<>();
		
		//Map에 데이터를 추가하는 매서드: put(key, value)
		map.put("멍멍이", "김철수");
		map.put("야옹이", "홍길동");
		map.put("짹짹이", "박영희");
		System.out.println(map);
		
		//Map은 Key의 중복 저장을 허용하지 않습니다.
		//만약 중복 Key를 사용하여 put을 호출하면 Value만 수정됩니다.
		map.put("멍멍이", "김뽀삐"); //key 중복(기존에 있던 value가 수정값으로 바뀝)
		map.put("어흥이", "홍길동"); //value 중복
		System.out.println(map);
		
		//Map 내부에 key의 존재 유무를 확인하는 메서드: ContainsKey(key)
		System.out.println(map.containsKey("메롱이"));

		//Map내부의 값을 참조하는 법: get(key)
		String name = "메뚜기";
		if(map.containsKey(name)) {
			System.out.printf("%s의 별명을 가진 학생은 %s입니다.\n", name, map.get(name));						
		} else {
			System.out.println("그런 별명을 가진 학생은 없어요~");
		}
		
		//map의 크기를 확인하는 매서드 size()
		System.out.println("map의 크기는 " + map.size());
		
		//Map에서 key들만 추출하는 매서드: keySet()
		//모든 key들을 Set에 담아서 반환합니다.
		Set<String> keys = map.keySet();
		
		for(String s: keys) {
			System.out.println(s+":"+map.get(s));
		}
		
		//Map의 객체삭제: remove(key)
		//key를 주면 value도 함께 제거
		map.remove("야옹이");
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
		
	}

}
