import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        for(int j=0; j<cnt; j++){
            int n = sc.nextInt();

            long[] dp = new long[101];

            for(int i=1; i<101; i++){
                if(i<=3){
                    dp[i] = 1;
                } else {
                    dp[i] = dp[i-3] + dp[i-2];
                }
            }

            System.out.println(dp[n]);
        }



    }
}
