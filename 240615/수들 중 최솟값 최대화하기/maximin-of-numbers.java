import java.util.Scanner;

public class Main {
    static int n;
    static int[][] grid;
    static boolean[] visited;
    static int[] rowToCol;
    static int maxMinValue;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        rowToCol = new int[n];
        visited = new boolean[n];
        maxMinValue = Integer.MIN_VALUE;

        solve(0);

        System.out.println(maxMinValue);
    }

    private static void solve(int row) {
        if (row == n) {
            int currentMin = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                currentMin = Math.min(currentMin, grid[i][rowToCol[i]]);
            }
            maxMinValue = Math.max(maxMinValue, currentMin);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (!visited[col]) {
                visited[col] = true;
                rowToCol[row] = col;
                solve(row + 1);
                visited[col] = false;
            }
        }
    }
}