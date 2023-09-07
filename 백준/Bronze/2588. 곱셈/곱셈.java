import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 표준 입력에서 데이터를 읽기 위한 Scanner 객체 생성

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] digits = Stream.of(String.valueOf(b).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        for(int i=1; i<=digits.length; i++){
            System.out.println(a*digits[digits.length-i]);
        }

        System.out.println(a*b);

    }
}
