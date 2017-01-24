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
		
		
		Student sjm = new Student();
		sjm.setName("손진무");
		sjm.setGrade(2);
		sjm.setPhoneNumber(01000000123);
		
		
	}
}
