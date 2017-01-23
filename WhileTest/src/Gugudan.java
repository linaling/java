
public class Gugudan {

	
	public void startProgram() {
		
		System.out.println("======= 구구단 프로그램 =======");
		System.out.println("원하시는 구구단을 입력하세요. (입력 범위 : 2~9 )");
		System.out.print("원하는 구구단 : ");
		
	}
	
	public void printGugudan( int num ) {
		
		System.out.println("=========================");
		System.out.println("구구단 2단을 출력합니다.");
		
		int i = 1;
		while( i < 10 ) {
			System.out.println(num + " X " + i + " = " + num*i );
			i++;
		}
				
	}
}
