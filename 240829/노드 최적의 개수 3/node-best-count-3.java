import java.io.*;
import java.util.*;

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

        dp = new int[n+1][2];
        dfs(1, 0);

        System.out.println(Math.min(dp[1][0], dp[1][1]));
    }

    static void dfs(int node, int parent) {
        dp[node][0] = 0;  // 현재 노드에 물건을 놓지 않는 경우
        dp[node][1] = 1;  // 현재 노드에 물건을 놓는 경우

        for (int child : tree[node]) {
            if (child != parent) {
                dfs(child, node);
                dp[node][0] += dp[child][1];  // 자식 노드에는 반드시 물건을 놓아야 함
                dp[node][1] += Math.min(dp[child][0], dp[child][1]);  // 자식 노드에 물건을 놓아도 되고 안 놓아도 됨
            }
        }
    }
}