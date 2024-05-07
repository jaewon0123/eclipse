package com.kh.oop.method.ex;

public class HamburgerStore {
	private String name;
	private int price;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public HamburgerStore() {
		
	}
	public HamburgerStore(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void info() {
		System.out.println("햄버거 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("----------------");
	}
	// main
	//1. 기본 생성자 불고기버거 2000
	//2. 필수 생성자 치즈버거 3000
	public static void main(String[] args) {
		HamburgerStore HB = new HamburgerStore();
		HB.setName ("불고기버거");
		HB.setPrice (2000);
		HB.info();
		
		HamburgerStore HB2 = new HamburgerStore("치즈버거", 3000);
		HB2.info();
		
	}
}
