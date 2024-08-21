import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] grid = new int[n][n];

        // 입력 받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        // 누적 합 배열 계산
        int[][] prefixSum = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                prefixSum[i][j] = grid[i - 1][j - 1] + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1];
            }
        }

        // 최대 합 계산
        int maxSum = Integer.MIN_VALUE;
        for (int x1 = 0; x1 < n; x1++) {
            for (int y1 = 0; y1 < n; y1++) {
                for (int x2 = x1; x2 < n; x2++) {
                    for (int y2 = y1; y2 < n; y2++) {
                        int sum = prefixSum[x2 + 1][y2 + 1] - prefixSum[x2 + 1][y1] - prefixSum[x1][y2 + 1] + prefixSum[x1][y1];
                        maxSum = Math.max(maxSum, sum);
                    }
                }
            }
        }

        System.out.println(maxSum);
    }
}