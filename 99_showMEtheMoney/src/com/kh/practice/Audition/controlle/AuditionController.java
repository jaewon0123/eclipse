package com.kh.practice.Audition.controlle;

import com.kh.practice.Audition.model.vo.Audition;

public class AuditionController {
	Audition[] sArr = new Audition[5];
	
	public static final int CUT_LINE = 60;
	
	public AuditionController() {
		sArr[0] = new Audition("김영희","발라드",100);
		sArr[1] = new Audition("박영희","힙합",50);
		sArr[2] = new Audition("이연이","뮤지컬",85);
		sArr[3] = new Audition("정영히","댄스",60);
		sArr[4] = new Audition("홍영희","팝",20);
		
	}
	public Audition[] printStudent() {
		return sArr;
	}
	public int sumScore() {
		int sum = 0;
		for(Audition a : sArr) {
			sum += a.getScore();
			
		}
		return sum;
	}
	public double[] avgScore() {
		double[] avg = new double[2];
		avg[0] = sumScore();
		avg[1] = avg[0] / sArr.length;
		return avg;
	}
	public void printPass() {
		for(Audition a : sArr) {
			a.setPassed(a.getScore() >= CUT_LINE);
			System.out.println(a.getName() + " 님은 " +  " " + a.getScore() + " 점으로," + (a.isPassed() ? "합격" : "불합격") + "입니다.");
		}
	}
	
}
