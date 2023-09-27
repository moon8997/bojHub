import java.util.*;

public class Main {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		
		System.out.println(plus(a));
		
	}
	
	public static int plus(int n) {

		if (n <= 1)
			return n;

		else 
			return plus(n-1) + n;

	}
}