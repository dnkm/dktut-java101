package temp;

public class Temp {
	public static void main(String[] args) {
		int[] arr = { 1, 10, 3, 8, 9 };
		
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println(max);
	}
	
}
