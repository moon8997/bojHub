import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] array = new int[n];

        for(int i=0; i<n; i++){
            array[i] = i+1;
        }

        for(int a=0; a<m; a++){

            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;

            int temp1 = array[i];
            int temp2 = array[j];

            array[i] = temp2;
            array[j] = temp1;
        }

        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }


    }

}
