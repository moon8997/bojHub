import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 표준 입력에서 데이터를 읽기 위한 Scanner 객체 생성

        int n = sc.nextInt();

        int[] numbers = new int[n+1];

        for(int i=0; i<=n; i++){
            numbers[i] = i;
        }

        int m = sc.nextInt();

        for(int i=0; i<m; i++){
            int q1 = sc.nextInt();
            int q2 = sc.nextInt();

            while(q1<q2){
                int temp = numbers[q1];
                numbers[q1] = numbers[q2];
                numbers[q2] = temp;
                q1++;
                q2--;
            }


        }

        for (int i = 1; i <= n; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
