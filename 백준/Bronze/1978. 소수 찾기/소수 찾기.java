import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int answer = 0;

        for(int i=0; i<n; i++){

            int cnt = 0;
            int m = sc.nextInt();

            for(int j=1; j<=m; j++){
                if(m%j==0){
                    cnt++;
                }
            }

            if(cnt == 2){
                answer++;
            }
        }

        System.out.println(answer);

    }

}