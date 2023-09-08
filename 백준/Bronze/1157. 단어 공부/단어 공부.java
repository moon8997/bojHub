import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase();

        int[] arr = new int[26];

        for(int i=0; i<s.length(); i++){
            int num = s.charAt(i) -'A';
            arr[num]++;
        }

        int max = 0;
        char answer = '?';
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
                answer = (char)(i+'A');
            } else if (max == arr[i]){
                answer = '?';
            }
        }
        System.out.println(answer);

    }
}