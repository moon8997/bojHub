import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 표준 입력에서 데이터를 읽기 위한 Scanner 객체 생성

        int h = sc.nextInt();
        int m = sc.nextInt();

        if(m-45 >= 0) {
            System.out.println(h + " " + (m-45));
        } else if(m-45 < 0 && h != 0){
            System.out.println((h-1) + " " + (15+m));
        } else if(m-45 < 0 && h == 0){
            System.out.println("23 " + (15+m));
        }

    }
}
