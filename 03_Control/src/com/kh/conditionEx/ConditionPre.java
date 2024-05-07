package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionPre {
	
	
	/* public static void method1() {
		// 숫자 값 2개를 받아서 숫자 두개가 일치하는지 확인
		 if문 활용
		 Scanner sc = new Scanner(System.in);
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		 같다면 같습니다. 출력
		 같지 않다면 같지 않습니다.
	*/
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("num1의 값을 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("num2의 값을 입력 : ");
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println("두 수는 같습니다.");
			
		} else {
			
		}
			System.out.println("두 수는 같지않습니다.");
			
	}
	
	/*
	 public static void method2(){
	 if문 활용
	 Scanner
	 String str1 = sc.nextLine();
	 String str2 = sc.nextLine();
	 같다면 같음
	 같이 않다면 같지 않습니다.
	 */
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("str1의 값을 입력해주세요 : ");
		String str1 = sc.nextLine();
		System.out.print("str2의 값을 입력해주세요 : ");
		String str2 = sc.nextLine();
		
		if (str1.equals(str2)) {
			System.out.println("같습니다.");
		} else {
			
		}
			System.out.println("같지 않습니다.");
		
	}
	//method3 double 로 실수 2개 값 받아서 실수 두개가 일치하는지 확인 ==
	//최종으로 실행할 메인 메서드
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("number1의 값을 입력 : ");
		double number1 = sc.nextDouble();
		System.out.print("number2의 값을 입력 : ");
		double number2 = sc.nextDouble();
		
		if (number1 == number2) {
			System.out.println("두 값은 같습니다.");
		} else {
			System.out.println("같지 않습니다.");
		}
		
	}
	public static void main(String[] args) {
		//method1();
		//method2();
		method3();
	}

}
