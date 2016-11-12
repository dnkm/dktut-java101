package temp;

public class ArrayTest {

	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i=2; count<=50; i++) {
			if (isPrime(i)) {
				System.out.println(i);
				count++;
			}
		}
		
		
	}

	static boolean isPrime(int x) {
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

}
