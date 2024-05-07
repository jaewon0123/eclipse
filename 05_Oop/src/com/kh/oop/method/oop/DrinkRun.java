package com.kh.oop.method.oop;

public class DrinkRun {
	//메인메서드
	public static void main(String[] args) {
		
		DrinkMaker dm = new DrinkMaker("허브티", 1, 5);
		DrinkStore ds = new DrinkStore(dm ,"경기","멕아커피",false);
		
		DrinkMaker dm1 = new DrinkMaker("아메리카노",3,1);
		DrinkStore ds1 = new DrinkStore(dm1 ,"서울 서초구","빠나쁘레쏘", true);
		
		ds.orderDrink();
		ds1.orderDrink();
	}

}
