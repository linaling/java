
public class Ggudan {

	public static void main( String[] args ) {
		
	/*	int i = 1;
		int j = 2;
		
		while( j < 10 ) {
			while( i < 10 ) {
				System.out.print(i*j + " ");
				i++;
			}
			System.out.println();
			i = 1;
			j++;
		}		
		*/
		
		// i 와 j 를 바꾸는 경우
		
		int i = 1;
		int j = 2;
		
		while( i < 10 ) {
			while( j < 10 ) {
				System.out.print(i*j + " ");
				j++;
			}
			System.out.println();
			i++;
			j = 2;
		}
	}
	
}
