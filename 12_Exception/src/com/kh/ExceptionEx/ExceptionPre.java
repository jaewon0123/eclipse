package com.kh.ExceptionEx;

public class ExceptionPre {
	public static void main(String[] args) {
		
		//0으로 나누기할 때 if 작성하며 예외처리 발생 방지
		try {
			//예외가 발생할 순 있지만 일단 실행
			int 나누기결과 = 10 / 0;
			
			System.out.println(나누기결과);
			//산수 관련 Exception 		변수명
		} catch(ArithmeticException 산수예외발생) {
			System.out.println("산수 문제가 발생했습니다.");
		}
		
		//try 단축키
		try {
			//예외가 발생할 수 있지만 시도하고 싶은코드 작성
			
			int[] 배열 = {1, 2, 3};
			System.out.println(배열[3]);
		} catch (Exception e) {
			System.out.println("범위를 벗어났습니다.");
		}
		
	}
}
