package com.kh.oop.basic;

public class Bank {
	// 이름 계좌번호 잔액 비밀번호 마케팅수신동의
	public String name;
	public String accountNumber;
	public int dalance;
	public String password;
	public boolean agree;
	//boolean 기본값 false
	//생성자 메서드 
	// 1. 필수가 아닌 생성자
	public Bank() {
		
	}
	// 2. 필수인 생성자 이름 계좌번호 잔액 패스워드
	public Bank(String 이름, String 계좌, int 잔액, String 비밀번호) {
		this.name = 이름;
		this.accountNumber = 계좌;
		this.dalance = 잔액;
		this.password = 비밀번호;
	}
	// 3. 출력 메서드
	public void info() {
		System.out.println("이름 : " + name);
		System.out.println("계좌번호 : " + accountNumber);
		System.out.println("잔액 : " + dalance);
		System.out.println("비밀번호 : " + password);
		System.out.println("마케팅수신동의 : " + agree);
	}
	
	//4. 최종 메인 출력 메서드
	public static void main (String[]args) {
		//1. 조 씨 은생 통장 ok
		Bank customer1 = new Bank();
		customer1.name = "Jor";
		customer1.accountNumber = "111-222-3333";
		customer1.dalance = 123;
		customer1.password = "0000";
		customer1.agree = true;
		
		customer1.info();
		
		// 2. 던 씨 은행 통장 수신동의 실수로 안함
		Bank customer2 = new Bank();
		customer2.name = "dan";
		customer2.accountNumber = "111-110-1234";
		customer2.dalance = 1000;
		customer2.password = "1234";
		//수신동의를 해야하는데 수신동의를 안하고 바쁘다고 가버림
		customer2.info();
		
		
		//3. 필수 생성자를 활용해서 마이클 씨의 은행 통장
		//이름 계좌번호 잔액 비밀번호 를 입력하고
		//마케팅 수신동의를 true 변경해서 출력하기
		Bank customer3 = new Bank("마이클", "123-456-789", 456, "5678");
		
		customer3.agree = true;
		customer3.info();
		
		//4. 마이클 조던 출력하기
		Bank customer4 = new Bank("마이클 조던", "111-234-1122", 790, "1221");
		customer4.agree = true;
		customer4.info();
	}
}
