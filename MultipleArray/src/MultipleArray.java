
public class MultipleArray {

	void printClassTotalScore(int[][] scoresInClasses) {

		int totalScore1 = scoresInClasses[0][0] + scoresInClasses[0][1] + scoresInClasses[0][2]; // 1행
		int totalScore2 = scoresInClasses[1][0] + scoresInClasses[1][1] + scoresInClasses[1][2]; // 2행
		int totalScore3 = scoresInClasses[2][0] + scoresInClasses[2][1] + scoresInClasses[2][2]; // 3행

		int totalScore = totalScore1 + totalScore2 + totalScore3;

		System.out.println(totalScore);

	}
	
	void printClassAverage(int[][] scoresInClasses, int studentNum) {
		
		int totalScore1 = scoresInClasses[0][0] + scoresInClasses[0][1] + scoresInClasses[0][2]; // 1행
		int totalScore2 = scoresInClasses[1][0] + scoresInClasses[1][1] + scoresInClasses[1][2]; // 2행
		int totalScore3 = scoresInClasses[2][0] + scoresInClasses[2][1] + scoresInClasses[2][2]; // 3행

		int totalScore = totalScore1 + totalScore2 + totalScore3;
		
		double average1 = totalScore1 / (double)studentNum ; // 분모 scoresInClasses[0].length * 1.0
		double average2 = totalScore2 / (double)studentNum ; // studentNum * 1.0
		double average3 = totalScore3 / (double)studentNum ;
		double average = totalScore / (double)studentNum ;
		
		System.out.println(scoresInClasses.length);
		System.out.println(scoresInClasses[0].length);
		
		
		System.out.println(average1);
		System.out.println(average2);
		System.out.println(average3);
		System.out.println(average);
	}
}
