package com.ktds.lnc;

public class Person {

	private String name;
	private String job;
	
	// default 생성자
	// 우리가 안만들어도 실행됨 > 자동으로 추가됐기 때문
	// 보통 하는일 : 멤버변수 값 초기화
	
	public Person() {
		System.out.println("Person 기본 생성자 실행됨");
	}
	
	/**
	 * 생성자 오버로딩
	 * 기본 생성자에 파라미터를 추가해 데이터를 초기화 시킨다.
	 * @param name
	 * @param job
	 */
	public Person( String name, String job ) {
		System.out.println("Person 생성자가 실행됨");
		setName(name);
		setJob(job);
	}
	
	public void setName( String name ) {
		this.name = name;
	}
	
	public void setJob( String job ) {
		this.job = job;
	}
	
	/* 
	 * public 가져올_멤버변수타입 get 가져올_멤버변수_명() {
	 * 	     return 가져올_멤버변수
	 * }
	 */
	
	public String getName() {
		return this.name;
	}
	
	public String getJob() {
		return this.job;
	}
	
	
	public void introduce() {
		
		String message = String.format("이름 : %s, 직업 : %s", name, job);
		System.out.println(message);
	}
}
