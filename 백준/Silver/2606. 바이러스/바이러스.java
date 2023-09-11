import java.util.*;

public class Main {

	static int n;
	static int[][] map;
	static boolean[] visited;
	static int cnt = 0;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt() + 1;
		int m = sc.nextInt();
		int fr = 1;
		
		map = new int[n][n];
		visited = new boolean[n];
		
		
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			map[a][b] = map[b][a] = 1;
		}

		int cnt = dfs(fr);
		
		System.out.println(cnt);
	}
	
	static int dfs(int fr) {
		
		
		visited[fr] = true;
		
		for(int to=1; to<n; to++) {
			if(!visited[to] && map[fr][to] == 1) {
				cnt++;
				dfs(to);
			}
		}
		
		
		return cnt;
	}
	
}