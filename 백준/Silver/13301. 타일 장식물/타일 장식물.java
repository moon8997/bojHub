import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dp = new long[81];

        dp[0] = 0;
        dp[1] = 1;
        
        for(int i=2; i<dp.length; i++) {
        	dp[i] = dp[i-2] + dp[i-1];
        	
        }
     
//        System.out.println(dp[n]);
        System.out.println(dp[n]*4 + dp[n-1]*2);
    }
}