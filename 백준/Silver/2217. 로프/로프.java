import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] rope = new int[n];
        for(int i=0; i<n; i++){
            rope[i] = sc.nextInt();
        }

        Arrays.sort(rope);

        int answer = rope[rope.length-1];
        int temp = rope[rope.length-1];

        for(int i=0; i<rope.length; i++){
            temp = Math.max((rope[rope.length-(1+i)])*(1+i), temp);
            if(answer > temp)
                break;
            answer = temp;
        }

        System.out.println(answer);

    }
}