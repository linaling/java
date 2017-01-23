import java.util.Scanner;

public class ForProgram {
	Scanner input = new Scanner(System.in);
	
	int startProgram() {
		
		System.out.println("***************************");
		System.out.println("1 : 5개 점수의 총점과 평균을 구하는 프로그램");
		System.out.println("2 : 섭씨를 화씨로, 화씨를 섭씨로 바꿔주는 프로그램");
		System.out.println("3 : bmi를 계산하는 프로그램");
		System.out.println("4 : 프로그램 종료");
		System.out.println("***************************");

		int number = input.nextInt();
		return number;
	}

	void getAverage() {

		System.out.println("점수 5개를 입력하세요 : ");

		int[] nums = new int[5];
		int sum = 0;
		
		for( int i = 0; i < 5; i++ ) {
			
			nums[i] = input.nextInt();
			sum += nums[i];
			
		}
	
		double average =  sum / 5.0;
		
		
		System.out.println("총점은 " + sum + "이고 평균은 " + average + "입니다.");

	}

	int selectFOrC() {
		
		System.out.println("변환할 경우를 선택하세요. ");
		System.out.println("1. 화씨 -> 섭씨 ");
		System.out.println("2. 섭씨 -> 화씨 ");
		int fOrC = input.nextInt();
		return fOrC;
		
		
	}
	
	void fToC() {

		System.out.println("화씨 온도를 입력하세요 : ");
		double fahrenheit, celcius;
		fahrenheit = input.nextDouble();
		celcius = (fahrenheit - 32) / 1.8;
		System.out.println("화씨 " + fahrenheit + "도의 섭씨 온도는 " + celcius + "도 입니다.");

	}

	void cToF() {

		System.out.println("섭씨 온도를 입력하세요 : ");
		double fahrenheit, celcius;
		celcius = input.nextDouble();
		fahrenheit = ( celcius * 1.8 ) + 32;
		System.out.println("섭씨 " + celcius + "도의 화씨 온도는 " + fahrenheit + "도 입니다.");

	}
	
	void getBmi() {
		
		System.out.println("몸무게를 입력하세요 : ");
		double weight = input.nextDouble();
		System.out.println("키를 입력하세요(cm) : ");
		double height = input.nextDouble() / 100;
		double bmi = weight / (height*height);
		
		System.out.println(height);
		System.out.println("BMI는 " + bmi + "입니다. ");
		if ( bmi <= 18.5 ) {
			System.out.println("저체중입니다." );
		}
		else if( bmi <= 23 ) {
			System.out.println("정상입니다." );
		}
		else if( bmi < 25 ) {
			System.out.println("과체중입니다." );
		}
		else if( 25 <= bmi ) {
			System.out.println("비만입니다." );
		}
		
	}
	
}
