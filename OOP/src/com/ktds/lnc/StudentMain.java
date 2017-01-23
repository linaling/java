package com.ktds.lnc;

public class StudentMain {

	public static void main( String[] args ) {
		
		Student cln = new Student();
		
		//cln.name = "김슬기"; 이렇게는 private이라 못씀
		cln.setName("김슬기");
		cln.study();
		cln.setName("바보");
		cln.study();
		cln.setName("바바바");
		
		cln.study();
		cln.putOn();
		cln.writeDown();
		
	}
}
