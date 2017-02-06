package com.ktds.ln;

public class Room2 {

	public static void main(String[] args) {

		// AirConditioner 의 객체가 AirCleaner로 들어감
		AirCleaner airCleaner = new AirConditioner();
		airCleaner.powerOn();
		
	}
}
