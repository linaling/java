import java.util.Scanner;

public class Gugudan {
	
	int gugu;
	
	void setGugu(int a) {
		this.gugu = a;
	}
	void printGugu() {
		for( int i = 0; i <= 9; i++) {
			System.out.println(gugu + "x" + i + " = " + gugu*i);
		}
	}

	public static void main( String[] args ) {
		
		Scanner input = new Scanner(System.in);
		Gugudan Gu = new Gugudan();
		
		System.out.println("구구단 몇 단 ?");
	
		Gu.setGugu(input.nextInt());
		Gu.printGugu();
		
		
		
		
		
	}
}
