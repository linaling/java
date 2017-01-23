
public class Arrays {

	public static void main(String[] args) {

		String[] names = { "메탈리카", "림프 비즈킷", "스크릴렉스" };
		// 출력
		// 정수형 변수 i는 0부터 시작해
		// names의 개수보다 작을 동안 1씩 증가하며 반복한다.
		for (int i = 0 /* 이 i도 지역변수 */ ; i < names.length; i++) {
			System.out.println(names[i]);
		}

		int[] scores = { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 };
		// 합계 계산 후 출력
		int sum = 0;

		for (int i = 0; i < scores.length; i++) {
			System.out.println("현재 i의 값 : " + i);
			System.out.println("i 번째 원소의 값 " + scores[i]);

			sum += scores[i];
			System.out.println("현재까지 점수 총 합 : " + sum);
		}
		System.out.println("최종 점수 총 합 : " + sum);

		// foreach
		// for을 간편하게 사용하기 위한 방법
		// 배열 요소를 순차로 꺼내어 준다.
		// 매우매우 빠르다.
		// for보다 빠르다.

		for (int score : scores) {
			System.out.println(score);
		}
		int summ = 0;
		
		for ( int score : scores ) {
			summ += score;
		}
		System.out.println(summ);

	}

}
