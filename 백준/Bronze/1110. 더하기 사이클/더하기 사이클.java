import java.util.*;

public class Main {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int copy = N;		
		int count = 0;
		 
		do {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			count++;
		} while(copy != N);

		System.out.println(count);
	}

}