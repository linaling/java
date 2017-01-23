import java.util.Scanner;
public class Main {

	public static void main( String[] args ) {
		
		Gugudan gugu = new Gugudan();
		Scanner input = new Scanner(System.in);
		
		gugu.startProgram();
		int num = input.nextInt();
		gugu.printGugudan(num);
		
	}
}
