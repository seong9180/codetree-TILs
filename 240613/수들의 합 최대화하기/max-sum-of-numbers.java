import java.util.Scanner;

public class Main {
    static int n;
    static int[][] grid;
    static boolean[] usedColumns;
    static int maxSum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        usedColumns = new boolean[n];
        maxSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        backtrack(0, 0);
        System.out.println(maxSum);
    }

    private static void backtrack(int row, int currentSum) {
        if (row == n) {
            maxSum = Math.max(maxSum, currentSum);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (!usedColumns[col]) {
                usedColumns[col] = true;
                backtrack(row + 1, currentSum + grid[row][col]);
                usedColumns[col] = false;
            }
        }
    }
}