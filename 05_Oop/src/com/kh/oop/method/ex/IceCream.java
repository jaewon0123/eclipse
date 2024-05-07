package com.kh.oop.method.ex;

public class IceCream {
	//필드
	private String name;
	private int suger;
	private boolean milk;
	//메서드
	public void setName(String name) {
		this.name = name;
	}
	public void setSuger(int suger) {
		this.suger = suger;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	
	public String getName() {
		return name;
	}
	public int getSuger() {
		return suger;
	}
	public boolean isMilk() {
		return milk;
	}
		//생성자 : 기본
	public IceCream() {
		
	}
		//생성자 : 필수 이름 설탕 우유 유무
	public IceCream(String name, int suger, boolean milk) {
		this.name = name;
		this.suger = suger;
		this.milk = milk;
	}
		//void makeIceCream(){ 아이스크림 만들고 이름 설탕 우유 유무 출력
	public void makeIceCream() {
		System.out.println("아이스크림을 만듭니다.");
		System.out.println("이름 : " + name);
		System.out.println("설탕 : " + suger);
		System.out.println("우유 유무 : " + milk);
		//우유는 추가 하면 우유 추가
				//우유 미추가하면 우유 미추가
		if(milk) {
			System.out.println("우유 추가");
		} else {
			System.out.println("우유 미추가");
		}
	}	
		//IceCreamRun -> 메인메서드
}
