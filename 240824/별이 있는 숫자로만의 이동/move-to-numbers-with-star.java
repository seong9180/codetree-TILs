import java.util.*;

public class Main {
    static int N, K;
    static int[][] grid;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        grid = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int maxSum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                maxSum = Math.max(maxSum, bfs(i, j));
            }
        }

        System.out.println(maxSum);
    }

    static int bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][N];
        queue.offer(new int[]{startX, startY, 0});
        visited[startX][startY] = true;

        int sum = grid[startX][startY];

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1], dist = current[2];

            if (dist == K) continue;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[nx][ny]) {
                    queue.offer(new int[]{nx, ny, dist + 1});
                    visited[nx][ny] = true;
                    sum += grid[nx][ny];
                }
            }
        }

        return sum;
    }
}