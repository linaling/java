import java.util.Scanner;

public class Calculator {
	
	int Result;

	void addition(int a, int b){
		int Result = a + b;
		System.out.println("더하기 : " + Result);
	}
	
	void subtraction(int a, int b){
		int Result = a - b;
		System.out.println("빼기 : " + Result);
	}
	
	void multiple(int a, int b) {
		int Result = a * b;
		System.out.println("곱하기 : " + Result);
	}
	
	void division(int a, int b){
		int Result = a / b;
		System.out.println("나눈 몫 : " + Result);
	}
	
	void Remain(int a, int b){
		int Result = a % b;
		System.out.println("나눈 나머지 : " + Result);
	}
	
	public static void main(String[] args) {
		int number1, number2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자 두개를 입력하세요");
		number1 = input.nextInt();
		number2 = input.nextInt();
		
		Calculator cal = new Calculator();
		
		cal.addition(number1, number2);
		cal.subtraction(number1, number2);
		cal.multiple(number1, number2);
		cal.division(number1, number2);
		cal.Remain(number1, number2);
	}
}
