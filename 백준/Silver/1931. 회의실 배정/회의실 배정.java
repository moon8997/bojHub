import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] meetings = new int[n][2];

        for(int i=0; i<n; i++){
            meetings[i][0] = sc.nextInt();
            meetings[i][1] = sc.nextInt();
        }

        // 끝나는 시간을 기준으로 오름차순으로 정렬
        Arrays.sort(meetings, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int cnt = 1;
        int endTime = meetings[0][1];

//        System.out.println("선택된 회의:");
//        System.out.println(meetings[0][0] + " " + meetings[0][1]);

        for(int i=1; i<n; i++){
            if(meetings[i][0] >= endTime){
                cnt++;
                endTime = meetings[i][1];
//                System.out.println(meetings[i][0] + " " + meetings[i][1]);
            }
        }

        System.out.println(cnt);

    }
}
