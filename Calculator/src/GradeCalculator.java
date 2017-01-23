import java.util.Scanner;

public class GradeCalculator {
	
	void sum( int[] scores ) {
		
		int sumOfGrade = scores[0] + scores[1] + scores[2] + scores[3];
		System.out.println("점수의 총점은 " + sumOfGrade);
		
	}
	
	void average( int[] scores ) {
	
		double averageOfGrade = (double)( scores[0] + scores[1] + scores[2] + scores[3] ) / 4;
		System.out.println("점수의 평균은 " + averageOfGrade);
		
	}
	
	public static void main( String[] args ) {
		
		int scores[] = new int[4];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("점수를 4개 입력하세요 : ");
		scores[0] = input.nextInt();
		scores[1] = input.nextInt();
		scores[2] = input.nextInt();
		scores[3] = input.nextInt();
		
		GradeCalculator cal = new GradeCalculator();
		
		cal.sum(scores);
		cal.average(scores);
		
	}
}
