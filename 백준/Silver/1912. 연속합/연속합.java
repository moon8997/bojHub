import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        int[] numbers = new int[cnt+1];
        int[] dp = new int[cnt+1];

        for(int i=1; i<=cnt; i++){
            numbers[i] = sc.nextInt();
        }

        dp[0] = dp[1] = numbers[1];

        for(int i=2; i<=cnt; i++){
            dp[i] = Math.max(numbers[i], dp[i-1]+numbers[i]);
        }

        Arrays.sort(dp);

        System.out.println(dp[cnt]);

    }
}
