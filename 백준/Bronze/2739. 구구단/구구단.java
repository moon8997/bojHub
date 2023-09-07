import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 표준 입력에서 데이터를 읽기 위한 Scanner 객체 생성

        int n = sc.nextInt();
        int answer = 0;
        for(int i=1; i<=9; i++){
            answer = n*i;
            System.out.println(n + " * " + i +" = " + answer);
        }

    }
}