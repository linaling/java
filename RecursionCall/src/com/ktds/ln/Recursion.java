package com.ktds.ln;

public class Recursion {
	
	public void call(int index) {
		
		System.out.println("Recursion.call() 호출 중...." + index);
		
		if (index >= 1) {
			call(--index); // recursion 객체 여러개 생성, 모두 보관
		}
	}
}
