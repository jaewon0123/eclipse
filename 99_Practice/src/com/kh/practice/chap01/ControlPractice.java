package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	public void practice11() {
		//정수를 이용해서 4자리 비밀번호 만들려고 함
		// 4자리 정수를 입력 받아 각 자리 수에 중복되는 값이 없을 경우 '성공'
		// 중복 값이 있으면 '중복 값 있음'
		//자리수가 안맞으면 '자리 수 안 맞음' 출력
		// 단, 제일 앞자리 수의 값은 1~9 사이 정수
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("비밀번호 입력(1000 ~ 9999) : ");
			int password = sc.nextInt();
			//입력된 정수가 4자리인지 확인
			if (password < 1000 || password > 9999) {
				System.out.println("4자리가 아닙니다.");
				System.out.println("자리 수 안 맞음");
				continue;
			} 
			
			//자리값
			int[] digits = new int[4]; //4자리만 허용 0 ~ 3
			digits[0] = password / 1000; //천의자리
			digits[1] = (password / 100) % 10; //백의자리
			digits[2] = (password / 10) % 10; // 십의자리
			digits[3] = password % 10; //일의자리
			// 중복 여부
			boolean isTrue = true;
			//length : 크기
			for (int i = 0; i < digits.length; i++) {
				for (int j = i + 1; j < digits.length ; j++) {
					if (digits[i] == digits[j]) {
						isTrue = true;
						break;
					}
				}
				if(!isTrue) {
					break;
				}
				// 중복 여부에 따른 메세지 출력
				if (!isTrue) {
					System.out.println("중복값이 있음");
				} else {
					System.out.println("비밀번호 생성 성공");
					break; //비밀번호를 최종으로 잘 만들어주면 모두 종료
				}
			}
		}
		
	}
}
