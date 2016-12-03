package temp;

public class RegexTest {
	public static void main(String[] args) {
		System.out.println( isTrue("301") );
	}
	
	public static boolean isTrue(String s) {
		return s.matches("[1-2]?[0-9]{1,2}");
	}
}
