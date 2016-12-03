package temp;

public class Temp {
	public static void main(String[] args) {
		System.out.println( generate(1) );	// 2
		System.out.println( generate(10) ); // 11
		System.out.println( generate(91) );	// 101
		
		// sum of all self numbers between 1~5000 
		int sum = 0;
		
		boolean[] counter = new boolean[5001];
		
		for(int i=0; i<5000; i++) {
			int generated = generate(i);
			if (generated <= 5000) counter[generated] = true;
		}
		
		for(int i=0; i<counter.length; i++) {
			if (!counter[i]) {
				sum += i;
			}
		}
		
		System.out.println("sum : " + sum);
	}
	
	public static int generate(int seed) {
		int sum = seed;
		
		for(int j = seed; j > 0; j /= 10) {
			sum += j % 10;
		}
		
		return sum;
	}
}
