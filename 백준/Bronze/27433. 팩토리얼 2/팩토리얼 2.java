import java.util.Scanner;

public class Main {

    static long answer = 1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        fac(n);

        System.out.println(answer);

    }

    static void fac(int n){
        if(n>0){
            answer = answer*n;
            fac(n-1);
        }

    }
}
