package com.kh.op;

import java.util.Scanner;

public class OperatorPre {
	//최종 출력해주는 메인 메서드
	public static void main(String[] args) {
		method1();
	}
	//최종으로 출력하는 메서드는 아님
	//내가 필요할 때 꺼내서 사용하는 메서드
	//메서드 : 특정 상태나 기능을 정리해놓은 집합
	
	//static : 고정된 이라는 뜻을 가지고 있음
	// static 이 붙는 것은 자료형이나 변수에 담아서 쓰는게 아니라
	// 단독으로 고정적으로 메모리에서 사용할 수 있음을 나타내는 표현
	
	public static void method1() {
	//public void method1() {
		// 1. int num1 = 10 int num2 = 3
		//int num1 = 10;
		//int num2 = 3;
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 의 값을 입력해주세요 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 의 값을 입력해주세요 : ");
		int num2 = sc.nextInt();
		// 더하기 빼기 곱하기 나누기 결과를 출력하기
		int ad = num1+num2;
		System.out.println("덧셈의 값은 : " + ad);
		
		int sd = num1-num2;
		System.out.println("뺄셈의 값은 : " + sd);
		
		int df = num1*num2;
		System.out.println("곱셈의 값은 : " + df);
		
		int qw = num1/num2;
		System.out.println("나눗셈의 값은 : " + qw);
		
		// 2.double num3 = 2.5 double bum4 = 3.5
		//double num3 = 2.5;
		//double num4 = 3.5;
		Scanner sc1 = new Scanner(System.in);
		System.out.print("num3의 값을 입력해주세요 : ");
		double num3 = sc1.nextDouble();
		System.out.print("num4의 값을 입력해주세요 : ");
		double num4 = sc1.nextDouble();
		
		
		// 더하기 빼기 곱하기 나누기 결과 출력하기
		double kl = num3+num4;
		System.out.println("덧셈의 값은 : " + kl);
		
		double op = num3-num4;
		System.out.println("뺄셈의 값은 : " + op);
		
		double nm = num3*num4;
		System.out.println("곱셈의 값은 : " + nm);
		
		double hj = num3/num4;
		System.out.println("나누기의 값은 : " + hj);
		
	}

}
