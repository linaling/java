
public class TypeCasting {

	public static void main(String[] args) {
		
		int number1 = 10; // 4 byte
		int number2 = 30; // 4 byte
		
		int result = number1 + number2; // 4 byte = 4 byte + 4 byte
		
		
		float r2 = 50 + 50.0F;
		long r3 = 100;
		
		System.out.println(r2+r3);
		
		// 명시적 캐스팅
		int number3 = (int) (10 + 10.6);
		
		double floatingNumber = 50.12344;
		int number4 = 10000;
		int number5 = number3 + (int) floatingNumber;
	}
}
