import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] array = new int[n];
        int[] cnt = new int[n];

        for(int a=0; a<m; a++){

            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for(int b=i-1; b<j; b++){
                array[b] = k;
            }

        }

        for(int i =0; i<n; i++){
            System.out.print(array[i] + " ");
        }

    }

}
