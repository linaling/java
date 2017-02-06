package com.ktds.ln.coffee;

public class Cafe {

	public static void main(String[] args) {
		
		CoffeeMachine espressoMachine = new CoffeeMachine();
		espressoMachine.espresso();
		
		
		// Sub class is a Super class
		System.out.println("========= 라떼 머신 ==========");
		CoffeeMachine latteMachine = new LatteMachine();
		
		//class끼리의 명시적casting, 둘이 같은말
		LatteMachine latte = (LatteMachine) latteMachine;
		((LatteMachine)latteMachine).latte();
		
		
		latteMachine.espresso();
	
		System.out.println(espressoMachine);
		System.out.println(latteMachine);
		//espressoMachine.espresso();
	}
	
}
