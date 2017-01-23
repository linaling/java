import java.util.Scanner;

public class Temperature {

	final int CALCULATE1 = 32;
	final double CALCULATE2 = 1.8;
	
	void toCelsius(double F) { // 화씨를 섭씨로
		
		double celsius = (F - CALCULATE1) / CALCULATE2;
		System.out.println("화씨 " + F + " 는 " + celsius + "도 입니다. ");
		
	}
	void toFahrenheit(double C) {
		
		double fahrenheit = (C * CALCULATE2) + CALCULATE1;
		System.out.println("섭씨 " + C + " 는 " + fahrenheit + "도 입니다. ");
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("화씨로 바꿀 섭씨 온도를 입력해 주세요 : ");
		double C = input.nextDouble();
		System.out.println("섭씨로 바꿀 화씨 온도를 입력해 주세요 : ");
		double F = input.nextDouble();
		
		Temperature temp = new Temperature();
		temp.toFahrenheit(C);
		temp.toCelsius(F);
		
		
	}
}
