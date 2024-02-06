package edu.kh.inheritance.model.dto;

public class Parent {
	
	public String lastName = "홍";   // 성
	protected String address = "서울시 중구 남대문로 120"; // 주소

	private int money = 100_000_000; // 1억
	private String car = "그랜져";
	
	
	// 기본 생성자
	public Parent() {
		System.out.println("기본 생성자로 부모 객체 생성됨");
	}
	
	
	// 매개 변수 생성자
	public Parent(String lastName, String address, int money, String car) {
		this.lastName = lastName;
		this.address = address;
		this.money = money;
		this.car = car;
		
		System.out.println("매개 변수 생성자로 부모 객체 생성됨");
	}
	
	
	// money의 getter/setter
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	// car의 getter/setter
	public String getCar() {
		return car;
	}
	
	public void setCar(String car) {
		this.car = car;
	}
	
	
	// 현재 객체의 필드를 문자열로 반환하는 메서드
	public String inform() {
		return String.format("%s / %s / %d / %s", lastName, address, money, car);
	}
	
	
	
	
}
