
public class AppleShop {

	void discount(int cost) {
		double result = cost*85.0/100.0;
		System.out.println("정가는 999,000, 15% 할인 된 가격은 " + result + " 원 입니다.");
	}
	
	public static void main(String[] args) {
		
		AppleShop apple = new AppleShop();
		apple.discount(999000);
	}
}
