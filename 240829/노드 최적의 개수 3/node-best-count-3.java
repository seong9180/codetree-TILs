import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer>[] tree;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        tree = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < n-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            tree[u].add(v);
            tree[v].add(u);
        }
        
        dp = new int[n+1][3];
        dfs(1, 0);
        
        System.out.println(Math.min(dp[1][1], dp[1][2]));
    }
    
    static void dfs(int node, int parent) {
        dp[node][0] = 0;  // 부모가 물건을 가지고 있는 경우
        dp[node][1] = 1;  // 현재 노드에 물건을 놓은 경우
        dp[node][2] = Integer.MAX_VALUE;  // 자식 중 하나가 물건을 가지고 있는 경우
        
        int childSum = 0;
        int minDiff = Integer.MAX_VALUE;
        
        for (int child : tree[node]) {
            if (child != parent) {
                dfs(child, node);
                
                childSum += Math.min(dp[child][1], dp[child][2]);
                minDiff = Math.min(minDiff, dp[child][1] - Math.min(dp[child][1], dp[child][2]));
                
                dp[node][0] += Math.min(dp[child][1], dp[child][2]);
                dp[node][1] += Math.min(Math.min(dp[child][0], dp[child][1]), dp[child][2]);
            }
        }
        
        dp[node][2] = childSum;
        if (minDiff != Integer.MAX_VALUE) {
            dp[node][2] += minDiff;
        }
    }
}