import java.util.*;

public class Main {
    static int n, k, u, d;
    static int[][] grid;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int maxCities = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        u = sc.nextInt();
        d = sc.nextInt();

        grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        dfs(new ArrayList<>(), 0, 0);
        System.out.println(maxCities);
    }

    static void dfs(List<int[]> selected, int startX, int startY) {
        if (selected.size() == k) {
            int totalCities = bfs(selected);
            maxCities = Math.max(maxCities, totalCities);
            return;
        }

        for (int i = startX; i < n; i++) {
            for (int j = (i == startX ? startY : 0); j < n; j++) {
                selected.add(new int[]{i, j});
                dfs(selected, i, j + 1);
                selected.remove(selected.size() - 1);
            }
        }
    }

    static int bfs(List<int[]> starts) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        int count = 0;

        for (int[] start : starts) {
            queue.offer(start);
            visited[start[0]][start[1]] = true;
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            count++;

            for (int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny]) {
                    int diff = Math.abs(grid[current[0]][current[1]] - grid[nx][ny]);
                    if (diff >= u && diff <= d) {
                        queue.offer(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }

        return count;
    }
}