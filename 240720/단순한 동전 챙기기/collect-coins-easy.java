import java.util.*;

public class Main {
    static int N;
    static char[][] grid;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static List<int[]> coins;
    static int startX, startY, endX, endY;
    static final int INF = 1000000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();
        
        grid = new char[N][N];
        coins = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < N; j++) {
                grid[i][j] = line.charAt(j);
                if (grid[i][j] == 'S') {
                    startX = i;
                    startY = j;
                } else if (grid[i][j] == 'E') {
                    endX = i;
                    endY = j;
                } else if (Character.isDigit(grid[i][j])) {
                    coins.add(new int[]{i, j, grid[i][j] - '0'});
                }
            }
        }

        Collections.sort(coins, (a, b) -> a[2] - b[2]);

        int result = solve();
        System.out.println(result);
    }

    static int solve() {
        int[][] dist = new int[coins.size() + 2][coins.size() + 2];
        for (int i = 0; i < dist.length; i++) {
            Arrays.fill(dist[i], INF);
        }

        // Calculate distances between all points
        dist[0][coins.size() + 1] = bfs(startX, startY, endX, endY);
        for (int i = 0; i < coins.size(); i++) {
            dist[0][i + 1] = bfs(startX, startY, coins.get(i)[0], coins.get(i)[1]);
            dist[i + 1][coins.size() + 1] = bfs(coins.get(i)[0], coins.get(i)[1], endX, endY);
            for (int j = i + 1; j < coins.size(); j++) {
                dist[i + 1][j + 1] = dist[j + 1][i + 1] = bfs(coins.get(i)[0], coins.get(i)[1], coins.get(j)[0], coins.get(j)[1]);
            }
        }

        return dfs(0, 0, 1 << (coins.size() + 1), dist);
    }

    static int dfs(int current, int collected, int visited, int[][] dist) {
        if (collected >= 3 && current == coins.size() + 1) {
            return 0;
        }
        
        int result = INF;
        for (int next = 1; next <= coins.size() + 1; next++) {
            if (next == current || (visited & (1 << next)) != 0) continue;
            if (next < coins.size() + 1 && current > 0 && coins.get(next - 1)[2] < coins.get(current - 1)[2]) continue;
            
            int newCollected = collected + (next <= coins.size() ? 1 : 0);
            int newVisited = visited | (1 << next);
            int subResult = dfs(next, newCollected, newVisited, dist);
            if (subResult != INF) {
                result = Math.min(result, subResult + dist[current][next]);
            }
        }
        return result;
    }

    static int bfs(int startX, int startY, int endX, int endY) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][N];
        queue.offer(new int[]{startX, startY, 0});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1], moves = current[2];

            if (x == endX && y == endY) {
                return moves;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[nx][ny]) {
                    queue.offer(new int[]{nx, ny, moves + 1});
                    visited[nx][ny] = true;
                }
            }
        }
        return INF;
    }
}