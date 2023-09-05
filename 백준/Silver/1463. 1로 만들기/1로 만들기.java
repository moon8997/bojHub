import java.util.Scanner;

public class Main {

//    X가 3으로 나누어 떨어지면, 3으로 나눈다.
//    X가 2로 나누어 떨어지면, 2로 나눈다.
//            1을 뺀다.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] dp = new int[N + 1]; // dp 배열을 생성하고 초기화합니다.
        // 1은 이미 1로 만들어진 상태이므로 연산 횟수는 0입니다.
        dp[0] = dp[1] = 0;

        for(int i=2; i<=N; i++){
            dp[i] = dp[i-1] + 1;

            if(i%2==0){
                dp[i] = Math.min(dp[i], dp[i/2] + 1);
            }

            if(i%3==0){
                dp[i] = Math.min(dp[i], dp[i/3] +1);
            }

        }

        System.out.println(dp[N]);

    }
}