import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 표준 입력에서 데이터를 읽기 위한 Scanner 객체 생성

        int n = 9;

        int[] arrays = new int[n+1];

        for(int i=1; i<=n; i++){
            arrays[i] = sc.nextInt();
        }

        int max = arrays[1];
        int maxIndex = 1;
        for(int i=2; i<=n; i++){
            max = Math.max(arrays[i], max);
            if(max == arrays[i]){
                maxIndex = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex);

    }
}