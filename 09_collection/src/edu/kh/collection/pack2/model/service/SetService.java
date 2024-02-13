package edu.kh.collection.pack2.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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
		
		
		// 3. boolean remove(E e) : 
		// 전달 받은 e를 Set에서 제거 - 제거 성공 true, 없으면 false
		
		System.out.println(set.remove("배달의민족"));
		System.out.println(set.remove("유플러스"));
		System.out.println(set);
		
		
		// 4. boolean contains(E e) : 
		// 전달 받은 e가 Set에 있으면 true, 없으면 false
		
		System.out.println("쿠팡 있는지 확인 : "+set.contains("쿠팡"));
		System.out.println("삼성 있는지 확인 : "+set.contains("삼성"));
		
		// 5. void clear() : Set에 저장된 내용 모두 삭제
		set.clear();
		
		// 6. boolean isEmpty() : 비어있으면 true, 아니면 false
		System.out.println("비어있음?? : " + set.isEmpty());
		
	}
	
	/**
	 * Set에 저장된 요소(객체)를 꺼내는 방법
	 * 1. Iterator (반복자) 이용
	 * 2. List로 변환
	 * 3. 향상된 for문 이용
	 */
	public void method2() {
		
		Set<String> set = new HashSet<String>();
		
		set.add("몽쉘");
		set.add("꼬북칩");
		set.add("쿠쿠다스");
		set.add("빈츠");
		set.add("포카칩");
		
		// 1. Iterator(반복자)
		// - 컬렉션 객체에 저장된 요소를
		//	 하나씩 순차 접근 하는 객체
		
		// Iterator Set.iterator() : 
		// - 현재 Set을 순차 접근할 수 있는 Iterator 객체 반환
		Iterator<String> it = set.iterator();
		
		// boolean Iterator.hasNext : 
		// 다음 순차 접근할 요소가 있으면 true, 없으면 false
		
		System.out.println("[Iterator]");
		while(it.hasNext()) {
			// 다음 요소가 있으면 반복, 없으면 멈춤
			
			// E Iterator.next() : 다음 요소를 꺼내와 반환
			String temp = it.next();
			System.out.println(temp);
		}
		
		System.out.println("--------------------------------------");
		System.out.println("[List로 변환]");
		
		// Set에 저장된 객체를 이용해서 List를 생성
		List<String> list = new ArrayList<String>(set);
		
		// 일반 for문
		for(int i=0; i < list.size() ;i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("[향상된 for문]");
		
		for(String snack : set) {
			System.out.println(snack);
		}
		
		
	}
	

}







//