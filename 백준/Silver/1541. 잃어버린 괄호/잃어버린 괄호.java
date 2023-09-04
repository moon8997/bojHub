import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String q = sc.nextLine();

        String[] splitQ = q.split("-");

        int sum = Integer.MAX_VALUE;

        for(int i=0; i<splitQ.length; i++) {
            int temp = 0;

            String[] addition = splitQ[i].split("\\+");

            for(int j=0; j< addition.length; j++){
                temp += Integer.parseInt(addition[j]);
            }

            if(sum == Integer.MAX_VALUE){
                sum = temp;
            } else {
                sum -= temp;
            }

        }

        System.out.println(sum);
    }
}
