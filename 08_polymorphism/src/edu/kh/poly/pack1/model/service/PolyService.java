package edu.kh.poly.pack1.model.service;

import edu.kh.poly.pack1.model.dto.Galaxy;
import edu.kh.poly.pack1.model.dto.Iphone;
import edu.kh.poly.pack1.model.dto.SmartPhone;

public class PolyService {

	/* 다형성 : 다양한 형태를 지니는 성질
	 * 
	 * 1. 상속 관계의 자식 객체의 모습이 여러 모습으로 보임
	 *  -> 자식 객체, 부모 객체, Object 객체 등으로 변하는 것 처럼 보임
	 *  
	 * 2. 오버로딩
	 * -> 같은 클래스에서 같은 이름의 메서드를 여러 번 작성하는 기술
	 * -> 조건 : 매서드명 동일, 매개 변수가 개수, 타입, 순서 하나라도 다름
	 * 
	 * -> 목적 : 전달 받은 매개 변수에 따른 상황별 처리 방법을 구현
	 * 
	 * sum(a,b)    -> 두 수 더하기
	 * sum(a,b,c,) -> 세 수 더하기
	 * sum(배열)   -> 배열 내 요소 모두 더하기
	 * sum(배열, 배열) -> 두 배열 요소 모두 더하기
	 * 
	 *  --> 이름은 sum 하나인데 상황에 따라 처리하는 코드가 
	 *  		변하는 것처럼 보임(이것도 다형성!)
	 * 
	 */
	
	
	/**
	 * 다형성 확인 1
	 * 부모 타입 참조변수 = 자식 객체;
	 *  + 메모리 구조 꼭 같이 확인!!!
	 */
	public void method1() {
		
		// SmartPhone = Iphone / Galaxy
		// -> 원래는 컴퓨터 값 처리 원칙 위배 (자동 형변환 대상X)
		// -> 
		
		SmartPhone s1 = new Iphone();
		SmartPhone s2 = new Galaxy();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}//





















