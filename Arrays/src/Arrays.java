
public class Arrays {

	public static void main(String[] args) {
		
		int[] arr = { 10, 11, 12, 31, 21, 5, 65, 55, 87, 40 };
		int i = 0;
		int sum = 0;

		while (i < 10) {
			sum += arr[i]; // sum = sum + arr[i];
			i++;
		}
		int average = sum / arr.length;
		
		System.out.println("총 합은 " + sum);
		System.out.println("평균은 " + average);
		
	}
}
