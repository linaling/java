
public class Star {

	public static void main(String[] args) {

		int i = 0, j = 5;

		while (i != j) {

			while (i < j) {
				System.out.print("*");
				i++;
			}
			System.out.println("");
			i = 0;
			j -= 1;

		}
	}
}
