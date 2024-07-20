import java.util.*;

public class Main {
    static int N;
    static char[][] grid;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] coins;
    static int coinCount;
    static int startX, startY, endX, endY;
    static final int INF = 1000000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();
        
        grid = new char[N][N];
        coins = new int[10][2];
        coinCount = 0;

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
                    coins[grid[i][j] - '0'][0] = i;
                    coins[grid[i][j] - '0'][1] = j;
                    coinCount++;
                }
            }
        }

        int result = solve();
        System.out.println(result);
    }

    static int solve() {
        int minMoves = INF;
        for (int i = 1; i <= coinCount - 2; i++) {
            for (int j = i + 1; j <= coinCount - 1; j++) {
                for (int k = j + 1; k <= coinCount; k++) {
                    int moves = bfs(startX, startY, coins[i][0], coins[i][1]);
                    moves += bfs(coins[i][0], coins[i][1], coins[j][0], coins[j][1]);
                    moves += bfs(coins[j][0], coins[j][1], coins[k][0], coins[k][1]);
                    moves += bfs(coins[k][0], coins[k][1], endX, endY);
                    if (moves < minMoves) {
                        minMoves = moves;
                    }
                }
            }
        }
        return minMoves == INF ? -1 : minMoves;
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