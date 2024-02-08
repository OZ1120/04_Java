package edu.kh.poly.pack3.model.dto;

//인터페이스는 다중 상속이 가능하다

//각자 구현한 게산기

public class LEJCalculator implements Calculator, Machine {

	@Override
	public int plus(int a, int b) {
		int result = a+b;
		return  result;
	}

	@Override
	public int minus(int a, int b) {
		return a-b;
	}

	@Override
	public int multi(int a, int b) {
		return a*b;
	}

	@Override
	public double div(int a, int b) {
		if(b==0) return 0.0;
		return (double)a/b;
		
//		return b == 0 ? 0.0 : (double)a/b;  // 삼항연산자
	}

	@Override
	public int mod(int a, int b) {
		return a%b;
	}

	@Override
	public int sum(int... numbers) {
		
		// 가변인자(...) : 전달 인자의 개수 (전달 되는 값의개수)가
		//								변할수 있는 매개 변수(전달 인자)
		
		// -> printf()가 가변인자 사용의 가장 대표적인 예시
		
		// numbers는 int[] 타입
		int sum=0;
		for(int i : numbers) {
			sum +=i;
		}
		return sum;
	}

	@Override
	public double areaOfCircle(double r) {
		return Calculator.PI * r * r;
	}

	@Override
	public boolean rangeCheck(int num) {
		return num >=Calculator.MIN_NUM && num<=Calculator.MAX_NUM;
	}

	@Override
	public int pow(int a, int x) {
		// 방법1)
		int result = 1;
		for(int i=0 ; i<x ; i++) result *= a;
		return result;

		// 방법 2)
//		return (int)Math.pow(a, x);
	}

	@Override
	public String toBinary(int num) {
		return Integer.toBinaryString(num);
	}

	@Override
	public String toHexadecimal(int num) {
		return Integer.toHexString(num);
	}

	@Override
	public void powerOn() {
		System.out.println("계산기 온");
	}

	@Override
	public void powerOff() {
		System.out.println("계산기 오프");
	}
}
