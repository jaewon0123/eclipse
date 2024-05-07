package com.kh.variable.Pre;

public class EnumPre {
//필드
//enum 무지개 {빨 ~ 보};
	public enum 무지개 {
		빨, 주, 노, 초, 파, 남, 보

	}

	// enum으로 소비자 { 학생, 직장인, 연장자}
	// enum으로 판매자 {소매업, 도매업, 중매업}

//생성자 : 기본
	public EnumPre() {

	}

	enum 소비자 {
		학생, 직장인, 연장자
	}

	enum 판매자 {
		소매업, 도매업, 중매업
	}

//메서드		//빨~보 출력
	public void 메서드1() {

		// 장바구니 = 배열에 담기
		// enum 밑에있는 메서드
		무지개[] 배열 = 무지개.values(); // enum으로 작성한 값을 가지고옴
		// for-each
		for (무지개 무 : 배열) {
			System.out.println(무);
		}
	}

	// void 메서드 2 를 만들어서 소비자와 판매자를 for-each 사용해서 각각 출력
	public void 메서드2() {
		소비자[] 소비 = 소비자.values();
		System.out.println("=== 소비자 ===");
		for (소비자 손님 : 소비) {

			System.out.println(손님);
		}

		판매자[] 판매 = 판매자.values();
		System.out.println("=== 판매자 ===");
		for (판매자 판 : 판매) {

			System.out.println(판);
		}

		소비자 c = 소비자.학생;//0
		System.out.println("학생의 등급 : " + c.ordinal());
		판매자 s = 판매자.소매업;//0
		System.out.println("소매업의 등급 : " + s.ordinal());
		
		if(c.ordinal() > s.ordinal()) {
			System.out.println("소비자의 등급이 더 높습니다.");
		} else if(c.ordinal() == s.ordinal()) {
			System.out.println("소비자와 판매자 등급이 같습니다.");
		} else {
			System.out.println("판매자의 등급이 더 높습니다.");
		}
	}

	// 소비자 학생 판매자 소매업 ordinal() if 문 사용해서 비교하는 문장을 메서드 2 작성
//메인메서드
	public static void main(String[] args) {
		EnumPre ep = new EnumPre();
		// ep.메서드1();
		ep.메서드2();

	}
}
