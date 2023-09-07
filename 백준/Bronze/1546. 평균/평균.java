import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 표준 입력에서 데이터를 읽기 위한 Scanner 객체 생성

        int n = sc.nextInt();

        int[] arrays = new int[n];

        for(int i=0; i<n; i++){
            arrays[i] = sc.nextInt();
        }

        Arrays.sort(arrays);

        int max = arrays[n-1];

        double answer = 0;


        for(int i=0; i<n; i++){
            double ratio = ((double) arrays[i] / max) * 100;
            answer += ratio;
        }

        System.out.println(answer/n);
    }
}