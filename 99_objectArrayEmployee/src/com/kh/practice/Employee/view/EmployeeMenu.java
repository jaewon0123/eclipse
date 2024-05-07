package com.kh.practice.Employee.view;

import com.kh.practice.Employee.controller.EmployeeController;
import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeMenu {
	private EmployeeController ssm = new EmployeeController();
	
	private EmployeeMenu() {
		
	}
	public void printEmployeeMenu() {
		System.out.println(" 학생 " + " 이름 " + " 과목 " + " 점수 ");
		
		for(Employee employee : ssm.printStudent()) {
			System.out.println(employee.inform());
		}
		System.out.println("-------------");
		System.out.println("총점 : " + ssm.sumScore());
		System.out.println("평균 : " + ssm.avgScore());
		
	}
	
}
