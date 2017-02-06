package com.ktds.ln.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public void start() {
		
		// 배열 만드는 방법
		int[] scoreArray = new int[4];
		
		// List 만드는 방법
		List<Integer> scoreList = new ArrayList<Integer>();
		//왜이건 앞뒤가 이름이 다른가 : 앞에는 인터페이스 뒤에는 클래스
		
		// 배열에 데이터를 넣는 방법
		scoreArray[0] = 100;
		scoreArray[1] = 90;
		scoreArray[2] = 80;
		scoreArray[3] = 70;
		
		// 리스트에 데이터를 넣는 방법, 거의 무한대로 가능
		scoreList.add(100); // 0번 인덱스에 100 추가
		scoreList.add(90);
		scoreList.add(80);
		scoreList.add(70);
		
		// 배열 데이터를 출력하는 방법
		// 1. for
		for( int i = 0; i < scoreArray.length; i++ ) {
			System.out.println(scoreArray[i]);
		}
		
		// 2. for-each
		for ( int score : scoreArray ) {
			System.out.println(score);
		}
		
		// List 데이터 출력하는  방법
		// 1. for
		for ( int i = 0; i < scoreList.size(); i++ ) {
			System.out.println(scoreList.get(i));
		}
		
		// 2. for-each
		for ( int score : scoreList ) {
			System.out.println(score);
		}
		
		
		// 배열 데이터 수정하기 ( 1번 인덱스의 값을 10으로 변경 )
		scoreArray[1] = 10;
		
		// list 데이터 수정하기
		scoreList.set(1, 10);
		
		// 배열 데이터 삭제하기
		// 불가능....
		
		// List 데이터 삭제하기 ( 1번 인덱스를 삭제함. )
		scoreList.remove(1); // 삭제라는게 정확히 무엇인가
		
		// 배열 데이터 검색하기 ( 80이 있는지 확인 )
		for ( int i = 0; i < scoreArray.length; i++ ) {
			if ( scoreArray[i] == 80 )
				System.out.println("ScoreArray에 80은 " + i + "번째 인덱스에 있습니다.");
		}
		
		// List 데이터 검색하기 -> 이렇게하면 첫번째 한개만.찾아줌 여러개 찾으려면 반복문 돌리기
		if ( scoreList.contains(80) ) {
			System.out.println("ScoreArray에 80은 " + scoreList.indexOf(80) + "번째 인덱스에 있습니다.");
		}
		
		// List 데이터 모두 삭제하기
		scoreList.clear();
		
	}
	public static void main(String[] args) {
		new ArrayListTest().start();
	}
}
