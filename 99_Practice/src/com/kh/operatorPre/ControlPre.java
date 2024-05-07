package com.kh.operatorPre;

import java.util.Scanner;

public class ControlPre {
	
	
	/*
	 1 ~ 12 사이의 수를 입력받아 해당 달의 일수를 출력하세요.
	 2월 윤달은 생각하지 않습니다.
	 OO월은 잘못 입력한 달입니다.
	 * */
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1월부터 12중 하나 입력 : ");
		int month = sc.nextInt();//키보드로 입력한 달
		
		int daysMonth; // 해당하는 달의 일수
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			daysMonth = 31;
			break;
		case 4: case 6: case 9: case 11:
			daysMonth = 30;
			break;
		case 2:
			daysMonth = 28;
			break;
		default:
			System.out.println(month + "월은 존재하지 않는 달입니다.");
			//daysMonth = 0;
			return;
		}
		System.out.println(month + "월은 " + daysMonth + "일까지 있습니다.");
		
	}

	
	public static void practice5() {
		//중간 기말 과제 출석 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 점수 : ");
		double mid = sc.nextDouble();
		System.out.print("기말 점수 : ");
		double fin = sc.nextDouble();
		System.out.print("과제 점수 : ");
		double assig = sc.nextDouble();
		System.out.print("출석 횟수 : ");
		int attend = sc.nextInt();
		
		// 출석 비율 계산 20회
		double attendPer = (double) attend / 20 * 100;
		// attend / 20 = 출석한 횟수를 전체 강의 횟수로 나눠서 출석 비율을 계산
		// double 소수점 밑에 있는 수까지 얻어옴
		// 실수로 된 값을 100을 곱해서 백분율로 변환
		
		// 평가 비율에 따른 총점 계산
		// 중간 20 기말 30 과제 30 출석 20 = 100점
		// 중간 점수 20
		double midScore = mid * 0.2;
		//기말 점수 30
		double fiScore = fin * 0.3; //100점 만점 30%
		// 과제 점수 30
		double asScore = assig * 0.3;
		/*  20 * 100 이랑 * 0.2 한 것은 똑같다.  */
		double attendScore = attendPer * 0.2;
		double totalScore = midScore + fiScore + asScore + attendScore;
		
		// 평가에 따른 Pass 또는 Fail 출력
		if (totalScore >= 70 && attendPer >= 70) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		System.out.println("===== 결과 =====");
		System.out.println(" 중간고사 점수 (20점 만점) : " + midScore);
		System.out.println("기말고사 점수 (30점 만점) : " + fiScore);
		System.out.println("과제 점수 (30점 만점) : " + asScore);
		System.out.println("출석 점수 (20점 만점) : " + attendScore);
		System.out.println("총 점" + totalScore);
	}
	
	
	
	
	public static void main(String[] args) {
		
		//practice5();
		practice3();
	}

}
