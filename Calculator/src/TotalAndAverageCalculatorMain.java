import java.util.Scanner;

public class TotalAndAverageCalculatorMain {

	public static void main( String[] args ) {
		
		Scanner input = new Scanner(System.in);
		int num[] = new int[4];
	
		String message = "안녕 나는 리나야. 반갑.";
		// 띄어쓰기 한 칸 단위 ( 잘라낼 기준 )
		String[] splitedMessage = message.split(" ");
		System.out.println(splitedMessage[0]);
		System.out.println(splitedMessage[1]);
		System.out.println(splitedMessage[2]);
		System.out.println(splitedMessage[3]);
	
		String msg = "리나 : 25";
		String[] splited = msg.split(":");
		
		System.out.println(splited[0]);
		System.out.println(splited[1]);
		
		String str = "135";
		int a = Integer.parseInt(str);
		System.out.println(a);
		/*System.out.println("합계와 평균 구하기 프로그램");
		
		System.out.println("첫 번째 숫자를 입력하세요.");
		num[0] = input.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요.");
		num[1] = input.nextInt();
		
		System.out.println("세 번째 숫자를 입력하세요.");
		num[2] = input.nextInt();
		
		System.out.println("네 번째 숫자를 입력하세요.");
		num[3] = input.nextInt();
		
		TotalAndAverageCalculator cal = new TotalAndAverageCalculator();
		cal.printTotalAndAverage(num);
		*/
	}
}
