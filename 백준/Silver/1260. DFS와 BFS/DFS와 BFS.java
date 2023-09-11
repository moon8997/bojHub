import java.util.*;

public class Main {

	static int n;
	static int[][] map;
	static boolean[] visited;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt() + 1;
		int m = sc.nextInt();
		int fr = sc.nextInt();
		
		map = new int[n][n];
		visited = new boolean[n];
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			map[a][b] = map[b][a] = 1;
		}
		
		
		dfs(fr);
		
		visited = new boolean[n];
		System.out.println();
		
		bfs(fr);
		
		
		sc.close();
		
	}

	static void dfs(int fr) {
		
		System.out.print(fr + " ");
		visited[fr] = true;
		
		for(int to=1; to<n; to++) {
			if(!visited[to] && map[fr][to] ==1 ) {
				visited[to] = true;
				dfs(to);
			}
		}
		
	}
	
	static void bfs(int fr) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		
		visited[fr] = true;
		queue.add(fr);
		
		while(!queue.isEmpty()) {
			int current = queue.poll();
			System.out.print(current + " ");
			
			for(int to=1; to<n; to++) {
				if(!visited[to] && map[current][to] == 1) {
					visited[to] = true;
					queue.add(to);
				}
			}
			
		}
		
	}
	
	
}