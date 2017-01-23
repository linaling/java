
public class MultipleArray {
	public static void main( String[] args ) {
		
		int[][] numbers = {
				{2, 4, 6, 8, 10, 12, 14, 16, 18},
				{3, 6, 9, 12, 15, 18, 21, 24, 27},
				{4, 8, 12, 16, 20, 24, 28, 32, 36}
				
		};
		
		int i = 0; 
		int j = 0;
		
		while ( i < numbers.length ) {
			while ( j < numbers[0].length ) {
				System.out.print(numbers[i][j] + " ");
				j++;
			}
			System.out.println();
			i++;
			j = 0;
		}
		/*System.out.println(numbers[0][0]);
		System.out.println(numbers[0][1]);
		System.out.println(numbers[0][2]);
		
		System.out.println(numbers[1][0]);
		System.out.println(numbers[1][1]);
		System.out.println(numbers[1][2]);
		
		System.out.println(numbers[2][0]);
		System.out.println(numbers[2][1]);
		System.out.println(numbers[2][2]);*/
	}

}
