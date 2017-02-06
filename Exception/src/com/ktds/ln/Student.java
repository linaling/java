package com.ktds.ln;

import com.ktds.ln.exceptions.MissingValueException;
import com.ktds.ln.exceptions.MissmatchValueException;


public class Student {

	public void start() throws MissingValueException {
		try {
			registNewStudent();
		} catch (MissmatchValueException e) {
			System.out.println(e.getMessage());
		} 	
		finally {
			System.out.println("잘 처리 됐습니다.");
		}
		
		System.out.println("정상수행");
	}
	
	public void registNewStudent() throws MissingValueException, MissmatchValueException /* 내가 trycatch 해야되지만 하기싫어 니가해 */{
		
		String name = null;
		String school = "ktds1";

		if( name == null ) {
			throw new MissingValueException("이름은 필수 입력 값입니다.");
			// 그냥 exception이라 throws 꼭 적어줘야 빨간줄안난다.
			// throw 하면 그 아래는 무시된다. 실행 안됨.
		}
		
		if(!school.equals("ktds")) {
			throw new MissmatchValueException("학교 이름이 잘못 되었습니다.");
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			new Student().start();
		} catch (MissingValueException e) {
			
		}
	}

}
