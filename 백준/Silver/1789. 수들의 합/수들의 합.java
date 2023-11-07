import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();

        long i = 1;

        while (true) {
            s -= i;
            if (s < 0) {
                break; 
            }
            i++;
        }

        System.out.println(i - 1); 
    }
}