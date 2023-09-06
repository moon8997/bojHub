import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt();
		
		int[][] Cost = new int[N][3];
		
		for(int i=0; i<N; i++) {
			Cost[i][0] = sc.nextInt();
			Cost[i][1] = sc.nextInt();
			Cost[i][2] = sc.nextInt();
		}
		
		for (int i = 1; i < N; i++) {
			Cost[i][0] += Math.min(Cost[i - 1][1], Cost[i - 1][2]);
			Cost[i][1] += Math.min(Cost[i - 1][0], Cost[i - 1][2]);
			Cost[i][2] += Math.min(Cost[i - 1][0], Cost[i - 1][1]);

		}
		
		System.out.println(Math.min(Math.min(Cost[N - 1][0], Cost[N - 1][1]), Cost[N - 1][2]));
		
	}
	

}
