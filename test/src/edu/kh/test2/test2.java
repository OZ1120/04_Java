package edu.kh.test2;
// 2월 19일 시험
// ArrayList 뭐임


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<IPInfo> ipInfoList	 = new ArrayList<IPInfo>();
		
		ipInfoList.add(new IPInfo("123.123.123.123", "홍길동"));
		ipInfoList.add(new IPInfo("212.133.7.8", "ㅇㅇㅈ"));
		ipInfoList.add(new IPInfo("212.133.7.8", "고길순"));
		
		System.out.print("ip 입력 : ");
		String ip = sc.next();
		
		for(int i=0; i<ipInfoList.size(); i++) {
			if(ipInfoList.get(i) == ip) {
				// ipInfoList의 ip랑 얻어온 ip비교해야되는디
				
			}
		}
//		for(int i=0; i<ipInfoList.size(); i++) {
//			if(ipInfoList.get(i) == ip) {
//				System.out.println(ipInfoList.get(i));
//				break;
//			}
//		}
		System.out.println("일치하는 ip 사용자가 없습니다");
	}
}
