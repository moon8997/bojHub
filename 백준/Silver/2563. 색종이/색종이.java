import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[][] back = new boolean[100][100];

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j=x; j<x+10; j++){
                for(int k=y; k<y+10; k++){
                    back[j][k] = true;
                }
            }
        }

        int answer = 0;

        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if(back[i][j])
                    answer += 1;
            }
        }

        System.out.println(answer);
    }
}