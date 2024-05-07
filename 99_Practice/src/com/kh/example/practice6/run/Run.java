package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		System.out.println("kh서점에 오신 것을 환영합니다.");
		
		Book Bk0 = new Book();
		Bk0.title = "그것이 알고싶다.";
		Bk0.author = "박진아";
		Bk0.publisher = "SBS";
		Bk0.inform();
				
		Book Bk1 = new Book("5월 32일", "kh T반", "T반 단체일동");
		Bk1.inform();
		
		Book Bk2 = new Book("Do it! 자바 프로그래밍 입문", "이지스퍼블리싱",
						"박은종", 16500, 0.34);
		Bk2.inform();
		
	}

}
