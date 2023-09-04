import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 1000 - sc.nextInt(); // 줘야할 거스름돈

        int[] money = {500, 100, 50, 10, 5, 1};
        int cnt = 0; // 잔돈의 개수

        int i = 0;
        while(n>0){
            if(n < money[i]){
                i++;
            } else {
                n = n - money[i];
                cnt++;
            }
        }

        System.out.println(cnt);


    }
}