import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        String[] arr = n.split("");
        
        int[] cnt = new int[10];

        for(int j=0; j<10; j++){
            for(int i=0; i<arr.length; i++){
                if(arr[i].equals(Integer.toString(j))){
                    cnt[j]++;
                }
            }
        }
        int a = cnt[6] + cnt[9];
        int b = (int)Math.ceil(a/(double)2);
        cnt[6] = 0;
        cnt[9] = b;

        Arrays.sort(cnt);


        System.out.println(cnt[cnt.length-1]);

    }
}
