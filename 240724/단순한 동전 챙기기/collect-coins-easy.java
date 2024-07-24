import java.util.*;

public class Main {

    static class State {
        int x, y, dist, coinsCollected, lastCoin;

        State(int x, int y, int dist, int coinsCollected, int lastCoin) {
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.coinsCollected = coinsCollected;
            this.lastCoin = lastCoin;
        }
    }

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        char[][] grid = new char[N][N];
        int startX = 0, startY = 0, endX = 0, endY = 0;

        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < N; j++) {
                grid[i][j] = line.charAt(j);
                if (grid[i][j] == 'S') {
                    startX = i;
                    startY = j;
                } else if (grid[i][j] == 'E') {
                    endX = i;
                    endY = j;
                }
            }
        }

        int result = bfs(grid, N, startX, startY, endX, endY);
        System.out.println(result);
    }

    private static int bfs(char[][] grid, int N, int startX, int startY, int endX, int endY) {
        boolean[][][][] visited = new boolean[N][N][10][10];
        Queue<State> queue = new LinkedList<>();
        queue.offer(new State(startX, startY, 0, 0, 0));
        visited[startX][startY][0][0] = true;

        while (!queue.isEmpty()) {
            State state = queue.poll();

            if (state.x == endX && state.y == endY && state.coinsCollected >= 3) {
                return state.dist;
            }

            for (int i = 0; i < 4; i++) {
                int nx = state.x + dx[i];
                int ny = state.y + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                    int newCoinsCollected = state.coinsCollected;
                    int newLastCoin = state.lastCoin;

                    if (Character.isDigit(grid[nx][ny])) {
                        int coinValue = grid[nx][ny] - '0';
                        if (coinValue == state.lastCoin + 1) {
                            newCoinsCollected++;
                            newLastCoin = coinValue;
                        }
                    }

                    if (!visited[nx][ny][newCoinsCollected][newLastCoin]) {
                        visited[nx][ny][newCoinsCollected][newLastCoin] = true;
                        queue.offer(new State(nx, ny, state.dist + 1, newCoinsCollected, newLastCoin));
                    }

                    // 상태를 방문하지 않는 경우도 큐에 추가
                    if (!visited[nx][ny][state.coinsCollected][state.lastCoin]) {
                        visited[nx][ny][state.coinsCollected][state.lastCoin] = true;
                        queue.offer(new State(nx, ny, state.dist + 1, state.coinsCollected, state.lastCoin));
                    }
                }
            }
        }

        return -1;
    }
}