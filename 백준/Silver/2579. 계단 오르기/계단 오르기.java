import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        int[] stair = new int[301];
        long[] dp = new long[301];

        for(int i=1; i<=cnt; i++){
            stair[i] = sc.nextInt();
        }

        dp[1] = stair[1];
        dp[2] = stair[1] + stair[2];
        dp[3] = Math.max(stair[1], stair[2]) + stair[3];

        for(int i=4; i<= cnt; i++){
            dp[i] = Math.max(dp[i-3]+stair[i-1], dp[i-2])+stair[i];
        }

        System.out.println(dp[cnt]);

    }
}
