import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println(maxSum(matrix, n));
    }
    
    public static int maxSum(int[][] matrix, int n) {
        int[][] cost = new int[n][n];
        int maxValue = Arrays.stream(matrix).flatMapToInt(Arrays::stream).max().getAsInt();
        
        // Convert the problem into a cost minimization problem
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cost[i][j] = maxValue - matrix[i][j];
            }
        }
        
        int[] result = hungarianAlgorithm(cost);
        
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            maxSum += matrix[i][result[i]];
        }
        
        return maxSum;
    }
    
    // Hungarian Algorithm implementation
    public static int[] hungarianAlgorithm(int[][] costMatrix) {
        int n = costMatrix.length;
        int[] u = new int[n + 1];
        int[] v = new int[n + 1];
        int[] p = new int[n + 1];
        int[] way = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            int[] minv = new int[n + 1];
            boolean[] used = new boolean[n + 1];
            Arrays.fill(minv, Integer.MAX_VALUE);
            Arrays.fill(used, false);
            int j0 = 0;
            p[0] = i;
            do {
                used[j0] = true;
                int i0 = p[j0], delta = Integer.MAX_VALUE, j1 = 0;
                for (int j = 1; j <= n; j++) {
                    if (!used[j]) {
                        int cur = costMatrix[i0 - 1][j - 1] - u[i0] - v[j];
                        if (cur < minv[j]) {
                            minv[j] = cur;
                            way[j] = j0;
                        }
                        if (minv[j] < delta) {
                            delta = minv[j];
                            j1 = j;
                        }
                    }
                }
                for (int j = 0; j <= n; j++) {
                    if (used[j]) {
                        u[p[j]] += delta;
                        v[j] -= delta;
                    } else {
                        minv[j] -= delta;
                    }
                }
                j0 = j1;
            } while (p[j0] != 0);
            do {
                int j1 = way[j0];
                p[j0] = p[j1];
                j0 = j1;
            } while (j0 != 0);
        }
        
        int[] result = new int[n];
        for (int j = 1; j <= n; j++) {
            result[p[j] - 1] = j - 1;
        }
        return result;
    }
}