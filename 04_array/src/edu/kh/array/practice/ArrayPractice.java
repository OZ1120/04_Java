package edu.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);
	
	
	public void practice1() {
		
		//길이가 9인 배열을 선언 및 할당하고,
		int[] arr = new int[9];
		
		//1부터 9까지의 값을 반복문을 이용하여
		//순서대로 배열의 각 인덱스 요소에 대입
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			// 출력
			System.out.print(arr[i] +" ");
		}
		// 짝수 번째 인덱스 값의 합을 출력하세요
		// (0 번째 인덱스는 짝수로 취급)
		
		int sum = 0;
		
		for(int i=0; i<=9; i++) {
			
			if(i%2 == 0) {
				sum += arr[i];
			}
		}
		
		System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	}
	
	
	public void practice2(){
		int[] arr = new int[9];
		
		for(int i=arr.length-1; i>=0; i--) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
		int sum = 0;
		
		for(int i=8; i>=0; i--) {
			if(i%2==1) {
				sum+=arr[i];
			}
		}
		System.out.println("\n홀수 번째 인덱스 합 : " + sum);
	}
	
	
	public void practice3() {
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[]arr = new int[input];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
	}// method3
	
	public void practice4(){
		
		int[]arr = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.print("입력 "+i+ ": ");
			arr[i] = sc.nextInt();
		}
			System.out.print("검색할 값 : ");
			int num = sc.nextInt();
			
		for(int i=0; i<5; i++) {
			if(num !=arr[i]) {
				System.out.print("일치하는 값이 존재하지 않습니다");
			}else {
				System.out.print("인덱스 : " + i);
			}
		}
	} //practice4
	
	
	public void practice5(){
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[]arr = new int [num];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arr[i]= sc.nextInt();
			
			
		}
		int sum =0;
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			System.out.println("총 합 : " + sum);
		}
		
		
	}//practice5
	
	public void practice6() {
		
	}// practice6
	
}// end
