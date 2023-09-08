import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] remain = new int[10];
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            remain[i] = n % 42;
        }

        for (int i = 0; i < 10; i++) {
            boolean isDifferent = true;
            for (int j = 0; j < i; j++) {
                if (remain[i] == remain[j]) {
                    isDifferent = false;
                    break;
                }
            }
            if (isDifferent) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
