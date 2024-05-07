package com.kh.practice.Employee.model.vo;

public class Employee {
	private String name;//이름
	private String subject;//과복
	private int score;//점수
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public int getScore() {
		return score;
	}
	//기본
	public Employee() {
		
	}
	//필수
	public Employee(String name, String subject, int socre) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	public String inform() {
		return "이름: "+ name + "과목: "+ subject + "점수: " + score;
	}
}
