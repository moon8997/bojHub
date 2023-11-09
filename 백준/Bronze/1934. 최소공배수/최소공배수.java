import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){

            int a = sc.nextInt();
            int b = sc.nextInt();

            int gcd = getGCD(a, b);

            System.out.println((a*b)/gcd);

        }
    }

    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1%num2);
    }


}