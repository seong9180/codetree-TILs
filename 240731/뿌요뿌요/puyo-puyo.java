import java.util.*;

public class Main {
    static int n;
    static int[][] grid;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int blockCount = 0;
    static int maxBlockSize = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    int size = dfs(i, j, grid[i][j]);
                    if (size >= 4) {
                        blockCount++;
                    }
                    maxBlockSize = Math.max(maxBlockSize, size);
                }
            }
        }

        System.out.println(blockCount + " " + maxBlockSize);
    }

    static int dfs(int x, int y, int value) {
        if (x < 0 || x >= n || y < 0 || y >= n || visited[x][y] || grid[x][y] != value) {
            return 0;
        }

        visited[x][y] = true;
        int size = 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            size += dfs(nx, ny, value);
        }

        return size;
    }
}