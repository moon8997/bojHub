import java.util.*;

public class Main {

    static int[] map;
    static boolean[] visited;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0; i<t; i++){

            int cnt = 0;

            int n = sc.nextInt()+1;

            map = new int[n];

            for(int j=1; j<n; j++){
                int a = sc.nextInt();
                map[j] = a;
            }

            visited = new boolean[n];

            for(int j=1; j<n; j++){
                if(!visited[j]){
                    dfs(j);
                    cnt++;
                }
            }
            System.out.println(cnt);
        }


    }

    static void dfs(int fr){
        visited[fr] = true;
        int next = map[fr];
        if(!visited[next]) {
            dfs(map[fr]);
        }
    }

}
