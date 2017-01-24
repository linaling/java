package com.ktds.lnc;

public class ArmyMain {

	public static void main( String[] args ) {
		
		Army army = new Army();
		
		Person lina = army.makeArmy("리나");
		System.out.println(lina.getName());
		System.out.println(lina.getJob());
		
	}
}
