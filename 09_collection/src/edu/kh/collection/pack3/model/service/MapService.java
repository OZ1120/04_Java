package edu.kh.collection.pack3.model.service;

import java.util.HashMap;
import java.util.Map;

public class MapService {
	
	/* Map : 특정 키워드(Key)를 입력하면
	 * 			 해당되는 상세한 값(Value)를 얻을 수 있는 컬렉션 객체
	 * 
	 * - K:V 형식으로 구성
	 * 
	 * - K:V 한 쌍을 "Entry" 라고 부름
	 * 
	 * - Key : 키워드 역할(== 변수명)
	 * 1) 중복 X
	 *  -> 중복되는 Key 입력 시 Value를 덮어씌움
	 *  -> Key 역할의 객체는 hashCode(), equals() 오버라이딩 필수!
	 *  
	 * 2) 순서 유지 X (단, LinkedHashMap 제외)
	 * 
	 * * Key만 묶어서 보면 Set과 같은 특징을 지니고 있음!
	 *  -> Map.keySet() / Map.EntrySet() 제공
	 * 
	 * 
	 * Value : 키워드에 해당하는 상세한 값
	 * 
	 * - Key로 인해서 모든 Value가 구분됨
	 *  -> Map.get(Key)/ Map.remove(Key) 형태로 사용
	 * 
	 */

	
	
	public void method1() {
		
		// HashMap 생성
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// 1. V put(K k, V v) : Map에 추가
		// - Map에 추가 시 
		// 	 중복되는 Key가 없으면 null
		//	 중복되는 Key가 있으면 이전 Value 반환
		
		System.out.println(map.put(1, "에그마요"));
		System.out.println(map.put(2, "로티세리바베큐"));
		System.out.println(map.put(3, "스테이크앤치즈"));
		System.out.println(map.put(3, "스파이시쉬림프")); // 3중복
		
		System.out.println(map);
		
		
		// 2. V get(K K) : Key에 해당되는 Value 반환
		// 								일치하는 Key가 없으면 null 반환
		
		System.out.println("-----------------------------------");
		System.out.println( map.get(1)); // 에그마요
		System.out.println( map.get(0)); // null
		
		String temp1 = map.get(2); // "로티세리바베큐"
		System.out.println(temp1);
		
		
		// 3. int size() : Map에 저장된 Entry(K:V)의 개수
		System.out.println("size :" + map.size()); // 3
		
		
		// 4. V remove(K K)
		// - Key가 일치하는 Entry를 제거
		// - 일치하는 Key가 있다면 Value, 없다면 null 반환
		
		System.out.println("-------------------------------------");
		System.out.println("remove(2) : "+ map.remove(2));
		System.out.println("remove(5) : "+ map.remove(5));
		System.out.println(map);
		
		
		// 5. void clear() : 모든 Entry 삭제
		// 6. boolean isEmpty() : 비어있는지 확인
		
		System.out.println("clear() 전 isEmpty() : "+ map.isEmpty());
		
		map.clear();
		System.out.println("clear() 후 isEmpty() : "+ map.isEmpty());
		
		
		
	}
	
	
	
	
}//









