import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static int[][] cost;
    static int[][] dp;
    static final int INF = 100000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        cost = new int[n][n];
        dp = new int[n][1 << n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cost[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int result = tsp(0, 1);
        System.out.println(result);
    }

    static int tsp(int pos, int visited) {
        if (visited == (1 << n) - 1) {
            return cost[pos][0] == 0 ? INF : cost[pos][0];
        }

        if (dp[pos][visited] != -1) {
            return dp[pos][visited];
        }

        int minCost = INF;
        for (int i = 0; i < n; i++) {
            if ((visited & (1 << i)) == 0 && cost[pos][i] != 0) {
                int newCost = cost[pos][i] + tsp(i, visited | (1 << i));
                minCost = Math.min(minCost, newCost);
            }
        }

        dp[pos][visited] = minCost;
        return minCost;
    }
}