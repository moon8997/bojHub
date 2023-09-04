import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 조리시간

        int[] button = {300, 60, 10};
        int[] cnt = {0, 0, 0};

        int i = 0;

        while(n > 0){
            if(n >= button[i]){
                n = n-button[i];
                cnt[i] = cnt[i]+1;
            }else {
                i++;
                if(i==3)
                    break;
            }
        }

        if(n == 0){
            for(int j =0; j<3;j++){
                System.out.println(cnt[j]);
            }
        } else {
            System.out.println(-1);
        }

    }
}