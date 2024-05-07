package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressPre {
	//www.google.com 호스트명과 IP주소 가져오기
	public static void main(String[] args) {
		
		try {
			InetAddress 구글 = InetAddress.getByName("www.google.com");
			System.out.println("호스트명 : " + 구글.getHostName());
			System.out.println("IP 주소 : " + 구글.getHostAddress());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//나의 컴퓨터 이름과 자리번호 확인하기
		//getlocalhost
		try {
			InetAddress 내컴터 = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP : " + 내컴터);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// www.facebook.com 페이스북 호스트이름 호스트주소
		try {
			InetAddress 페북 = InetAddress.getByName("www.facebook.com");
			System.out.println("페북 호스트명 : " + 페북.getHostName());
			System.out.println("페북 호스트주소 : " + 페북.getHostAddress());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//www.instagram.com 인스타그램 호스트이름 호스트주소 검색
		
		try {
			InetAddress 인스타 = InetAddress.getByName("www.instagram.com");
			System.out.println("인스타 호스트명 : " + 인스타.getHostName());
			System.out.println("인스타 호스트주소 : " + 인스타.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
