import java.util.*;

public class Main {
    private static int n;
    private static int[][] cost;
    private static boolean[] visited;
    private static int minCost = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        cost = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cost[i][j] = scanner.nextInt();
            }
        }

        visited[0] = true; // 시작 지점 방문 표시
        dfs(0, 0, 0, 1); // 시작 지점부터 탐색 시작

        System.out.println(minCost);
    }

    private static void dfs(int current, int currentCost, int start, int count) {
        if (count == n) { // 모든 지점을 방문한 경우
            if (cost[current][start] != 0) {
                minCost = Math.min(minCost, currentCost + cost[current][start]);
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i] && cost[current][i] != 0) {
                visited[i] = true;
                dfs(i, currentCost + cost[current][i], start, count + 1);
                visited[i] = false;
            }
        }
    }
}