package com.ktds.ln;

import static com.ktds.ln.constants.MemberGradeConst.*;

public class Main {

	public void start() {
		
		int grade = 0;
		
		if( grade == ADMIN ) {
			System.out.println("관리자");
		}
		else if ( grade == MEMBER ) {
			System.out.println("회원");
		}
	}
	
	public static void main(String[] args) {
		new Main().start();
	}

}

