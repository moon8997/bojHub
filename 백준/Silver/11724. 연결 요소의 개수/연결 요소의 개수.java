import java.util.*;

public class Main {

    static int[][] map;
    static boolean[] visited;
    static int n;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt() + 1;

        int m = sc.nextInt();

        map = new int[n][n];
        visited = new boolean[n];

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            map[a][b] = map[b][a] = 1;

        }

        int answer = 0;

        for(int i=1; i<n;i++){
            if(!visited[i]){
                dfs(i);
                answer++;
            }

        }

        System.out.println(answer);

    }


    static void dfs(int fr){

        visited[fr] = true;

        for(int to=1; to<n; to++){
            if(!visited[to] && map[fr][to] == 1){
                dfs(to);
            }
        }

    }
}
