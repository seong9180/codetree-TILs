import java.util.*;

public class Main {
    static List<List<Integer>> tree;
    static int[] values;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        values = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            values[i] = sc.nextInt();
        }
        
        tree = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }
        
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            tree.get(u).add(v);
            tree.get(v).add(u);
        }
        
        dp = new int[n + 1][2];
        dfs(1, 0);
        
        System.out.println(Math.max(dp[1][0], dp[1][1]));
    }
    
    static void dfs(int node, int parent) {
        dp[node][0] = 0;  // 현재 노드를 선택하지 않은 경우
        dp[node][1] = values[node];  // 현재 노드를 선택한 경우
        
        for (int child : tree.get(node)) {
            if (child != parent) {
                dfs(child, node);
                dp[node][0] += Math.max(dp[child][0], dp[child][1]);
                dp[node][1] += dp[child][0];
            }
        }
    }
}