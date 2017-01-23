
public class UsdToKrw {

	void toKrw(int dollar) {
		double krw = dollar*1185.30;
		System.out.println(dollar + " 달러는 " + krw + " 원 입니다. ");
	}
	
	public static void main(String[] args) {
		UsdToKrw utk = new UsdToKrw();
		utk.toKrw(3000);
	}
}
