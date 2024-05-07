package com.kh.oop.basic;

public class Animal { //동물
	
	//1.필드 이름 String name 나이 int age
	public String name;
	public int age;
	public String 정보;
	//2. 초기 생성자
	public Animal() {
		
	}
	//3. 필수 생성자 이름 , 나이
	public Animal(String 이름, int 나이,String 특이점) {
		this.name = 이름;
		this.age = 나이;
		this.정보 = 특이점;
	}
	//4. 출력 메서드 public void info(){ System.out.println 이름 나이 출력}
	public void info() {
		System.out.println("이름 : " + name
						+ "\n 나이 : " + age
						+ "\n 정보 : " + 정보);
	}
	//5. 메인 메서드 
	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.name = "뽀삐";
		dog.age = 3;
		dog.정보 = "우리 애 물어요.";
		dog.info();
		
		Animal cat = new Animal("고냥이",3,"사람을 잘 따라요.");
		cat.info();
	}
	// 1) 초기생성자로 
		// Animal dog = new Animal();
		// 강아지 이름 나이
		// 강아지 정보 출력
	// 2) 필수 생성자로
		// Animal cat = new Animal("고양이", 3);
		// 고양이 정보 출력
}
