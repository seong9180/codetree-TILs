import java.util.Scanner;

public class Main {
    private static int[][] grid;
    private static int[][] dp;
    private static int n;
    private static int[] dx = {-1, 1, 0, 0};  // 상하좌우 이동
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        grid = new int[n][n];
        dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
                dp[i][j] = -1;  // dp 배열 초기화
            }
        }

        int maxPathLength = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maxPathLength = Math.max(maxPathLength, dfs(i, j));
            }
        }

        System.out.println(maxPathLength);
    }

    private static int dfs(int x, int y) {
        // 이미 계산된 경우
        if (dp[x][y] != -1) {
            return dp[x][y];
        }

        dp[x][y] = 1;  // 최소 자기 자신을 포함하므로 1로 시작

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 격자 내에 있고, 증가하는 경우
            if (nx >= 0 && ny >= 0 && nx < n && ny < n && grid[nx][ny] > grid[x][y]) {
                dp[x][y] = Math.max(dp[x][y], 1 + dfs(nx, ny));
            }
        }

        return dp[x][y];
    }
}