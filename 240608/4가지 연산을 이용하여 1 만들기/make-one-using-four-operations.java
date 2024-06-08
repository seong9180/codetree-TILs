import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        
        // BFS를 위한 큐 생성
        Queue<Integer> queue = new LinkedList<>();
        // 최소 연산 횟수를 저장할 배열 생성
        int[] dp = new int[N + 1];
        
        // 배열 초기화
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[N] = 0;
        
        queue.add(N);
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            
            if (current == 1) {
                System.out.println(dp[current]);
                return;
            }
            
            if (current - 1 > 0 && dp[current - 1] > dp[current] + 1) {
                dp[current - 1] = dp[current] + 1;
                queue.add(current - 1);
            }
            
            if (current + 1 <= N && dp[current + 1] > dp[current] + 1) {
                dp[current + 1] = dp[current] + 1;
                queue.add(current + 1);
            }
            
            if (current % 2 == 0 && dp[current / 2] > dp[current] + 1) {
                dp[current / 2] = dp[current] + 1;
                queue.add(current / 2);
            }
            
            if (current % 3 == 0 && dp[current / 3] > dp[current] + 1) {
                dp[current / 3] = dp[current] + 1;
                queue.add(current / 3);
            }
        }
    }
}