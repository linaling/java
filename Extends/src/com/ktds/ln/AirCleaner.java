package com.ktds.ln;

public class AirCleaner {

	public String manufactor = "휘센";
	protected String origin = "한국";
	private int power = 3; // 이건 상속x, default, protected, pulbic만

	public void powerOn() {
		System.out.println("공기청정기를 가동합니다.");
		System.out.println("공기가 맑아집니다.");

	}

}
