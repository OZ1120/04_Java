package edu.kh.poly.pack1.model.dto;

public class Galaxy extends SmartPhone {
	
	// 안드로이드 운영체제 버전
	private int androidVersion;

	// 기본 생성자
	public Galaxy() {}
	
	// 매개 변수 생성자 자동 완성 + super() 매개 변수 생성자
	// alt [+shift] + s -> o -> 드롭다운에서 부모 생성자 선택 -> Generate
	public Galaxy(String display, String newsAgency, String ap, int androdVersion) {
		super(display, newsAgency, ap);
		this.androidVersion = androdVersion;
	}

	// getter / setter
	public int getAndrodVersion() {
		return androidVersion;
	}

	public void setAndrodVersion(int androdVersion) {
		this.androidVersion = androdVersion;
	}
	
	// toString() 오버라이딩
	@Override
	public String toString() {
		return "Galaxy AndroidVersion : " + androidVersion + " / " + super.toString();
	}
	
	
	
	
	
	
}
