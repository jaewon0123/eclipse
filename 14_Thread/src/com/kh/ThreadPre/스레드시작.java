package com.kh.ThreadPre;

public class 스레드시작 {
	//main 메서드 생성
	public static void main(String[] args) {
		//스레드연습 출력 = new 스레드연습();
	
		for(int i = 0; i < 2; i++) {
			스레드연습 출 = new 스레드연습(i);
			출.start();
		}
		//for 문으로 스레드 2개 만들기
		//start() 스레드 시작
	//for문 } 닫는 중괄호 밑에 메인메서드 종료 출력 작성 후 실행해보기
		System.out.println("메인 끝");
	}
}
