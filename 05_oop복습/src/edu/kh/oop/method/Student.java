package edu.kh.oop.method;

public class Student {
	
	public static String schoolName ="매원고등학교";
	
	public static final int MIN_VALUE=0;
	public static final int MAX_VALUE=100;
	
	private String name;
	private String studentNumber;
	private char gender;
	private int java;
	private int html;
	
	//생산자
	public Student() {}
	
	public Student(String name, String studentNumber, char gender) {
		this.name = name;
		this.studentNumber = studentNumber;
		this.gender = gender;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setJava(int java) {
		this.java = java;
	}
	
	public void setHtml(int html) {
		this.html= html;
	}
	
	
	public String getName() {
		return name;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public char getGender() {
		return gender;
	}
	public int getJava() {
		return java;
	}
	public int getHtml() {
		return html;
	}
	
	
	
	
	
	
	

}
