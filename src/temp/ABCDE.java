package temp;

public class ABCDE {
	public static void main(String[] args) {
		int[] arr = new int[20];

		// randomize
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
		}
		
		// print
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			
			if ( i != arr.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
}
