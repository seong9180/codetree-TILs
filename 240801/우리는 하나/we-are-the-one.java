import java.util.*;

public class Main {
    static int n, k, u, d;
    static int[][] grid;
    static boolean[][] visited;
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

        backtrack(new ArrayList<>(), 0, 0);
        System.out.println(maxCities);
    }

    static void backtrack(List<int[]> selectedCities, int start, int count) {
        if (count == k) {
            maxCities = Math.max(maxCities, countReachableCities(selectedCities));
            return;
        }

        for (int i = start; i < n * n; i++) {
            int x = i / n;
            int y = i % n;
            selectedCities.add(new int[]{x, y});
            backtrack(selectedCities, i + 1, count + 1);
            selectedCities.remove(selectedCities.size() - 1);
        }
    }

    static int countReachableCities(List<int[]> startCities) {
        visited = new boolean[n][n];
        Queue<int[]> queue = new LinkedList<>();

        for (int[] city : startCities) {
            visited[city[0]][city[1]] = true;
            queue.offer(city);
        }

        int count = startCities.size();

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny]) {
                    int heightDiff = Math.abs(grid[nx][ny] - grid[current[0]][current[1]]);
                    if (heightDiff >= u && heightDiff <= d) {
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                        count++;
                    }
                }
            }
        }

        return count;
    }
}