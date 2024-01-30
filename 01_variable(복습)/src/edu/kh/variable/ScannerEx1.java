package edu.kh.variable;


// 스캐너는 자바에서 제공해줌.
// java.util패키지에 존재해서 가져와야됨
import java.util.Scanner;

public class ScannerEx1 {
	
	public static void main(String[] args) {
		
//		Scanner.next()
//		Scanner.nextLine()
//		Scanner.nextInt()
//		Scanner.nextLong()
//		Scanner.nextDouble()
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 1 :");
		int num1 = sc.nextInt(); 

		sc.nextLine();
		
		System.out.print("문장 입력 : ");
		String str = sc.nextLine();
	}

}
