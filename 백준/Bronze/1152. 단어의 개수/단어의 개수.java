import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println(0);
        } else {
            String[] array = s.split(" ");
            int answer = array.length;
            System.out.println(answer);
        }


    }
}