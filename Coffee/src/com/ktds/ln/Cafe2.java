package com.ktds.ln;

public class Cafe2 {

	public static void main(String[] args) {
		
		CoffeeMachine coffeeMachine = new EspressoMachine();
		CoffeeMachine latteMachine = new LatteMachine();
		CoffeeMachine chocoLatteMachine = new ChocoLatteMachine();
		
		coffeeMachine.espresso();
		coffeeMachine.latte();
		
		latteMachine.espresso();
		latteMachine.latte();
		
		chocoLatteMachine.espresso();
		chocoLatteMachine.latte();
		
	/*	Barista barista = new Barista();
		barista.coffee(coffeeMachine);
		barista.coffee(latteMachine);*/
		
	}
}
