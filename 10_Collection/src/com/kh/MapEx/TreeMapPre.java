package com.kh.MapEx;

import java.util.TreeMap;

public class TreeMapPre {
	public static void main(String[] args) {
		/*
		 tmp
		 String,String 으로
		 "apple","사과"
		 banana 바나나
		 orange 오렌지
		 grape 포도
		 watermelon 수박
		 
		 [] for문을 활용해 추가
		 
		 전체출력
		 get사용해서 banana에 해당하는 값 가져오기
		 size크기확인
		 isEmpty 비어있는지
		 containsKey 키가 존재하는지 grape
		 containsValue 키가 존재하는지 포다
		 keySet() 모든 키 출력
		 values() 모든 값 출력
		 firstKey() 첫번째 키 lastKey() 마지막키 출력
		 clear		 		 
		 */
		TreeMap<String,String> tmp = new TreeMap<>();
		
		String[] key = {"apple", "banana", "orange", "grape", "watermelon"};
		String[] values = {"사과", "바나나", "오렌지", "포도", "수박"};
		
		for(int i = 0; i < key.length; i++) {
			tmp.put(key[i], values[i]);
		}
		
		System.out.println(tmp);
		
		System.out.println("banana 값 : " + tmp.get("banana"));
		
		System.out.println("크기 : " + tmp.size());
		
		System.out.println("비어있는가 : " + tmp.isEmpty());
		
		System.out.println("grape 가 있는가 : " + tmp.containsKey("grape"));
		
		System.out.println("포도가 있는가 : " + tmp.containsValue("포도"));
		
		System.out.println("모든 키 : " + tmp.keySet());
		
		System.out.println("모든 값 : " + tmp.values());
		
		System.out.println("첫번째 키 : " + tmp.firstKey());
		
		System.out.println("마지막 키 : " + tmp.lastKey());
		
		tmp.clear();
		
		System.out.println(tmp);
		
	}
}
