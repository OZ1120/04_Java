package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/* 10회만 반복하며 List에 과일 이름을 추가하고, 
 * 반복이 종료되면 List에 저장된 모든 과일을 출력하는 코드를 작성하였으나 오류 발생 및 정상 수행되지 않았다.
 * 요구사항과 소스 코드를 분석하여 원인(문제점 + 발생 원인), 조치 내용(해결 방법)을 작성하시오.
 *
 * 요구 사항
 * 1. 같은 이름의 과일이 List에 존재하지 않을 때만 추가
 * 2. 같은 이름의 과일이 존재하면 "OOO - 삭제" List에서 제거
 * 3. 10회가 반복되지 않았어도 "END" 입력 시 "입력 종료"가 출력 되면서 반복 종료
 * 
 */
public class Supplement1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		List<String> fruitsList = null;
		List<String> fruitsList = new ArrayList<String>();
		
		for(int i=1 ; i<=10 ; i++) {
//	for(int i=1 ; i<10 ; i++) { ->9바퀴만 돈다
			
			System.out.print(i+"번째 과일 입력 : ");
			String input = sc.next();
			
			//종료 구문
			if(input.equals("END")) {
//		if(input == "END") {
				// String
				System.out.println("입력 종료");
				break;
			}
			
			// 추가구문
			if(!fruitsList.contains(input)) {
				//Null pointer access
				// contains 포함하다
				fruitsList.add(input);
				// 중복 없을 때 추가해라
				continue;
//				continue;
//				fruitsList.add(input);
				// continue 분기문 수행시 다음 반복으로 넘어감.-> 다음 구문 실행 안됨
				// 순서 바꾸기
			}
			
			// 중복 삭제 구문
			int index = fruitsList.indexOf(input);
			fruitsList.remove(index);
			System.out.println(input + " - 삭제");
		}
		
		
		System.out.println("-----------------------");
		for(int i=0 ; i<fruitsList.size() ; i++) {
//			for(int i=0 ; i<fruitsList.length ; i++) {
			// 프루트 리스트는 배열 아니고 컬렉션, size로 변경
			System.out.println(fruitsList.get(i));
//			System.out.println(fruitList[i]);
			// 컬렉션 i번째
		}
		
	}
}
