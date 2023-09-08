import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] chess = {1,1,2,2,2,8};
        int[] answer = new int[6];
        for(int i=0; i<6; i++){
            answer[i] = chess[i]-sc.nextInt();
            System.out.print(answer[i] + " ");
        }

    }
}
