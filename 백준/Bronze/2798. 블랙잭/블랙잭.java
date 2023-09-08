import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] card = new int[N];

        for (int i = 0; i < N; i++) {
            card[i] = sc.nextInt();
        }

        int answer = 0;

        // 카드를 정렬하여 오름차순으로 처리
        Arrays.sort(card);

        // 가장 작은 카드부터 시작하여 가능한 합 중 가장 큰 합을 찾음
        for (int i = 0; i < N - 2; i++) {
            if (card[i] > M)
                break;

            for (int j = i + 1; j < N - 1; j++) {
                if (card[i] + card[j] > M)
                    break;

                for (int k = j + 1; k < N; k++) {
                    int tempSum = card[i] + card[j] + card[k];
                    if (tempSum <= M && tempSum > answer) {
                        answer = tempSum;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
