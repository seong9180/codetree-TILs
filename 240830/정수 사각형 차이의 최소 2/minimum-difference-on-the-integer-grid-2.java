import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        
        // 격자 입력 받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        
        // DP를 위한 3차원 배열 초기화
        // dp[i][j][0]: 최소값, dp[i][j][1]: 최대값
        int[][][] dp = new int[n][n][2];
        
        // 초기값 설정
        dp[0][0][0] = dp[0][0][1] = grid[0][0];
        
        // 첫 번째 행 초기화
        for (int j = 1; j < n; j++) {
            dp[0][j][0] = Math.min(dp[0][j-1][0], grid[0][j]);
            dp[0][j][1] = Math.max(dp[0][j-1][1], grid[0][j]);
        }
        
        // 첫 번째 열 초기화
        for (int i = 1; i < n; i++) {
            dp[i][0][0] = Math.min(dp[i-1][0][0], grid[i][0]);
            dp[i][0][1] = Math.max(dp[i-1][0][1], grid[i][0]);
        }
        
        // DP 진행
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int minFromTop = Math.min(dp[i-1][j][0], grid[i][j]);
                int maxFromTop = Math.max(dp[i-1][j][1], grid[i][j]);
                int diffFromTop = maxFromTop - minFromTop;
                
                int minFromLeft = Math.min(dp[i][j-1][0], grid[i][j]);
                int maxFromLeft = Math.max(dp[i][j-1][1], grid[i][j]);
                int diffFromLeft = maxFromLeft - minFromLeft;
                
                if (diffFromTop <= diffFromLeft) {
                    dp[i][j][0] = minFromTop;
                    dp[i][j][1] = maxFromTop;
                } else {
                    dp[i][j][0] = minFromLeft;
                    dp[i][j][1] = maxFromLeft;
                }
            }
        }
        
        // 결과 출력
        System.out.println(dp[n-1][n-1][1] - dp[n-1][n-1][0]);
        
        sc.close();
    }
}