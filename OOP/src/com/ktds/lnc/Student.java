package com.ktds.lnc;

public class Student {

	// 학생 속성 - 이름, 전화번호, 
	//     기능 - 공부, 교복입기, 필기하기, 시험 보기
	private String name = "최리나";
	private String schoolName = "ktds";
	private int grade = 2;
	private int phoneNumber = 01071444074;
	
	// instance field에 대해서 setter 생성
	
	public void setName( String name ) {
		//name 인스턴스 필드를 갱신함
		//파라미터로 전달된 데이터의 길이가 3이면 변경을 해준다.
		
		if( name.length() == 3 ) {
		this.name = name;
		}
	}
	
	public void setSchoolName( String schoolName ) {
		this.schoolName = schoolName;
	}
	
	public void setGrade( int grade ) {
		this.grade = grade;
	}
	
	public void setPhoneNumber( int phoneNumber ) {
		this.phoneNumber = phoneNumber;
	}
	
	public void study() {
		String stu = String.format("%s학생이 %s에서 공부공부", name, schoolName);
		System.out.println(stu);
	}
	public void putOn() {
		String put = String.format("%s학생이 교복입기", name);
		System.out.println(put);
	}
	public void writeDown() {
		System.out.printf("%s학생이 필기하기", name);
	}
	
	
}
