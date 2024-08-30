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
        // dp[i][j]는 (i,j)까지의 경로에서 가능한 (최소값, 최대값) 쌍의 집합
        ArrayList<int[]>[][] dp = new ArrayList[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = new ArrayList<>();
            }
        }
        
        // 시작점 초기화
        dp[0][0].add(new int[]{grid[0][0], grid[0][0]});
        
        // DP 진행
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0) {
                    updateDP(dp[i][j], dp[i-1][j], grid[i][j]);
                }
                if (j > 0) {
                    updateDP(dp[i][j], dp[i][j-1], grid[i][j]);
                }
            }
        }
        
        // 결과 계산
        int minDiff = Integer.MAX_VALUE;
        for (int[] pair : dp[n-1][n-1]) {
            minDiff = Math.min(minDiff, pair[1] - pair[0]);
        }
        
        // 결과 출력
        System.out.println(minDiff);
        
        sc.close();
    }
    
    private static void updateDP(ArrayList<int[]> current, ArrayList<int[]> previous, int value) {
        for (int[] pair : previous) {
            int newMin = Math.min(pair[0], value);
            int newMax = Math.max(pair[1], value);
            addNewPair(current, newMin, newMax);
        }
    }
    
    private static void addNewPair(ArrayList<int[]> list, int min, int max) {
        // 새로운 쌍이 기존의 쌍보다 항상 더 좋은 경우에만 추가
        for (int i = 0; i < list.size(); i++) {
            int[] existingPair = list.get(i);
            if (min <= existingPair[0] && max <= existingPair[1]) {
                list.set(i, new int[]{min, max});
                return;
            }
            if (min >= existingPair[0] && max >= existingPair[1]) {
                return;
            }
        }
        list.add(new int[]{min, max});
    }
}