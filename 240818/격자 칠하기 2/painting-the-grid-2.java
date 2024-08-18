import java.util.*;

public class Main {
    static int N;
    static int[][] grid;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        grid = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int left = 0, right = 1000000;
        while (left < right) {
            int mid = (left + right) / 2;
            if (canColorHalf(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(left);
    }

    static boolean canColorHalf(int D) {
        int halfCells = (N * N + 1) / 2;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (bfs(i, j, D) >= halfCells) {
                    return true;
                }
            }
        }
        return false;
    }

    static int bfs(int startX, int startY, int D) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][N];
        queue.offer(new int[]{startX, startY});
        visited[startX][startY] = true;
        int count = 1;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[nx][ny]) {
                    if (Math.abs(grid[nx][ny] - grid[startX][startY]) <= D) {
                        queue.offer(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        count++;
                    }
                }
            }
        }

        return count;
    }
}