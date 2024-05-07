package com.kh.QuequeEx;

import java.util.LinkedList;
import java.util.Queue;

public class QuequePre {
	public static void main(String[] args) {
		//offer 80 60 30 20
		Queue<Integer> 큐 = new LinkedList<>();
		큐.offer(80);
		큐.offer(60);
		큐.offer(30);
		큐.offer(20);
		//poll 데이터 확인 및 제거
		int 제거 = 큐.poll();
		System.out.println(제거);
		//peek 맨 앞 데이터 확인
		int 데이터 = 큐.peek();
		System.out.println("맨 앞 데이터 : " + 데이터);
		//isEmpty 비어있는지 확인
		boolean 확인 = 큐.isEmpty();
		System.out.println("비어있나요?" + 확인);
	}
}
