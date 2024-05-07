package com.kh.practice.Employee.controller;

import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeController {
	/* Employee[] sArr = new Employee[5];
	 		┌sArr[0] 이름 과목 점수
	 		├sArr[1] 이름 과목 점수
	 Student├sArr[2] 이름 과목 점수
	 sArr   ├sArr[3] 이름 과목 점수
	 		└sArr[4] 이름 과목 점수
	 
	 */
	private Employee[] sArr = new Employee[5];
	
	public static final int CUT_LINE  = 60;
	
	public EmployeeController() {
		sArr[0] = new Employee ("김길동","자바",100);
		sArr[1] = new Employee ("박길동","디비",50);
		sArr[2] = new Employee ("이길동","화면",85);
		sArr[3] = new Employee ("정길동","서버",60);
		sArr[4] = new Employee ("홍길동","자바",20);
	}
	public Employee[] printStudent() {
		return sArr;
	}
	public int sumScore() {
		int sum = 0;
		for(Employee a : sArr) {
			sum += a.getScore();
		}
		return sum;
	}
	public double avgScore() {
		double avgArr =sumScore() / sArr.length;
		
		return avgArr;	
	}
	
}
