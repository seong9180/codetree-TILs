import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        
        // 최소 연산 횟수를 저장할 배열 생성
        int[] dp = new int[N + 1];
        
        // dp 배열을 초기화
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 0; // 숫자 1을 1로 만드는 데 필요한 연산 횟수는 0
        
        // 동적 프로그래밍을 통해 최소 연산 횟수를 계산
        for (int i = 1; i < N; i++) {
            if (i + 1 <= N) {
                dp[i + 1] = Math.min(dp[i + 1], dp[i] + 1);
            }
            if (i * 2 <= N) {
                dp[i * 2] = Math.min(dp[i * 2], dp[i] + 1);
            }
            if (i * 3 <= N) {
                dp[i * 3] = Math.min(dp[i * 3], dp[i] + 1);
            }
        }
        
        // 결과 출력
        System.out.println(dp[N]);
    }
}