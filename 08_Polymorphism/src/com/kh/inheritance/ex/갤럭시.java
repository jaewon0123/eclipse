package com.kh.inheritance.ex;
//extends 스마트폰 상속받기
public class 갤럭시 extends 스마트폰 {
//필드
	private int 안드로이드;
	
	//메서드
	//Setter
	public void set안드로이드(int 안드로이드) {
		this.안드로이드 = 안드로이드;
	}
	//Getter
	public int get안드로이드() {
		return 안드로이드;
	}
	//생성자 : 기본
	public 갤럭시() {

	}
	//생성자 : 필수 alt + shift + s    o
	public 갤럭시(int 안드로이드) {
		super();
		this.안드로이드 = 안드로이드;
	}
	
	//@Override toString  alt shift s  s
	@Override
	public String toString() {
		return "안드로이드 버전 : " + 안드로이드 + " / " + super.toString();
	}

	
	
}
