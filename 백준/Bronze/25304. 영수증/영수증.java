import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 표준 입력에서 데이터를 읽기 위한 Scanner 객체 생성

        int X = sc.nextInt();
        int N = sc.nextInt();

        int cost = 0;

        for(int i=0; i<N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            cost += a*b;

        }

        if(X == cost){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
