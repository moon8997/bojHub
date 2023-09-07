import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 표준 입력에서 데이터를 읽기 위한 Scanner 객체 생성

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        b = b+c;
        while(b>=60){
            a++;
            b= b-60;
        }

        if(a>=24)
            a = a-24;

        System.out.println(a + " " + b);
    }
}