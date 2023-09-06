import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        int[] A = new int[cnt+1];
        int[] dp = new int[cnt+1];
        for(int i=1; i<=cnt; i++){
            A[i] = sc.nextInt();
            dp[i] = 1;
        }

        for (int i = 1; i <= cnt; i++) {
            for (int j = 1; j < i; j++) {
                if (A[i] > A[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int maxLength = 0;
        for (int i = 1; i <= cnt; i++) {
            maxLength = Math.max(maxLength, dp[i]);
        }

        System.out.println(maxLength);

    }
}