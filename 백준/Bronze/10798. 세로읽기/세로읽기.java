import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] array = new String[5][15];

        // 공백 문자로 배열 초기화
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                array[i][j] = " ";
            }
        }

        int maxLength = 0;

        for(int i=0; i<5; i++){
            String s = sc.nextLine();
            maxLength = Math.max(maxLength, s.length());
            for(int j=0; j<s.length(); j++){
                array[i][j] = String.valueOf(s.charAt(j));
            }
        }

        String answer = "";

        for(int j=0; j<maxLength; j++){
            for(int i=0; i<5; i++){
                answer += array[i][j];
            }
        }

        System.out.println(answer.replaceAll(" ",""));
    }
}
