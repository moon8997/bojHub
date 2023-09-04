import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 테스트 케이스 갯수
        int[] test = new int[n];
        for(int i = 0; i<n; i++){
            test[i] = sc.nextInt();
        }

        int[] money = {25, 10, 5, 1};
        int[] cnt = {0, 0, 0, 0};


        for(int i = 0; i<n;i++){
            for(int j = 0; j<4; ) {
                if(test[i] >= money[j]){
                    test[i] -= money[j];
                    cnt[j] +=1;
                } else {
                    System.out.println(cnt[j]);
                    j++;
                }
            }
            cnt = new int[]{0, 0, 0, 0};
        }

    }
}
