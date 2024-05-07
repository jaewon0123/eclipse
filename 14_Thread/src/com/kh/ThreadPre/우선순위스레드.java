package com.kh.ThreadPre;

public class 우선순위스레드 {
	public static void main(String[] args) {
		//for 문으로 1부터 3까지 반복
		for(int i = 0; i <= 3 ; i++) {
			스레드연습 s = new 스레드연습(i);
			
			if(i == 1) {
				s.setPriority(Thread.MAX_PRIORITY);
			} else if(i == 2) {
				s.setPriority(Thread.NORM_PRIORITY);
			} else {
				s.setPriority(Thread.MIN_PRIORITY);
			}
			s.start();
		}
		// 1 ~ 3 까지 차례대로 실행 할 수 있도록 설정
		
	}
}
