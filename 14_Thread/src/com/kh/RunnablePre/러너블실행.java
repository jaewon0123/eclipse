package com.kh.RunnablePre;

public class 러너블실행 {
//main 메서드 생성
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			러너블연습 r = new 러너블연습(i);
			Thread 스레드 = new Thread(r);
			스레드.start();
		}
		System.out.println("메인 메서드 종료");
	}
	//for 문으로 스레드 5개 만든 후
	
	//for문을 탈출하면 메인메서드 종료일까요? 라고 출력
}
