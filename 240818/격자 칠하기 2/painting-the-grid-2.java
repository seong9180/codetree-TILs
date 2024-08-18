import java.util.*;

public class Main {
    static int N;
    static int[][] grid;
    static int[] parent;
    static int[] size;

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
            int mid = left + (right - left) / 2;
            if (canColorHalf(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(left);
    }

    static boolean canColorHalf(int D) {
        parent = new int[N * N];
        size = new int[N * N];
        for (int i = 0; i < N * N; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        int[] dx = {1, 0};
        int[] dy = {0, 1};

        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                for (int k = 0; k < 2; k++) {
                    int nx = x + dx[k];
                    int ny = y + dy[k];
                    if (nx < N && ny < N) {
                        if (Math.abs(grid[x][y] - grid[nx][ny]) <= D) {
                            union(x * N + y, nx * N + ny);
                        }
                    }
                }
            }
        }

        int maxSize = 0;
        for (int i = 0; i < N * N; i++) {
            if (find(i) == i) {
                maxSize = Math.max(maxSize, size[i]);
            }
        }

        return maxSize >= (N * N + 1) / 2;
    }

    static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x != y) {
            if (size[x] < size[y]) {
                int temp = x;
                x = y;
                y = temp;
            }
            parent[y] = x;
            size[x] += size[y];
        }
    }
}