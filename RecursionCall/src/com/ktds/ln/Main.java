package com.ktds.ln;

public class Main {

	public static void main( String[] args ) {
		Recursion recursion = new Recursion();
		recursion.call(10); //stack overflow 발생
	}
}
