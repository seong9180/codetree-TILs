import java.util.*;
import java.io.*;

public class Main {
    static int C, N;
    static int[] redStones;
    static int[][] blackStones;
    static ArrayList<Integer>[] graph;
    static int[] matched;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        
        redStones = new int[C];
        for (int i = 0; i < C; i++) {
            redStones[i] = Integer.parseInt(br.readLine());
        }
        
        blackStones = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            blackStones[i][0] = Integer.parseInt(st.nextToken());
            blackStones[i][1] = Integer.parseInt(st.nextToken());
        }
        
        graph = new ArrayList[C];
        for (int i = 0; i < C; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < C; i++) {
            for (int j = 0; j < N; j++) {
                if (blackStones[j][0] <= redStones[i] && redStones[i] <= blackStones[j][1]) {
                    graph[i].add(j);
                }
            }
        }
        
        matched = new int[N];
        Arrays.fill(matched, -1);
        
        int count = 0;
        for (int i = 0; i < C; i++) {
            visited = new boolean[N];
            if (dfs(i)) count++;
        }
        
        System.out.println(count);
    }
    
    static boolean dfs(int red) {
        for (int black : graph[red]) {
            if (visited[black]) continue;
            visited[black] = true;
            if (matched[black] == -1 || dfs(matched[black])) {
                matched[black] = red;
                return true;
            }
        }
        return false;
    }
}