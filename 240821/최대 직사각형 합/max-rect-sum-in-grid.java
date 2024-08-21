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

        // Kadane's Algorithm을 이용한 최대 합 계산
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int[] kadaneSum = new int[n];
            for (int j = i; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    kadaneSum[k] += grid[j][k];
                }
                maxSum = Math.max(maxSum, kadaneMaxSum(kadaneSum));
            }
        }

        System.out.println(maxSum);
    }

    private static int kadaneMaxSum(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}