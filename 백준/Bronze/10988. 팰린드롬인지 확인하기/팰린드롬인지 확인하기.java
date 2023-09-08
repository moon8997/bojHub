import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;

        String s = sc.nextLine();
        String temp = "";
        for(int i=s.length()-1;i>=0;i--){
            temp += s.charAt(i);
        }

        if(s.equals(temp)){
            answer =1;
        }

        System.out.println(answer);
    }
}