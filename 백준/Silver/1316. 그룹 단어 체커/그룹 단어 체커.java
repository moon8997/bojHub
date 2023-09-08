import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int cnt = 0;

        for(int i=0; i<n; i++){
            String s = sc.nextLine();

            if(groupWord(s)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static boolean groupWord(String s) {

        int[] count = new int[26];

        for(int i=0; i<s.length(); i++){
            char currentChar = s.charAt(i);
            if(count[currentChar - 'a'] > 0 && s.charAt(i-1) != currentChar){
                return false;
            }
            count[currentChar-'a']++;
        }

        return true;
    }
}
