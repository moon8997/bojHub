import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[10][10];

        int max = 0;
        int maxi = 0;
        int maxj = 0;

        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                a[i][j] = sc.nextInt();

                if(max == 0){
                    max = a[i][j];
                    maxi = i;
                    maxj = j;
                } else {
                    max = Math.max(max, a[i][j]);
                    if(max == a[i][j]){
                        maxi = i;
                        maxj = j;
                    }
                }

            }
        }

        System.out.println(max);
        System.out.println(maxi + " " + maxj);


    }
}
