import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 표준 입력에서 데이터를 읽기 위한 Scanner 객체 생성

        double a = sc.nextInt();
        double b = sc.nextInt();
        
        double c = a/b;
        
        System.out.println(c);

    }

}