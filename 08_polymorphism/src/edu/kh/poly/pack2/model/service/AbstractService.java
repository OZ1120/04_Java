package edu.kh.poly.pack2.model.service;

import edu.kh.poly.pack2.model.dto.Animal;

public class AbstractService {
	
	/**
	 * 추상 클래스는 진짜로 객체로 못만들까???
	 */
	public void method1() {
		
		Animal a = new Animal();
		//Cannot instantiate(객체화) the type Animal
		// -> 추상클래스 Animal을 이용해서 객체 생성 불가!!!
		
		
	}
	
	
	
}
