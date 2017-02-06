package com.ktds.ln;

public class LatteMachine extends CoffeeMachine{

	public LatteMachine() {
		super.atm = 15;
	}
	
	@Override
	public void latte() {
		System.out.println("-- 라뗴 --");
		System.out.println(atm + "기압으로 라떼를 추출합니다.");
		
	}

	
}
