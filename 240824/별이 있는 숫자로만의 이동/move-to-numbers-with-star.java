import java.util.*;

public class Main {
    static int N, K;
    static int[][] grid;
    static int[][] dp;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        grid = new int[N][N];
        dp = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
                dp[i][j] = -1;
            }
        }

        int maxSum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                maxSum = Math.max(maxSum, dfs(i, j));
            }
        }

        System.out.println(maxSum);
    }

    static int dfs(int x, int y) {
        if (dp[x][y] != -1) return dp[x][y];

        int maxSum = grid[x][y];
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int step = 1; step <= K; step++) {
                int nx = x + dx[i] * step;
                int ny = y + dy[i] * step;
                if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                    sum = Math.max(sum, dfs(nx, ny));
                } else {
                    break;
                }
            }
        }

        dp[x][y] = maxSum + sum;
        return dp[x][y];
    }
}