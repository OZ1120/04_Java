package edu.kh.collection.pack1.model.service;

import java.util.List;
import java.util.ArrayList;

// 컬렉션 프레임워크 : Java에서 자료구조를 만들어서 모아둔 것
// (java.util에 있음)

// 특징
// 1) 크기 제한 없음 (부족하면 자동으로 증가)
// 2) 추가, 수정, 삭제, 검색 등 다양한 기능이 구현되어 있음
// 3) 객체만 저장 가능
//   (기본 자료형은 안됨.... 하지만 Wapper 클래스를 이용하면된다!)


public class ListService {
	
	// List : 자료를 순차적으로 나열한 자료 구조(배열 비슷)
	// - 인덱스가 존재함
	//  -> 인덱스로 순서가 구분되기 때문에 중복 데이터 저장 가능
	
	/**
	 * List 사용 해보기
	 */
	public void method1() {
		
		// List 객체 생성
		// - List (인터페이스) -> 객체 생성 불가 -> 다형성 이용
		// - ArrayList (클래스) (List의 후손)
		
//		List list = new ArrayList(); // 10칸 짜리 생성
		
		List list = new ArrayList(3); // 3칸 짜리 생성
		
		
		//    반환형  메서드명(매개변수)
		
		// E(Element) : 요소를 뜻하는 상징적인 글자 (자료형X)
		//						== Object, String, Sutdent 등
		//							 자료형 가리지 않고 들어갈 수 있다
		
		// 1. boolean add(E e) : 마지막 요소로 추가
		list.add("아무거나");
		list.add(new Object());
		list.add(123123);
		
		list.add(3.123123); // 크기 3 초과 했을 때 오류 발생 확
		list.add(false); // 
		
		System.out.println(list);
	}
	
	
	

}
