
public class MultipleArrayMain {

	public static void main( String[] args ) {
		
		final int ARRAY_NUM = 3;
		/*
		int[][] scoresInClasses = new int[ARRAY_NUM][ARRAY_NUM];
		scoresInClasses[0][0] = 100;
		scoresInClasses[0][1] = 100;
		scoresInClasses[0][2] = 100;
		
		scoresInClasses[1][0] = 100;
		scoresInClasses[1][1] = 100;
		scoresInClasses[1][2] = 100;
		
		scoresInClasses[2][0] = 100;
		scoresInClasses[2][1] = 100;
		scoresInClasses[2][2] = 100;*/
		
		/*int[][] scoresInClasses = new int[ARRAY_NUM][];
		scoresInClasses[0] = new int[]{100, 100, 90};
		scoresInClasses[1] = new int[]{90, 10, 70};
		scoresInClasses[2] = new int[]{70, 100, 95};*/
		
		int[][] scoresInClasses = /*new int[][]*/{
				{100, 100, 90},
				{90, 10, 70},
				{70, 100, 95},
				{70, 100, 95},
				{70, 100, 95}
		};
				
		MultipleArray multipleArray = new MultipleArray();
		
		multipleArray.printClassTotalScore(scoresInClasses);
		multipleArray.printClassAverage(scoresInClasses, ARRAY_NUM);
		
	}
}
