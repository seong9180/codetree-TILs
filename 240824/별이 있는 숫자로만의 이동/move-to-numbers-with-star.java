import java.util.*;

public class Main {
    static int N, K;
    static int[][] grid;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int sum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        grid = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int maxSum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                clearVisited();
                sum = 0;
                dfs(i, j, 0);
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }

    static void dfs(int x, int y, int dist) {
        if (x < 0 || x >= N || y < 0 || y >= N || visited[x][y] || dist > K) {
            return;
        }

        visited[x][y] = true;
        sum += grid[x][y];

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            dfs(nx, ny, dist + 1);
        }
    }

    static void clearVisited() {
        for (int i = 0; i < N; i++) {
            Arrays.fill(visited[i], false);
        }
    }
}