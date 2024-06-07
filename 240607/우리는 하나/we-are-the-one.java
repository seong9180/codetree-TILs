import java.util.*;

public class Main {
    static int n, k, u, d;
    static int[][] grid;
    static boolean[][] visited;
    static int maxReachableCities = 0;

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

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

        List<Point> selectedCities = new ArrayList<>();
        selectCities(0, 0, selectedCities);

        System.out.println(maxReachableCities);
    }

    static void selectCities(int start, int count, List<Point> selectedCities) {
        if (count == k) {
            int reachable = calculateReachableCities(selectedCities);
            maxReachableCities = Math.max(maxReachableCities, reachable);
            return;
        }

        for (int i = start; i < n * n; i++) {
            int x = i / n;
            int y = i % n;
            selectedCities.add(new Point(x, y));
            selectCities(i + 1, count + 1, selectedCities);
            selectedCities.remove(selectedCities.size() - 1);
        }
    }

    static int calculateReachableCities(List<Point> selectedCities) {
        visited = new boolean[n][n];
        int reachableCount = 0;

        for (Point city : selectedCities) {
            if (!visited[city.x][city.y]) {
                reachableCount += dfs(city.x, city.y);
            }
        }

        return reachableCount;
    }

    static int dfs(int x, int y) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Stack<Point> stack = new Stack<>();
        stack.push(new Point(x, y));
        visited[x][y] = true;
        int count = 1;

        while (!stack.isEmpty()) {
            Point p = stack.pop();

            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny]) {
                    int heightDiff = Math.abs(grid[nx][ny] - grid[p.x][p.y]);
                    if (heightDiff >= u && heightDiff <= d) {
                        visited[nx][ny] = true;
                        stack.push(new Point(nx, ny));
                        count++;
                    }
                }
            }
        }

        return count;
    }
}