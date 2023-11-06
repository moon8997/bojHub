import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();

        for(int i=0; i<k; i++){

            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;

            int sum = 0;

            for(int i1 = 0; i1<=x-a; i1++){
                for(int j2=0; j2<=y-b; j2++){
                    sum += arr[a+i1][b+j2];
                }
            }
            System.out.println(sum);

        }
    }
}
