import java.util.Scanner;

public class Calculator2 {

	
	public static void main(String[] args) {
		
		// 사용자에게 입력받을 수 있는 객체를 만든다.
		Scanner input = new Scanner( System.in );
		
		// 사용자에게 숫자를 입력받는다.
		System.out.println("숫자를 2개 입력하세요!");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		int sum = number1 + number2;
		double average = (double)(number1 + number2)/2;
		// (number1 + number2)/2.0 이렇게 하나를 실수로 만들어주면 된다.
		
		System.out.println("합은 " + sum + "입니다.");
		System.out.println("평균은 " + average + "입니다.");
		
		
		// 사용자에게 입력받은 숫자를 출력한다.
	}
}
