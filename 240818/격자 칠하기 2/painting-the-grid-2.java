import java.util.*;

public class Main {
    static int N;
    static int[][] grid;
    static int[][] minD;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        grid = new int[N][N];
        minD = new int[N*N][N*N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        // Initialize minD
        for (int i = 0; i < N*N; i++) {
            Arrays.fill(minD[i], Integer.MAX_VALUE);
            minD[i][i] = 0;
        }

        // Calculate initial minD values
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                for (int k = 0; k < 4; k++) {
                    int nx = x + dx[k];
                    int ny = y + dy[k];
                    if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                        int i = x * N + y;
                        int j = nx * N + ny;
                        minD[i][j] = Math.abs(grid[x][y] - grid[nx][ny]);
                    }
                }
            }
        }

        // Floyd-Warshall
        for (int k = 0; k < N*N; k++) {
            for (int i = 0; i < N*N; i++) {
                for (int j = 0; j < N*N; j++) {
                    if (minD[i][k] != Integer.MAX_VALUE && minD[k][j] != Integer.MAX_VALUE) {
                        minD[i][j] = Math.min(minD[i][j], Math.max(minD[i][k], minD[k][j]));
                    }
                }
            }
        }

        int result = Integer.MAX_VALUE;
        int threshold = (N * N + 1) / 2;

        for (int i = 0; i < N*N; i++) {
            int[] counts = new int[1000001];
            for (int j = 0; j < N*N; j++) {
                if (minD[i][j] != Integer.MAX_VALUE) {
                    counts[minD[i][j]]++;
                }
            }

            int sum = 0;
            for (int d = 0; d <= 1000000; d++) {
                sum += counts[d];
                if (sum >= threshold) {
                    result = Math.min(result, d);
                    break;
                }
            }
        }

        System.out.println(result);
    }
}