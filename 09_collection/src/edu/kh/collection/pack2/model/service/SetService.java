package edu.kh.collection.pack2.model.service;

import java.util.HashSet;
import java.util.Set;

public class SetService {
	
	/* Set(집합, 주머니)
	 * - 기본적으로 순서를 유지하지 않음
	 *   (index 없음! -> get() 메서드가 없음)
	 * 
	 * - 중복 데이터 저장 X (같은 객체가 들어오면 덮어쓰기)
	 * 
	 * 
	 * Set 인터페이스의 자식 클래스
	 * 
	 * 1. HashSet (대표) : 처리 속도가 빠른 Set
	 * 
	 * 2. LinkedHashSet : 순서를 유지하는 Set
	 * 
	 * 3. TreeSet : 자동 정렬되는 Set
	 * 
	 * */
	
	
	/**
	 * 
	 * HashSet 사용법!
	 * - 사용 조건 1 : 객체에 equals()가 오버라이딩 되어있어야함
	 * - 사용 조건 2 : 객체에 hashCode()가 오버라이딩 되어있어야함
	 * 
	 * -> String, Intefer 등 자바에서 제공하는 객체는
	 *  모두 오버라이딩 되어있는 상태!!
	 */
	public void method1() { 
		
		// HashSet 객체 생성
		Set<String> set = new HashSet<String>(); // 다형성-업캐스팅
//		Set<String> set = new LinkedHashSet<String>(); // 다형성-업캐스팅
		
		
		// 1. boolean add(E e) : 추가
		set.add("네이버");
		set.add("카카오");
		set.add("라인");
		set.add("쿠팡");
		set.add("배달의민족");
		set.add("당근마켓");
		set.add("토스");
		set.add("직방");
		set.add("야놀자");
		
		System.out.println(set); //set.toString()
		// -> HashSet 순서 유지 X 확인
		
		
		// 중복 저장 확인 -> 중복 저장 X
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");

		System.out.println(set);
		
		
		// null : 참조하는 객체가 없음
		
		// null도 중복X 확인
		
		
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);

		System.out.println(set); // null 1회 출력
		
		
		
		// 2. int size() : set에 저장된 객체(참조변수)의 수 반환
		System.out.println("set.size() : " + set.size());
		
		
	}
	

}







//