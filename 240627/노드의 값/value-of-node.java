import java.util.*;

public class Main {
    static List<Integer>[] tree;
    static int[] values;
    static int[] subtreeSum;
    static boolean[] visited;
    static int operations = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        values = new int[n];
        subtreeSum = new int[n];
        visited = new boolean[n];
        tree = new ArrayList[n];
        
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            tree[u].add(v);
            tree[v].add(u);
        }

        dfs(0);

        System.out.println(operations);
    }

    private static int dfs(int node) {
        visited[node] = true;
        int total = values[node] - 1;  // We want each node to end up with value 1

        for (int neighbor : tree[node]) {
            if (!visited[neighbor]) {
                total += dfs(neighbor);
            }
        }

        operations += Math.abs(total); // Total operations needed for this subtree
        return total;
    }
}