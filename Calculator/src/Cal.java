
public class Cal {

	int num1 = 50; // 인스턴스필드
	
	void addition() {

		int num1 = 5; // local variable
		
		this.num1 = 50; // <<<<<< 이건 인스턴스필드의 num1
	}
}
