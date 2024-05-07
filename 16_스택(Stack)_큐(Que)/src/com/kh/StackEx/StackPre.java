package com.kh.StackEx;

import java.util.Stack;

public class StackPre {
	public static void main(String[] args) {
		//Stack 을 활용해서 10 30 50 40 20 을 넣고 push 사용
		Stack<Integer> 스택 = new Stack<>();
		스택.push(10);
		스택.push(30);
		스택.push(50);
		스택.push(40);
		스택.push(20);
		//맨 위 값을 지우고 반환해서 확인
		int 지우기 = 스택.pop();
		System.out.println("지우고 반환 : " + 지우기);
		//현재 맨 위 값 확인
		int 위값 = 스택.peek();
		System.out.println("위 값 : " + 위값);
		//비어있는지 확인
		boolean 유무 = 스택.isEmpty();
		System.out.println("비어있는가 : " + 유무);
		//크기는 몇인지 확인
		int 크기 = 스택.size();
		System.out.println("크기 : " + 크기);
	}
}
