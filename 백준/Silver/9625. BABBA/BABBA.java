import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	// 모든 B는 BA로 바뀌고, 
    	// A는 B로 바뀐다
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        int[][] dp = new int[k+1][2];
        
        dp[0][0] = 1;
        dp[0][1] = 0;
        
        for(int i=1; i<=k; i++) {
        	dp[i][0] = dp[i-1][1];
        	dp[i][1] = dp[i-1][0] + dp[i-1][1];
        }
        
        System.out.println(dp[k][0] + " "+ dp[k][1] );
    }
}
