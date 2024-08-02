import java.util.*;

public class Main {
    static int n, k;
    static int[][] grid;
    static int r1, c1, r2, c2;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int minTime = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        r1 = sc.nextInt() - 1;
        c1 = sc.nextInt() - 1;
        r2 = sc.nextInt() - 1;
        c2 = sc.nextInt() - 1;

        removeWalls(0, 0);

        System.out.println(minTime == Integer.MAX_VALUE ? -1 : minTime);
    }

    static void removeWalls(int count, int start) {
        if (count == k) {
            int time = bfs();
            if (time != -1) {
                minTime = Math.min(minTime, time);
            }
            return;
        }

        for (int i = start; i < n * n; i++) {
            int x = i / n;
            int y = i % n;
            if (grid[x][y] == 1) {
                grid[x][y] = 0;
                removeWalls(count + 1, i + 1);
                grid[x][y] = 1;
            }
        }
    }

    static int bfs() {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        queue.offer(new int[]{r1, c1, 0});
        visited[r1][c1] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1], time = current[2];

            if (x == r2 && y == c2) {
                return time;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny] && grid[nx][ny] == 0) {
                    queue.offer(new int[]{nx, ny, time + 1});
                    visited[nx][ny] = true;
                }
            }
        }

        return -1;
    }
}