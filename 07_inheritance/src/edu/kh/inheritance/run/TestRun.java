package edu.kh.inheritance.run;

import edu.kh.inheritance.model.dto.Child1;
import edu.kh.inheritance.model.dto.Parent;

public class TestRun {
	
	public static void main(String[] args) {
		
		// 부모 객체 Parent 생성
		
		Parent p1 = new Parent(); // 기본 생성자
		Parent p2 = new Parent("김", "서울시 어딘가", 2000, "G80");

		System.out.println("-------------------------------------");
		Child1 c1 = new Child1(); // 자식1 기본 생성자
		
	}
}
