
import java.util.Scanner;

/**
 * 산술 연산자를 이용해 합계/평균 구하기
 * @author minchangjang
 *
 */
public class TotalAndAverageCalculator {
	
	void printTotalAndAverage(int[] num) {
		
		int totalPoint = num[0] + num[1] + num[2] + num[3];
		System.out.println(num[0] + " + "
						+ num[1] + " + "
						+ num[2] + " + "
						+ num[3] + " = "
						+ totalPoint);
		
		double averagePoint = totalPoint / num.length * 1.0;
		System.out.println("평균은 " + averagePoint + " 입니다.");
		
	}
	
}