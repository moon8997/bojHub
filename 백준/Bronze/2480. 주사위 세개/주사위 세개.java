import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 표준 입력에서 데이터를 읽기 위한 Scanner 객체 생성

        int[] arrays = new int[3];

        for(int i=0; i<3; i++){
            arrays[i] = sc.nextInt();
        }

        int answer = calculatePrize(arrays);

        System.out.println(answer);
    }

    public static int calculatePrize(int[] dice) {
        int prize = 0;

        Arrays.sort(dice);

        if (dice[0] == dice[1] && dice[1] == dice[2]) {
            // 같은 눈이 3개인 경우
            prize = 10000 + dice[0] * 1000;
        } else if (dice[0] == dice[1] || dice[1] == dice[2]) {
            // 같은 눈이 2개인 경우
            if (dice[0] == dice[1]) {
                prize = 1000 + dice[0] * 100;
            } else {
                prize = 1000 + dice[1] * 100;
            }
        } else {
            // 모두 다른 눈인 경우
            prize = dice[2] * 100;
        }

        return prize;
    }
}
