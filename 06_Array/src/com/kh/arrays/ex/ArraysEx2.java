package com.kh.arrays.ex;

import java.util.Arrays;

public class ArraysEx2 {

	//기본 생성자
	public ArraysEx2 () {
		
	}
	
	public void method1() {
		//숫자 배열 생성하기
		int[] num = {6,4,2,3,5,7,9};
		
		//숫자 정렬하기 sort
		Arrays.sort(num);
		//정렬된 내용 출력하기 toString()
		System.out.println("정렬된 숫자 : " + Arrays.toString(num));
		//num 배열 복사하기 abc copyOf(num,num.length);
		int abc[] = Arrays.copyOf(num, num.length);
		//num과 abc가 같은지 비교하기 equals(num,abc);
		boolean a = Arrays.equals(num, abc);
		System.out.println("num과 abc는 같은가? : " + a);
		// int[] 채우기 = new int[3];
		int[] 채우기 = new int[3];
		//Arrats.fill을 이용해서 숫자 6으로 모두 채우기
		Arrays.fill(채우기, 6);
		System.out.println(Arrays.toString(채우기));
	}
	
	public static void main(String[] args) {
		ArraysEx2 ae = new ArraysEx2();
		ae.method1();
	}

}
