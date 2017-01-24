package com.ktds.lnc;

public class PersonMain {

	public static void main( String[] args ) {
		//Person khw = new Person();
		
		/*khw.setName("김형우");
		khw.setJob("프로그래머");
		khw.introduce();
		
		
		Person ibj = new Person();
		ibj.setName("임병주");
		ibj.setJob("축구선수");
		ibj.introduce();
		
		Person pmw = new Person();
		pmw.setName("박민우");
		pmw.setJob("백수");
		pmw.introduce();*/
		
		Person unknown = new Person();
		unknown.introduce();
		
		Person lina = new Person("리나", "프로게이머");
		lina.introduce();
		
	}
}
