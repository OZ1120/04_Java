package edu.kh.variable;

public class printEx1 {

	public static void main(String[] args) {
		
		System.out.println("이름");
		System.out.print("이은재");
		System.out.println("입니다");
		System.out.print("사는 곳은 ");
		System.out.println("인계동");
		
		// 최승철은 30세 남성이며 키는 178cm 이다. 세븐틴 멤버인가? : true
		
		String name = "최승철";
		int age = 30;
		char gen = '남';
		int height = 178;
		boolean mem = true;
		
		System.out.printf("%s은 %d세 %c이며 키는 %dcm이다. 세븐틴 멤버인가? : %b", name, age, gen, height, mem);
		
		
	}
}
