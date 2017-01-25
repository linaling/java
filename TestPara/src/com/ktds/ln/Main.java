package com.ktds.ln;

public class Main {

	public static void main( String[] args ) {
		
		Teacher teacher = new Teacher();
		Student student = new Student();
		
		teacher.teach("Oracle Database", student);
		student.study("Oracle Database");
		
	}
}
