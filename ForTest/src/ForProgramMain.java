
public class ForProgramMain {

	public static void main( String[] args ) {
		
		ForProgram fp = new ForProgram();
		
		for(;;) {
			int number = fp.startProgram();
			if ( number == 4 ) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}
			switch ( number ) {
			case 1 :
				fp.getAverage();
				break;
			case 2 : 
				int fOrC = fp.selectFOrC();
				if ( fOrC == 1 ) 
					fp.fToC();
				else
					fp.cToF();
				break;
			case 3 :
				fp.getBmi();
				break;
			
		}
	}
}
}
